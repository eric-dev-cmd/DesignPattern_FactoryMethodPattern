package model;

public class Honda extends  Car{
    private String name;
    private double price;
    private String config;
    private String producer;
    private String feature;

    public Honda(String name, double price, String config, String producer, String feature) {
        this.name = name;
        this.price = price;
        this.config = config;
        this.producer = producer;
        this.feature = feature;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getConfig() {
        return this.config;
    }

    @Override
    public String getProducer() {
        return this.producer;
    }

    @Override
    public String getFeature() {
        return this.feature;
    }
}
