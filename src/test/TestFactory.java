package test;

import factory.CarFactory;
import model.Car;

public class TestFactory {
    public static void main(String[] args) {
        System.out.println("===== Car =====");
        Car honda = CarFactory.getCar("honda", "Name Honda 1", 200000, "Config Perfect 1", "Honda Jpan", "Feature 1");
        Car nexus = CarFactory.getCar("nexus", "Name Nexus 2", 300000.22, "Config Perfect 2", "Nexus Jpan", "Feature 2");
        Car toyota = CarFactory.getCar("toyota", "Name Toyota 3", 400.20000, "Config Perfect 3", "Toyota Jpan", "Feature 3");
        System.out.println("Bank");
        System.out.println("Factory Honda Config::"+honda);
        System.out.println("Factory Nexus Config::"+nexus);
        System.out.println("Factory Toyota Config::"+toyota);
    }

}
