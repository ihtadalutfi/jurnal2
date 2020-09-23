package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mataKuliah = scanner.nextLine();
        int jumlahJam = scanner.nextInt();
        System.out.println("Aku Suka Kuliah " + mataKuliah + ".");
        System.out.println("Kuliah "+ jumlahJam + " Jam Perminggu Rasanya Kurang.");
        System.out.println("Tambahin Dong Jadi " + 2 * jumlahJam + " Jam Perminggu.");
    }
}
