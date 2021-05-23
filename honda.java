package com.company;

public class honda implements tampilkanHonda {
    public void tampilkan(){
        String bahanbakar = BAHANBAKAR;

        merek m = new merek();
        m.inputData("CRV","SUV","Putih");
        m.tampilkandata();

        System.out.println("Jenis bahan bakar :"+bahanbakar);
    }
}
