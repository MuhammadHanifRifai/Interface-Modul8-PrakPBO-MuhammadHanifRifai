/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        //hitung luas, keliling, dan simetri dari suatu lingkaran A dengan r=19 satuan
        Lingkaran A = new Lingkaran();
        A.jejari = 19;
        A.tampilHasil();
        
        //hitung luas, keliling, dan simetri dari suatu persegi panjang B dengan panjang=10 & lebar=5 satuan
        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 10;
        B.lebar = 5;
        B.tampilHasil();
        
        //hitung luas, keliling, dan simetri dari suatu Segitiga C dengan alas=12 & tinggi=8 satuan
        Segitiga C = new Segitiga();
        C.alas = 12;
        C.tinggi = 8;
        C.tampilHasil();
        
        //hitung luas, keliling, dan simetri dari suatu Trapesium Hanif dengan A=10 & B=8 & tinggi=5 satuan
        Trapesium Hanif = new Trapesium();
        Hanif.A = 10;
        Hanif.B = 8;
        Hanif.tinggi = 5;
        Hanif.tampilHasil();
    }
}
