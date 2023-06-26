package com.juaracoding.oopjava;

public class Mobil {
    private String bahanBakar;
    private int tahunPembuatan = 2000;

    public Mobil(String bahanBakar){
        this.bahanBakar = bahanBakar;
    }

    public void warna(){
        System.out.println("Berwarna merah");
    }

    public void mesin(){
        System.out.println("Bermesin 1800cc");
    }

    public String getBahanBakar(){
        return bahanBakar;
    }

    public int getTahunPembuatan(){
        return tahunPembuatan;
    }

}
