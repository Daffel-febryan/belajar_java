package com.belajar;

public class Orang {
   
    String name = "Petani Kode";
    int age = 22;
    
     public class Employee extends Orang {

        float salary = 4000f;
        String name = "Dian";
        int age = 23;

        public void showInfo() {
            System.out.println("Name: " + super.name);
            System.out.println("Age: " + super.age);
            System.out.println("Salary: $" + salary);
        }
    }
}
