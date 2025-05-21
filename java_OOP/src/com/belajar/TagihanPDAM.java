package com.belajar;

import java.util.Scanner;

public class TagihanPDAM {
    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
         Scanner scanner = new Scanner(System.in);

        // Input data pelanggan
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan Nomor Pelanggan: ");
        String nomorPelanggan = scanner.nextLine();

        System.out.print("Masukkan Alamat Pelanggan: ");
        String alamatPelanggan = scanner.nextLine();

        System.out.print("Masukkan Periode Tagihan (contoh: Januari 2025): ");
        String periodeTagihan = scanner.nextLine();

        System.out.print("Masukkan Jumlah Pemakaian (m3): ");
        double pemakaianAir = scanner.nextDouble();

        System.out.print("Masukkan Tarif per m3 (misalnya: 5000): ");
        double tarifPerM3 = scanner.nextDouble();

        // Menghitung total tagihan
        double totalTagihan = pemakaianAir * tarifPerM3;

        // Menampilkan tagihan PDAM
        System.out.println("\n--- Tagihan PDAM ---");
        System.out.println("Nama Pelanggan      : " + namaPelanggan);
        System.out.println("Nomor Pelanggan     : " + nomorPelanggan);
        System.out.println("Alamat Pelanggan    : " + alamatPelanggan);
        System.out.println("Periode Tagihan     : " + periodeTagihan);
        System.out.println("Jumlah Pemakaian    : " + pemakaianAir + " m3");
        System.out.println("Tarif per m3        : Rp " + tarifPerM3);
        System.out.println("Total Tagihan       : Rp " + totalTagihan);
        
        scanner.close();
    }
    }

