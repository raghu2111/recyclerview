package com.example.bikeview.model;

public class bikeModel {

    String bikeName;
    int bikeImage,bikePrice;

    public bikeModel(String bikeName, int bikeImage, int bikePrice) {
        this.bikeName = bikeName;
        this.bikeImage = bikeImage;
        this.bikePrice = bikePrice;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public int getBikeImage() {
        return bikeImage;
    }

    public void setBikeImage(int bikeImage) {
        this.bikeImage = bikeImage;
    }

    public int getBikePrice() {
        return bikePrice;
    }

    public void setBikePrice(int bikePrice) {
        this.bikePrice = bikePrice;
    }
}
