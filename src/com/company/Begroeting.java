package com.company;

public class Begroeting {
    public static void main(String[] args) {
        char gender = 'm';
        String naam = "Joske";
        String begroeting = begroet(gender, naam);
        System.out.println(begroeting);
        gender = 'v';
        naam = "Marieke";
        begroeting = begroet(gender, naam);
        System.out.println(begroeting);

    }
    private static String begroet (char geslacht, String naam){
        String aanspreking="";
        if (geslacht == 'm'){
            aanspreking = String.format("Dag meneer %s", naam);
        }else if (geslacht == 'v'){
            aanspreking = String.format("Dag mevrouw %s", naam);
        }
        return aanspreking;
    }
}
