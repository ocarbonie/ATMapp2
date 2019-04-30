package com.company;

public class Account {
    private String accountNumber;
    private String userName;
    private int balance;
    private int pin;

    public Account(){

    }
    //Methods for Account Number
    public void setAccountNumber(String m){
        this.accountNumber = m;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    //Methods for User Name
    public void setUserName(String p){
        this.userName = p;
    }
    public String getUserName(){
        return userName;
    }

    //Methods for balance
    public void setBalance(int s){
        this.balance = s;
    }
    public int getBalance(){
        return balance;
    }

    //Methods for pin
    public void setPin(int r){
        this.pin = r;
    }
    public int getPin(){
        return pin;
    }

}