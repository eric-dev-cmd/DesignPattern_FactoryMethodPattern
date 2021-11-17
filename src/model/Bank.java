package model;

public abstract class Bank {
    public abstract String getService();
    public abstract String getPromotion();

    @Override
    public String toString(){
        return "Service= "+this.getService()+"Promotion= "+this.getPromotion();
    }
}
