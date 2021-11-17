package model;

public class VietinBank extends Bank{
    private String service;
    private String promotion;

    public VietinBank(String service, String promotion) {
        this.service = service;
        this.promotion = promotion;
    }


    @Override
    public String getService() {
        return this.service;
    }

    @Override
    public String getPromotion() {
        return this.promotion;
    }
}
