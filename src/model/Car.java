package model;

public abstract class Car {
    public abstract String getName();
    public abstract double getPrice();
    public abstract String getConfig();
    public abstract String getProducer();
    public abstract String getFeature();

    @Override
    public String toString(){
        return "Name= "+this.getName()+", Price="+this.getPrice()+"," +
                " Config="+this.getConfig() + "," +
        "Producer="+this.getProducer()+ "," + "Feature="+this.getFeature();
    }
}
