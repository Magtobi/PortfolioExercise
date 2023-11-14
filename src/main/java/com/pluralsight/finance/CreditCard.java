package com.pluralsight.finance;

import com.pluralsight.FixedAsset;

public class CreditCard extends FixedAsset {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, double marketValue) {
        super(name, marketValue);
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
}