package com.juaracoding;

public class JavaArray {
    public static void main(String[] args) {

        int[] angka = {1,2,3,4,5};
                     //0 1 2 3 4 (index)
        System.out.println(angka[2]);

        int num[] = new int[4];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        System.out.println(num[2]);

        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]);
        }
        System.out.println();
        for (int listAngka:angka) {
            System.out.print(listAngka);
        }

    }
}
