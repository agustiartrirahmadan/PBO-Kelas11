import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lanjut;

        do {
            // Menunjukan menu operasi
            System.out.println("Pilih operasi berikut:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Modulus");

            // Meminta user untuk memasukkan pilihan operasi
            System.out.print("Kamu ingin memasukan operasi apa? (1/2/3/4/5): ");
            int choice = input.nextInt();

            // Meminta user untuk memasukkan dua angka
            System.out.print("Masukkan angka pertama: ");
            double angkaPertama = input.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angkaKedua = input.nextDouble();

            double hasil = 0;
                     
            // Melakukan perhitungan sesuai dengan pilihan operasi
            if (choice == 1) {
                hasil = angkaPertama + angkaKedua;
            } else if (choice == 2) {
                hasil = angkaPertama - angkaKedua;
            } else if (choice == 3) {
                hasil = angkaPertama * angkaKedua;
            } else if (choice == 4) {
                hasil = angkaPertama / angkaKedua;
            } else if (choice == 5) {
                hasil = angkaPertama % angkaKedua;
            } else {
                System.out.println("Pilihan operasi tidak valid");
            }

            // Menunjukan hasil operasi
            System.out.println("Hasil operasi: " + hasil);

            // Meminta user apakah ingin melanjutkan
            System.out.print("Ingin melanjutkan (Ya/Tidak)? ");
            lanjut = input.next();
        } while (lanjut.equalsIgnoreCase("Ya"));
    }
}