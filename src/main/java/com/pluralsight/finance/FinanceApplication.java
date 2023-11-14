package com.pluralsight.finance;
import com.pluralsight.Valuable;
public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "Pam", 12500);
        Valuable account2 = new BankAccount("Travis", "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
        account2.deposit(100);
    }
}
