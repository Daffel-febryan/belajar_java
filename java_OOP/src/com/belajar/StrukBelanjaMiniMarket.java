import java.util.Scanner;

public class StrukBelanjaMiniMarket {

    // Daftar harga barang
    static final int HARGA_BERAS = 15000;
    static final int HARGA_GULA = 12000;
    static final int HARGA_MINYAK = 20000;
    static final int HARGA_TELUR = 30000;
    static final int HARGA_MIE = 5000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variabel untuk menyimpan jumlah barang yang dibeli
        int jumlahBeras = 0, jumlahGula = 0, jumlahMinyak = 0, jumlahTelur = 0, jumlahMie = 0;
        int pilihan;

        // Program berjalan terus menerus sampai pengguna memilih keluar
        while (true) {
            // Menampilkan menu
            System.out.println("\n=== Menu Mini Market ===");
            System.out.println("1. Beras - Rp 15.000");
            System.out.println("2. Gula - Rp 12.000");
            System.out.println("3. Minyak Goreng - Rp 20.000");
            System.out.println("4. Telur - Rp 30.000");
            System.out.println("5. Mie Instan - Rp 5.000");
            System.out.println("6. Selesai Belanja");
            System.out.print("Pilih barang (1-6): ");

            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah Beras yang ingin dibeli: ");
                    jumlahBeras += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("Masukkan jumlah Gula yang ingin dibeli: ");
                    jumlahGula += scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Masukkan jumlah Minyak Goreng yang ingin dibeli: ");
                    jumlahMinyak += scanner.nextInt();
                    break;
                case 4:
                    System.out.print("Masukkan jumlah Telur yang ingin dibeli: ");
                    jumlahTelur += scanner.nextInt();
                    break;
                case 5:
                    System.out.print("Masukkan jumlah Mie Instan yang ingin dibeli: ");
                    jumlahMie += scanner.nextInt();
                    break;
                case 6:
                    // Menghitung total belanja
                    int total = (jumlahBeras * HARGA_BERAS) + (jumlahGula * HARGA_GULA) +
                            (jumlahMinyak * HARGA_MINYAK) + (jumlahTelur * HARGA_TELUR) +
                            (jumlahMie * HARGA_MIE);

                    // Menampilkan struk belanja
                    System.out.println("\n=== Struk Belanja ===");
                    if (jumlahBeras > 0)
                        System.out.println("Beras: " + jumlahBeras + " x Rp " + HARGA_BERAS + " = Rp "
                                + (jumlahBeras * HARGA_BERAS));
                    if (jumlahGula > 0)
                        System.out.println(
                                "Gula: " + jumlahGula + " x Rp " + HARGA_GULA + " = Rp " + (jumlahGula * HARGA_GULA));
                    if (jumlahMinyak > 0)
                        System.out.println("Minyak Goreng: " + jumlahMinyak + " x Rp " + HARGA_MINYAK + " = Rp "
                                + (jumlahMinyak * HARGA_MINYAK));
                    if (jumlahTelur > 0)
                        System.out.println("Telur: " + jumlahTelur + " x Rp " + HARGA_TELUR + " = Rp "
                                + (jumlahTelur * HARGA_TELUR));
                    if (jumlahMie > 0)
                        System.out.println(
                                "Mie Instan: " + jumlahMie + " x Rp " + HARGA_MIE + " = Rp " + (jumlahMie * HARGA_MIE));

                    System.out.println("\nTotal Belanja: Rp " + total);

                    // Pembayaran
                    System.out.print("Masukkan uang Anda: Rp ");
                    int uang = scanner.nextInt();

                    if (uang >= total) {
                        int kembalian = uang - total;
                        System.out.println("Pembayaran berhasil. Kembalian: Rp " + kembalian);
                    } else {
                        System.out.println("Uang Anda kurang. Transaksi dibatalkan.");
                    }

                    System.out.println("Terima kasih telah berbelanja!");
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
