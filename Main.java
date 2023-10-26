/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package danijava;

/**
 *
 * @author LAB KOMPUTER 1
 */
// Definisi kelas (class) Kucing
class Kucing {
    // Atribut (variabel) dari kelas Kucing
    String nama;
    String warna;
    int umur;

    // Konstruktor untuk inisialisasi objek Kucing
    public Kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }

    // Method untuk kucing bersuara
    public void bersuara() {
        System.out.println(nama + " adalah kucing berwarna " + warna + " yang berusia " + umur + " tahun dan sedang bersuara: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing1 = new Kucing("Pussy", "Putih", 2);
        Kucing kucing2 = new Kucing("Tussy", "Hitam", 3);

        // Memanggil method pada objek Kucing
        kucing1.bersuara();
        kucing2.bersuara();
    }
}