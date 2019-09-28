package com.example.pitneybowes;

public class Information {
    private double lat;
    private double lng;

    public Information(){
    }
    public Information(double lat,double lng){
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }
    public double getLng() {
        return lng;
    }


}
