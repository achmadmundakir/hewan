package hewan_peliharaan;


import javax.lang.model.SourceVersion;

class Hewan {
    String jenis;
    String jumlahkaki;

    Hewan (String jenis, String jumlahkaki){
        this.jenis = jenis;
        this.jumlahkaki = jumlahkaki;
    }

    void show(){
        System.out.println(this.jenis);
        System.out.println(this.jumlahkaki);
    }

    void setJenis(String jenis){
        this.jenis = jenis;
    }

    String getNama(){
        return this.jenis;
    }

    String sayHello(String pesan){
        return "Halo, " + this.jenis + "! " + pesan;
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}

public class Contoh_Ant1  {
    public static void main(String[] args) {
        Hewan hwn1 = new Hewan("anjing", "4");
        hwn1.show();
        
        // Gunakan hwn1, karena hwn2 belum diinisialisasi
        hwn1.setJenis("kucing");
        hwn1.show();
        
        // Panggil metode getNama()
        System.out.println(hwn1.getNama());

        // Panggil metode sayHello()
        String data = hwn1.sayHello("Qurban");
        System.out.println(data);
    }
}
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

/**
 *
 * @author TOSHIBA
 */
public class Hewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
