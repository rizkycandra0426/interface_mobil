package com.company;

public class toyota extends abstrakToyota{
    public void tampilkan(){
        String bahanbakar;
        bahanbakar="Pertamax";

        merek m = new merek();
        m.inputData("Fortuner","SUV","Hitam");
        m.tampilkandata();

        System.out.println("Jenis bahan bakar :"+bahanbakar);
    }
}
