package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Hardcoding 3 accounts
        ATM a1 = new ATM();
        a1.setAccountNumber("1234");
        a1.setPin(123);
        a1.setBalance(100);
        a1.interact();

        ATM a2 = new ATM();
        a2.setAccountNumber("89562");
        a2.setPin(333);
        a2.setBalance(1000);
        a2.interact();

        ATM a3 = new ATM();
        a3.setAccountNumber("55555");
        a3.setPin(111);
        a3.setBalance(50000);
       a3.interact();
    }
}


