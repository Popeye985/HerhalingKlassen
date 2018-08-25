package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class MainPersoon {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        Persoon p = new Persoon();
        System.out.println("Geef naam:");
        String naam = invoer.nextLine();
        System.out.println("Geef geboortejaar");
        int gebooretejaar = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef geboortemaand");
        int geboortemaand = Integer.parseInt(invoer.nextLine());
        System.out.println("Geef geboortedag");
        int geboortedag = Integer.parseInt(invoer.nextLine());
        LocalDate geboortedatum = LocalDate.of(gebooretejaar, geboortemaand, geboortedag);
        p.setNaam(naam);
        p.setGeboorteDatum(geboortedatum);
        System.out.printf("Dag %s, je bent %d jaar oud.", p.getNaam(), p.getLeeftijd());





    }
}
