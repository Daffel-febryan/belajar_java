package com.belajar_2;

// Kelas Induk
 class Hewan {
  void suara() {
        System.out.println("Hewan membuat suara.");
    }
} 

// Kelas Turunan: Kucing
class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong!");
    }
}

// Kelas Turunan: Anjing
class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk!");
    }
}

// Kelas Turunan: Sapi
class Sapi extends Hewan {
    @Override
    void suara() {
        System.out.println("Mooo!");
    }
}

// Kelas Main untuk menjalankan program
public class Senku {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Kucing();
        Hewan hewan3 = new Anjing();
        Hewan hewan4 = new Sapi();

        // Menampilkan suara masing-masing hewan
        hewan1.suara(); // Output: Hewan membuat suara.
        hewan2.suara(); // Output: Meong!
        hewan3.suara(); // Output: Guk guk!
        hewan4.suara(); // Output: Mooo!
    }
}

