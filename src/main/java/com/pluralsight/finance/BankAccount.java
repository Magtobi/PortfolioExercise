package com.pluralsight.finance;

import com.pluralsight.FixedAsset;

public class BankAccount extends FixedAsset {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount(String name, double balance) {
        super(name, balance);
        this.accountNumber = getAccountNumber();
        this.balance = balance;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getValue() {
        return balance;
    }

    public void deposit(int i) {
    }
}
