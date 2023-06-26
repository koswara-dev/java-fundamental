package com.juaracoding;

public class Method {
    public static void main(String[] args) {
        int sisi = 10;
        double luas = hitungKotak(5);
        System.out.println(luas);
        System.out.println(hitungKotak(sisi));
        drawKotak(5);
        drawKotak(sisi);
        Math.random();
        Math.pow(2,3);
        System.out.println(isResult("Java"));
    }

    static int hitungKotak(int sisi){
        return sisi*sisi;
    }
    static void drawKotak(int sisi){
        for (int i = 1; i <= sisi; i++) {
            for (int j = 1; j <= sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static boolean isResult(String nama){
        return nama.equals("Java");
    }
}
