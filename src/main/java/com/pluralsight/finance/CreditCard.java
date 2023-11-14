package com.pluralsight.finance;


import com.pluralsight.Valuable;

public class CreditCard implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void charge(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("Charged: $" + amount);
        }
    }
    public void pay(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Paid: $" + amount);
        }
    }
    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    @Override
    public double getValue() {
        return -balance;
    }
}