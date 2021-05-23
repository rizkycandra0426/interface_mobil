package com.company;

public class merek {
    private String merek;
    private String jenis;
    private String warna;

    public String getmerek(){
        return merek;
    }
    public void setmerek (String merek){
        this.merek = merek;
    }
    public String getjenis(){
        return jenis;
    }
    public void setjenis(String jenis){
        this.jenis= jenis;
    }
    public String getwarna(){
        return warna;
    }
    public void setwarna(String warna){
        this.warna = warna;
    }

    public void tampilkandata(){
        System.out.println("merek mobil :"+getmerek());
        System.out.println("jenis mobil :"+getjenis());
        System.out.println("warna mobil :"+getwarna());
    }

    public void inputData(String m,String j,String w){
        setmerek(m);
        setjenis(j);
        setwarna(w);
    }
}
