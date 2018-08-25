package com.company;

public class BankRekening {
private int saldo = 0;
    public void stortGeld (int bedrag) {
       saldo += bedrag;


    }
    public int getSaldo(){
       return saldo;




    }

    public void haalGeldAf(int bedrag) {
        saldo -= bedrag;
    }
}



