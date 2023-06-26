package com.juaracoding;

public class Test {
    public static void main(String[] args) {
        // 5, 6, 3, 4, 2
        // Array, tiap index dibandingkan, butuh looping, tampilkan angka terbesar, variable angkaTerbesar
        int angka[] = { 5, 6, 3, 4, 7 };
        // System.out.println(angka[0]);
        // boolean kondisi = angka[0] > angka[1];
        int angkaTerbesar = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > angkaTerbesar){ // 1) 5 > 5, 2) 6 > 5, 3) 3 > 6
                angkaTerbesar = angka[i];
            }
        }
        System.out.println("Angka terbesar = "+angkaTerbesar);

        String kota[] = { "Bandung", "Jakarta", "Surabaya", "Pontianak", "Medan" };
        System.out.println(kota[0].length());
        kataTerpanjang(kota);
    }

    public static void kataTerpanjang(String kata[]){
        String max = kata[0];
        for (int i = 0; i < kata.length; i++) {
            if(kata[i].length() > max.length()){
                max = kata[i];
            }
        }
        System.out.println("Kata terpanjang = "+max);
    }
}
