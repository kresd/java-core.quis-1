package com.tabeldata.bootcamp.java.core;

public class Persegi{
    public static void main(String[] args) {
        Double sisi = 50.0;

        //Hitung Luas Persegi
        Double luas = Math.pow(sisi, 2);
        
        System.out.println("Dengan sisi 50cm maka luas persegi tersebut adalah "+ (int)(luas/100) + "m");
    }
}