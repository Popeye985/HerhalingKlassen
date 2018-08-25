package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner invoer = new Scanner(System.in);
        System.out.println("Geef getal 1");
        int getal1 = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef getal 2");
        int getal2 = Integer.parseInt(invoer.nextLine());
        int som = getSom(getal1, getal2);
        System.out.printf("De som van %d en %d is %s%n", getal1, getal2, som);
        int verschil = getVerschil(getal1, getal2);
        System.out.printf("Het verschil van %d en %d is %s%n", getal1,getal2, verschil);
        int product = getProduct (getal1, getal2);
        System.out.printf("Het product van %d en %d is %s%n", getal1, getal2, product);
        int quotient = getQuotient (getal1, getal2);
        System.out.printf("Het quotient van %d en %d is %s%n", getal1, getal2, quotient);

    }

    private static int getSom(int getal1, int getal2) {
        return getal1 + getal2;
    }
    private static int getVerschil (int getal1, int getal2){
        return getal1 - getal2;
    }
    private static int getProduct (int getal1, int getal2){
        return getal1*getal2;
    }
    private static  int getQuotient(int getal1, int getal2){
        return getal1/getal2;
    }
}
