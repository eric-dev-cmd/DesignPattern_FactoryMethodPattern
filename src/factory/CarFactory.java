package factory;

import model.Car;
import model.Honda;
import model.Nexus;
import model.Toyota;

public class CarFactory {
    public static Car getCar(String type, String name, double price, String config, String producer, String feature){
        if("Honda".equalsIgnoreCase(type)) return new Honda(name, price, config, producer, feature);
        else if("Nexus".equalsIgnoreCase(type)) return new Nexus(name, price, config, producer, feature);
        else if("Toyota".equalsIgnoreCase(type)) return new Toyota(name, price, config, producer, feature);
        return null;
    }
}
