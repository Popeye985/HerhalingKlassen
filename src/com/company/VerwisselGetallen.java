package com.company;

import java.util.Scanner;

public class VerwisselGetallen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] getallen = new int[2];
        for (int i = 0; i < getallen.length; i++) {
            System.out.printf("Geef getal %d: ", i+1);
            getallen[i] = Integer.parseInt(scanner.nextLine());
        }
        verwissel(getallen);
        for(int getal: getallen){
            System.out.println(getal);
        }
    }
    private static void verwissel(int [] getallen){
        int tmp= getallen[0];
        getallen [0] = getallen [1];
        getallen[1] = tmp;
    }
}
