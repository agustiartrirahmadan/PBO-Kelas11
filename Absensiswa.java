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
public class Absensiswa {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input nama siswa
        System.out.print("Masukkan Nama Siswa: ");
        String namaSiswa = input.nextLine();

        // Melakukan absensi berdasarkan nama siswa
        switch (namaSiswa) {
            case "Agustiar":
            case "Ardy":
            case "Asty":
            case "Avinda":
                System.out.println(namaSiswa + " hadir.");
                break;
            default:
                System.out.println(namaSiswa + " bolos.");
                break;
        }

        // Menutup objek Scanner
        input.close();
    }
}