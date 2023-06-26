package com.juaracoding;

public class SortingJava {
    public static void main(String[] args) {
        String[] buah = {"apel", "mangga", "jeruk bali", "kiwi", "pisang"};

        String buahTerpanjang = buah[0]; // inisialisasi buahTerpanjang dengan elemen pertama array

        // loop untuk mencari buah terpanjang
        for (int i = 1; i < buah.length; i++) {
            if (buah[i].length() > buahTerpanjang.length()) {
                buahTerpanjang = buah[i];
            }
        }

        System.out.println("Buah terpanjang adalah " + buahTerpanjang);
    }
}
