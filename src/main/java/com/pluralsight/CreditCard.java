package com.pluralsight;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public static double charge(double amount) {
        return amount;
    }
    public static double pay(double amount) {
        return amount;
    }
    @Override
    public double getValue() {
        return 0;
    }
}
