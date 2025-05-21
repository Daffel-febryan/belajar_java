

import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        int idPasien;
        String namaPasien, alamatPasien, keluhanPasien;

        // Perbaiki penulisan Scanner
        Scanner keyboard = new Scanner(System.in);

        // Input data pasien
        System.out.println("Input Data Pasien");
        System.out.println("---------------------");

        System.out.print("Id Pasien : ");
        idPasien = keyboard.nextInt(); // Membaca input untuk ID Pasien

        keyboard.nextLine(); // Mengatasi masalah newline setelah nextInt()

        System.out.print("Nama Pasien : ");
        namaPasien = keyboard.nextLine(); // Membaca nama pasien

        System.out.print("Alamat Pasien : ");
        alamatPasien = keyboard.nextLine(); // Membaca alamat pasien

        System.out.print("Keluhan : ");
        keluhanPasien = keyboard.nextLine(); // Membaca keluhan pasien

        // Menampilkan data pasien
        System.out.println("\nOutput Data Pasien");
        System.out.println("------------------");
        System.out.println("Id Pasien : " + idPasien);
        System.out.println("Nama Pasien : " + namaPasien);
        System.out.println("Alamat Pasien : " + alamatPasien);
        System.out.println("Keluhan : " + keluhanPasien);

    }
}
