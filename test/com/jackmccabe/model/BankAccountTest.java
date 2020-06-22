package com.jackmccabe.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount(new Customer("Jack", "McCabe"));
    }

    @Test
    public void ifAccountDepositsRight() throws Exception{
        bankAccount.addingMoneyToAccount(10);

        int amount = bankAccount.getCustomerCurrentBankAccount();

        assertEquals(10, amount);
    }

    @Test
    public void ifAccountCreditCorrectly() throws Exception{
        bankAccount.addingMoneyToAccount(10);

         bankAccount.creditingMoneyFromTheAccount(5);
         int amount = bankAccount.getCustomerCurrentBankAccount();

         assertEquals(5, amount);
    }

    @Test
    public void displaysTransactionHistoryDeposit() throws Exception{
        bankAccount.addingMoneyToAccount(10);

        int deposit = bankAccount.getDepositTransactions();

        assertEquals(10, deposit);
    }

    @Test
    public void displaysTransactionHistoryCredit() throws Exception{
        bankAccount.addingMoneyToAccount(10);
        bankAccount.creditingMoneyFromTheAccount(5);

        int credit = bankAccount.getCreditTransactions();

        assertEquals(5, credit);
    }

}