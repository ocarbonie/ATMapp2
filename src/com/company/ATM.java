package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ATM extends Account {
    Scanner input = new Scanner(System.in);
    private int withdraw = 0;
    private int deposit = 0;

    //Constructor
    public ATM(){}


    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public int getBalance() {
        return (super.getBalance() - this.getWithdraw()) + this.getDeposit();
    }

    public void interact() {

        //Asking user inputs
        System.out.println("Please enter your account number: ");
        String accNum = input.nextLine();

        System.out.println("Please enter your pin: ");
        int pinNum = input.nextInt();
        input.nextLine();


        //validate information
        if(pinNum == getPin() && accNum.equals(getAccountNumber())) {
            options();
            System.out.println("Balance: $" + getBalance());
        }
        else {
            System.out.println("ERROR");

            boolean wrong = true;
            int i = 0;
            while (!wrong && i < 2) {
                setPin(0);
                System.out.println("Please enter your account number: ");
                accNum = input.nextLine();


                System.out.println("Please enter your pin: ");
                pinNum = input.nextInt();
                input.nextLine();
                i++;

                if(pinNum == getPin() && accNum.equals(getAccountNumber())) {
                    options();
                    System.out.println("Balance: $" + getBalance());
                    wrong = true;
                }
            }
        }
    }

    public void options(){
        System.out.println("Choose an option: ");

        //Option at the ATM
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("\n1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. deposit money");
            System.out.println("Enter option: ");
            int a = input.nextInt();
            input.nextLine();

            switch (a) {
                case 1:
                    System.out.print("Balance: $" + super.getBalance());
                    break;
                case 2:
                    System.out.print("Withdraw amount: $" );
                    setWithdraw(input.nextInt());
                    System.out.println("Balance: $" + this.getBalance());
                    input.nextLine();
                    break;
                case 3:
                    System.out.print("Deposit amount: $");
                    setDeposit(input.nextInt());
                    System.out.println("Balance: $" + this.getBalance());
                    input.nextLine();
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

            System.out.println("\nWould you like to make another transaction? (y/n)");
            choice = input.nextLine();
        }
    }
}



