package com;

import java.util.Scanner;

public class ValidasiEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan email: ");
        String email = input.nextLine();

        if (email.contains("@") && email.contains("."))
            System.out.println("Format email valid");
        else
            System.out.println("Format email tidak valid");
    }
}
