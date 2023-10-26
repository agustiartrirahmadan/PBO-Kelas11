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
public class Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasikan variabelnya ya guys
        String nama = "Agustiar Trirahmadan";
        int noAbsen =1;
        String kelas ="XI RPL";
        double nilaiPBO = 85;
        double nilaiBIN = 84;
        double nilaiMatematika = 87;
        
        //konstantakan
         final String MATA_PELAJARAN_PBO = "Pemrograman Berorientasi Objek";
        final String MATA_PELAJARAN_BIN = "Bahasa Indonesia";
        final String MATA_PELAJARAN_MAT = "Matematika";

        // Mencetak output ya tod
        System.out.println("Nama: " + nama);
        System.out.println("No. Absen: " + noAbsen);
        System.out.println("Kelas: " + kelas);
        System.out.println(MATA_PELAJARAN_PBO + ": " + nilaiPBO);
        System.out.println(MATA_PELAJARAN_BIN + ": " + nilaiBIN);
        System.out.println(MATA_PELAJARAN_MAT + ": " + nilaiMatematika);
    }
}

