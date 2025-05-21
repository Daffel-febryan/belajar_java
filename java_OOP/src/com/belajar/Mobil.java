public class Mobil {
    String warna;
    int tahunproduksi;
    int nomor_mesin;
    int nomor_rangka;
    public static <mobil> void main(String[] args) {
         Mobil mobilNiaga = new Mobil();
        //pemanggilan method void
        ((Mobil) mobilNiaga).isi();
        ((Mobil) mobilNiaga).tampil();
    }
    //Mengisi variabel instance
    void isi(){
        warna = "Merah";
        tahunproduksi = 2018;
        nomor_mesin =12345;
        nomor_rangka = 8967;
    }
    //menampilkan isi variabel
    void tampil(){
        System.out.println("warna : " +warna);
        System.out.println("Tahun Produksi : " + nomor_mesin);
        System.out.println("Nomor mesin : " + nomor_mesin);
        System.out.println("Nomor Rangka : " + nomor_rangka);



    }
    }
    
    

