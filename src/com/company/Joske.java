package com.company;

import java.util.Scanner;

public class Joske {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wat is je naam: ");
        String naam = scanner.nextLine();
        String begroeting = maakBegroeting(naam);
        System.out.println(begroeting);
    }

    private static String maakBegroeting (String naam){
        return String.format("Dag %s", naam);
    }

}
