package com.pluralsight.finance;

import com.pluralsight.Valuable;

import java.util.Random;

public class BankAccount implements Valuable {
    private String accountNumber;
    private double balance;

    public BankAccount(String name, double balance) {
        super();
        this.accountNumber = generateAccountNumber();
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    private String generateAccountNumber() {
        Random random = new Random();
        return String.format("%04d", random.nextInt(10000));
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return amount;
        } else {
            System.out.println("Insufficient funds.");
            return 0;
        }
    }


    @Override
    public double getValue() {
        return 0;
    }
}
