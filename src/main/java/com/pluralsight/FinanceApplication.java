package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Travis", "789456", 12500);
        Valuable account2 = new BankAccount("Kota", "123456", 1500);

        account2.getValue();
        System.out.println(account1.deposit(100));
//        account1.deposit(100);
//        account2.deposit(100);
    }
}
