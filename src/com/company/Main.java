package com.company;

public class Main {

    public static void main(String[] args) {

        BujurSangkar persegi1=new BujurSangkar();
        Lingkaran lingkaran1=new Lingkaran();

        persegi1.setSisi(10);
        persegi1.hitungKeliling();

        lingkaran1.setRadius(50);
        lingkaran1.hitungKeliling();

        System.out.println();
        System.out.println("-----");
        System.out.println("Panjang sisi Bujur sangkar : "+persegi1.getSisi()+" cm");
        System.out.println("Keliling Bujur sangkar : "+persegi1.getKeliling()+" cm");
        System.out.println("-----");
        System.out.println("Jari-jari lingkaran : "+lingkaran1.getRadius()+" cm");
        System.out.println("Keliling lingkaran : "+lingkaran1.getKeliling()+" cm");

    }
}