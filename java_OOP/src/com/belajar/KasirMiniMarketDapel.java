import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KasirMiniMarketDapel {
    // Menampilkan menu barang yang tersedia
    public static void tampilkanMenu() {
        System.out.println("=== Menu Mini Market ===");
        System.out.println("1. Beras - Rp. 15.000");
        System.out.println("2. Pop Mie - Rp. 6.5000");
        System.out.println("3. Minyak Goreng - Rp. 20.000");
        System.out.println("4. Telur - Rp. 30.000");
        System.out.println("5. Mie Instan - Rp. 5.000");
        System.out.println("6. Keluar");
    }

    // Menghitung total belanja
    public static int hitungTotal(Map<String, Integer> keranjang) {
        int total = 0;
        for (int harga : keranjang.values()) {
            total += harga;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> keranjang = new HashMap<>();
        boolean belanjaLagi = true;

        while (belanjaLagi) {
            tampilkanMenu();
            System.out.print("Pilih barang (1-6): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    keranjang.put("Beras", keranjang.getOrDefault("Beras", 0) + 15000);
                    break;
                case "2":
                    keranjang.put("Pop Mie", keranjang.getOrDefault("PopMie", 0) + 6000);
                    break;
                case "3":
                    keranjang.put("Minyak Goreng", keranjang.getOrDefault("Minyak Goreng", 0) + 20000);
                    break;
                case "4":
                    keranjang.put("Telur", keranjang.getOrDefault("Telur", 0) + 30000);
                    break;
                case "5":
                    keranjang.put("Mie Instan", keranjang.getOrDefault("Mie Instan", 0) + 5000);
                    break;
                case "6":
                    System.out.println("Keluar dari program...");
                    belanjaLagi = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }

            if (belanjaLagi) {
                // Menampilkan keranjang belanja
                System.out.println("\nKeranjang Anda:");
                for (Map.Entry<String, Integer> entry : keranjang.entrySet()) {
                    System.out.println(entry.getKey() + ": Rp " + entry.getValue());
                }

                int total = hitungTotal(keranjang);
                System.out.println("\nTotal Belanja: Rp " + total);

                System.out.print("Apakah Anda ingin membeli lagi? (y/n): ");
                String lanjut = scanner.nextLine();
                if (!lanjut.equalsIgnoreCase("y")) {
                    belanjaLagi = false;

                  
                }
            }
        }

        // Pembayaran
        System.out.println("\n--- Pembayaran ---");
        int total = hitungTotal(keranjang);
        System.out.print("Total Belanja: Rp " + total + ". Masukkan uang Anda: Rp ");
        int uang = scanner.nextInt();

        if (uang >= total) {
            int kembalian = uang - total;
            System.out.println("Pembayaran berhasil. Kembalian: Rp " + kembalian);
        } else {
            System.out.println("Uang yang Anda masukkan kurang. Transaksi dibatalkan.");
        }

        scanner.close();
    }
}


    

