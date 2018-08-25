package com.company;

import java.util.Scanner;

public class BankrekeningMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankRekening rek = new BankRekening();
        System.out.print("Hoeveel geld wil je storten: ");
        int bedrag = Integer.parseInt(scanner.nextLine());
        rek.stortGeld(bedrag);
        System.out.print("Hoeveel geld wil je afhalen: ");
        bedrag = Integer.parseInt(scanner.nextLine());
        rek.haalGeldAf(bedrag);
        System.out.printf("Er staat nog %d EUR op je rekening.", rek.getSaldo());
    }
}
