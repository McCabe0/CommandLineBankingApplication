package com.jackmccabe.model;

import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;

public class BankAccount{

    private int moneyInAccount;
    private int depositTransactions;
    private int creditTransactions;
    private Customer customer;

    public BankAccount(Customer customer) {
        this.customer = customer;
    }

    public int getDepositTransactions() {
        return depositTransactions;
    }

    public int getCreditTransactions() {
        return creditTransactions;
    }

    public int getCustomerCurrentBankAccount(){
       return moneyInAccount;
    }

    public int getPayeeBankAccount(Customer customer){
        return moneyInAccount;
    }

    public void addingMoneyToAccount(int deposit){

            if (deposit >= 0){
                moneyInAccount = moneyInAccount + deposit;
                depositTransactions = deposit;
            } else {
                throw new IllegalArgumentException("Enter an amount higher than 0");
        }

    }

    public void creditingMoneyFromTheAccount(int credit){

            if (credit >= 0 && moneyInAccount >= credit){
                moneyInAccount = moneyInAccount - credit;
                creditTransactions = credit;
        } else {
                throw new IllegalArgumentException("Enter an amount higher than 0 or you don't " +
                        "have enough money in your account");
            }
    }

    public void transferToPayee(int amount, Customer payee){

    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "moneyInAccount=" + moneyInAccount +
                ", customer=" + customer +
                '}';
    }
}
