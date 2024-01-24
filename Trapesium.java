/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author ASUS
 */
public class Trapesium extends BangunDatar implements Keliling, Simetri {
     // attributes
    public int A;
    public int B;
    public int tinggi;

    // methods

    @Override
    public double hitungLuas() {
        return ((A + B) * tinggi) / 2.0;
    }
    
    @Override
    public double hitungKeliling() {
        return A + B + tinggi + Math.sqrt(A * A + B * B);
    }

    @Override
    public double hitungSimPutar() {
        return 3.0;
    }

    @Override
    public double hitungSimLipat() {
        return 3.0;
    }

    @Override
    public void tampilHasil() {
        System.out.println("\nTrapesium");
        System.out.println("------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
    }
}
