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
        a2.setAccountNumber("12345");
        a2.setPin(123);
        a2.setBalance(1000);
        a2.interact();

        ATM a3 = new ATM();
        a3.setAccountNumber("123456");
        a3.setPin(123);
        a3.interact();
    }
}


