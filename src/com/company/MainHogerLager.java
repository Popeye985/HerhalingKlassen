package com.company;

import java.util.Scanner;

public class MainHogerLager {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        HogerLager hl = new HogerLager();
        hl.init();

        do {
        System.out.println("Raad een getal");
        int getal = Integer.parseInt(invoer.nextLine());
        int resultaat = hl.raad(getal);
        if (resultaat > 0){
            System.out.println("Hoger");
        }else if (resultaat < 0){
            System.out.println("Lager");
        }else {
            System.out.println("Gevonden!");
        }


        }while (!hl.isEindeSpel());
        System.out.printf("Je hebt het getal gevonden in %d beurten.", hl.getAantalBeurten());
    }
}
