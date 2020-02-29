package com.example.objects;

import java.util.ArrayList;

public class Main {
    static ArrayList<car> samochod = new ArrayList<>();

    public static void main(String[] args) {

        samochod.add(new car("Volkswagen", "Golf", 1100, 80, 9) {
            @Override
            String informacje() {
                return marka;
            }
        });
        samochod.add(new car("Volkswagen", "Passat", 1500, 140, 11) {
            @Override
            String informacje() {
                return marka;
            }
        });
+++
        for (car c1 : samochod){
            c1.print();
            System.out.println("-------------------");
        }
    }

}
