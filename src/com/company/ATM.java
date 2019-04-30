package com.company;

import java.util.Scanner;

public class ATM extends Account {
    Scanner input = new Scanner(System.in);
    private int withdraw = 0;
    private int deposit = 0;


    //Constructor
    public ATM() {
        //Asking user inputs
        System.out.println("\n\nPlease enter your account number: ");
        String accNum = input.nextLine();

        System.out.println("Please enter your pin: ");
        int pinNum = input.nextInt();


        String choice = "y";
//        while(choice.equalsIgnoreCase("y")) {
//            System.out.println("1. Check balance");
//            System.out.println("2. Withdraw money");
//            System.out.println("3. deposit money");
//            System.out.println("Enter option: ");
//            int a = input.nextInt();
//
//            switch (a) {
//                case 1:
//                    System.out.print("Balance: $");
//                    this.getBalance();
//                    break;
//                case 2:
//                    System.out.print("Withdraw amount: $");
//                    setWithdraw(input.nextInt());
//                    break;
//                case 3:
//                    System.out.println("Deposit amount: $");
//                    setDeposit(input.nextInt());
//                    break;
//                default:
//                    System.out.println("Invalid Option");
//                    break;
//            }
//
//            System.out.println("Would you like to make another transaction? (y/n)");
//            choice = input.nextLine();
//        }
    }


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


        //Option at the ATM
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. deposit money");
            System.out.println("Enter option: ");
            int a = input.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Balance: $");
                    super.getBalance();
                    break;
                case 2:
                    System.out.print("Withdraw amount: $");
                    setWithdraw(input.nextInt());
                    break;
                case 3:
                    System.out.println("Deposit amount: $");
                    setDeposit(input.nextInt());
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

            System.out.println("Would you like to make another transaction? (y/n");
            choice = input.nextLine();
        }
    }
}



