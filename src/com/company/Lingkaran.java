package com.company;

public class Lingkaran {

    private int radius;
    private double keliling;
    private double phi=3.14;

    public void hitungKeliling(){
        keliling=2*phi*radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getKeliling() {
        return keliling;
    }
}
