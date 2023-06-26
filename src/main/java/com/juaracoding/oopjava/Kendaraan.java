package com.juaracoding.oopjava;

import com.juaracoding.oopjava.Mobil;

public class Kendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Pertalite");
        mobil.warna();
        mobil.mesin();
//        System.out.println(mobil.tahunPembuatan);
        System.out.println(mobil.getTahunPembuatan());
//        System.out.println(mobil.bahanBakar);
        System.out.println(mobil.getBahanBakar());
    }
}
