package factory;

import model.*;

public class BankFactory {
    public static Bank getBank(String type, String service, String promotion){
        if("ACB".equalsIgnoreCase(type)) return new ACB(service, promotion);
        else if("Sacombank".equalsIgnoreCase(type)) return new Sacombank(service, promotion);
        else if("VietinBank".equalsIgnoreCase(type)) return new VietinBank(service, promotion);
        return null;
    }
}
