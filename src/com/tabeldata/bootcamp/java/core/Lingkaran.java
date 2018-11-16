package com.tabeldata.bootcamp.java.core;

public class Lingkaran{
    public static void main(String[] args) {
        Double jariJari = 15.0;
        Double diameter = jariJari * 2;

        //Hitung keliling lingkaran
        Double keliling = Math.PI * diameter;
        System.out.println("Nilai PI " + Math.PI + ", maka kelilingnya adalah " + keliling);
    }
}