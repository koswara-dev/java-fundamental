package com.juaracoding;

public class Variable {
    public static void main(String[] args) {
        int id = 10;
        id = 5*2;
        int x, y;
        x = 1;
        y = 2;
        byte a = 127;
        double b = 10000.1;
        char grade = 'A';
        char num = '5'; // Keterangan
        System.out.println("Number = \t"+num);
        boolean isResult = true;
        String alamat = "Indonesia Raya";
        Integer nilai = 10;
        System.out.println(alamat);
        System.out.println(alamat.toUpperCase());
        short dataSatu = 10;
        double dataDua = dataSatu;
        System.out.println(dataDua);
        long l = 9223372036854775000l;
        int i = (int) l; // semua long belum tentu merupakan int
        System.out.println(i);
        int umur = 20;
        int duplikatUmur = umur;
        duplikatUmur = 25;
        System.out.println(umur);
        System.out.println(duplikatUmur);

    }
}
