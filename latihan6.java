import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan6 {
        
    public static void main(String[] args) throws IOException {
        String nama;
        int umur;
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat objek buffereader
        BufferedReader br = new BufferedReader(isr);
        // Mengisi variabel nama dengan Buffereader
        System.out.print("inputkan nama Anda : ");
        nama = br.readLine();
        System.out.print("inputkan umur Anda : ");
        umur = Integer.parseInt(br.readLine());
        // tampilkan output isi variabel nama
        System.out.println("Nama Anda adalah : " + nama);
        System.out.println("Umur" + umur);

    }
    
}
