package com.company;

import java.util.Scanner;

public class DelenGrootsteGetal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef eerste getal: ");
        int getal1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Geef tweede getal: ");
        int getal2 = Integer.parseInt(scanner.nextLine());
        double resultaat = delen(getal1, getal2);
        System.out.printf("het resultaat is %.2f", resultaat);
    }

    private static double delen (int getal1, int getal2){
        if (getal1 > getal2){
            return (double)getal1/getal2;
        }else {
            return (double)getal2/getal1;
        }
    }
}
