package com.juaracoding;

public class Percabangan {
    public static void main(String[] args) {
        if(5<=5){
            System.out.println("Percabangan");
        }
        if(!false){
            System.out.println("Bogor");
        } else {
            System.out.println("Tanggerang");
        }

        // program bil gajil genap
        if (false)
            System.out.println("Text");
        //nested if
        int x = 101;
        if(x%2 == 0) {
            if (x / 100 != 0)
                System.out.println(x + " bilangan genap lebih dari seratus");
            else if (x / 10 != 0)
                System.out.println(x + " bilangan genap lebih dari sepuluh");
        } else {
            System.out.println(x + " bilangan ganjil");
        }
        int tgl = 11;
        int platNomor = 124;
        if(tgl%2==0){
            if(platNomor%2==0){
                System.out.println("Tanggal genap, plat nomor genap");
            } else {
                System.out.println("Tanggal genap, plat nomor ganjil");
            }
        } else {
            if(platNomor%2==0){
                System.out.println("Tanggal ganjil, plat nomor genap");
            } else {
                System.out.println("Tanggal ganjil, plat nomor ganjil");
            }
        }
        //switch
        String browser = "Chrome";
        switch (browser.toLowerCase()){
            case "chrome":
                System.out.println("Open chrome");
                break;
            case "firefox":
                System.out.println("Open firefox");
                break;
            default:
                System.out.println("Tidak ada browser tersebut");
                break;
        }
    }
}
