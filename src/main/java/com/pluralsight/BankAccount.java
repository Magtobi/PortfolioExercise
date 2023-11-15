package com.pluralsight;

public class BankAccount implements Valuable {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public static double deposit(double amount) {
        return amount;
    }
    public static double withdraw(double amount) {
        return amount;
    }
    @Override
    public double  getValue() {
        return 0;
    }
}
