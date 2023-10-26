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
import java.util.Scanner;

public class InputDataSiswa {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan Nama Siswa: ");
        String nama = input.nextLine();

        // Meminta input kelas
        System.out.print("Masukkan Kelas (dalam bentuk angka): ");
        int kelas = input.nextInt();
        
        // Membersihkan buffer keyboard
        input.nextLine();

        // Meminta input usia
        System.out.print("Masukkan Usia (dalam bentuk angka desimal, contoh: 15.5): ");
        double usia = input.nextDouble();

        // Meminta input nomor absen
        System.out.print("Masukkan Nomor Absen (dalam bentuk angka desimal, contoh: 1.5): ");
        float absen = input.nextFloat();

        // Menampilkan data yang dimasukkan pengguna
        System.out.println("Data Siswa:");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Usia: " + usia);
        System.out.println("Nomor Absen: " + absen);

        // Menutup objek Scanner
        input.close();
    }
}