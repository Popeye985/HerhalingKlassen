package com.company;

import java.util.Scanner;

public class RadioMain {
    public static void main(String[] args) {
        Radio radio = new Radio();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef nieuwsbericht: ");
        String nieuwsBericht = scanner.nextLine();
        radio.setNieuwsBericht(nieuwsBericht);
        for(int i=0;i<10;i++){
            System.out.printf("Op volume %d: %s%n", radio.getVolume(), radio.speelNieuwsBericht() );
            radio.verhoogVolume();
        }
        for(int i=0;i<=10;i++){
            System.out.printf("Op volume %d: %s%n", radio.getVolume(), radio.speelNieuwsBericht() );
            radio.verlaagVolume();
        }

    }
}
