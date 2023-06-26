package com.juaracoding;

public class LoopingFor {
    public static void main(String[] args) {
        String nama = "juara";
        System.out.println("Lenght: " + nama.length());
        for (int i = 0; i < nama.length(); i++) { // 4 < 5
            System.out.println(i);
        }
        // 4 3 2 1 0
        for (int i = 4; i >= 0; i--) { // 0 >= 0
            System.out.print(i + " ");
        }
        System.out.println();

        //Deret bil ganjil
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        // kotak
        int sisi = 5;
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        // segitiga siku
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // segtiga siku atas kanan
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = sisi; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
