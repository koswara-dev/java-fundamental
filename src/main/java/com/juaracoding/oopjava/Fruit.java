package com.juaracoding.oopjava;

import java.util.Date;

public class Fruit {

    String name;

    public Fruit(){ //Constructor
        name = "Jeruk";
    }

    public Fruit(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Date date = new Date(1000); // instance object
        System.out.println(date);
        Fruit fruit = new Fruit("Semangka");
        Fruit fruitDua = new Fruit("Anggur");
        System.out.println(fruit.name);
        System.out.println(fruitDua.name);
    }
}
