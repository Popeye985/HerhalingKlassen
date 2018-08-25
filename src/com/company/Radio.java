package com.company;

import java.util.MissingFormatArgumentException;

public class Radio {
    private String nieuwsBericht;
    private static final int MAXVOLUME = 10;
    private static final int MINVOLUME = 0;
    private int volume;

    public void setNieuwsBericht(String nieuwsBericht) {
        this.nieuwsBericht = nieuwsBericht;

    }

    public int getVolume() {


        return volume;
    }

    public String speelNieuwsBericht() {
        if (volume == MINVOLUME) {
            return "";
        }
        if ( volume < 5) {
            return nieuwsBericht;

        }

            return nieuwsBericht.toUpperCase();


    }



        public void verhoogVolume(){

            if (volume < MAXVOLUME) volume++;
        }

        public void verlaagVolume (){
            if (volume > MINVOLUME) volume--;
        }
    }

