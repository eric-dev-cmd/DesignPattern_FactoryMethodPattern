package test;

import factory.BankFactory;
import model.Bank;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println("===== Bank =====");
        Bank acb = BankFactory.getBank("acb", "Service ACB", "Promotion ACB");
        Bank sacombank = BankFactory.getBank("sacombank", "Service ACB", "Promotion Sacombank");
        Bank vietinbank = BankFactory.getBank("vietinbank", "Service ACB", "Promotion Vietinbank");
        System.out.println("Bank");
        System.out.println("Factory ACB::"+acb);
        System.out.println("Factory Sacombank::"+sacombank);
        System.out.println("Factory Vietinbank ::"+vietinbank);
    }

}
