package com.juaracoding.bangundatar;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Kotak kotak = new Kotak();
        kotak.luas();
        kotak.draw();

        Segitiga segitiga = new Segitiga();
        segitiga.luas();
        segitiga.draw();

        List<String> car = new ArrayList<>();
        car.add("Toyota");
        car.add("Honda");
        car.add("Mitsubisi");
        System.out.println(car.get(1));
        for (String listCar:car) {
            System.out.println(listCar);
        }

    }
}
