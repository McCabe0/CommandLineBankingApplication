package com.jackmccabe.model;

public class BankAccount{

    private int moneyInAccount;
    private Customer customer;

    public BankAccount(int moneyInAccount, Customer customer) {
        this.moneyInAccount = moneyInAccount;
        this.customer = customer;
    }

    public int getMoneyInAccount() {
        return moneyInAccount;
    }

    public void addingMoneyToAccount(int deposit){
        moneyInAccount = moneyInAccount + deposit;
    }

    public void creditingMoneyFromTheAccount(int credit){
        moneyInAccount = moneyInAccount - credit;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "moneyInAccount=" + moneyInAccount +
                ", customer=" + customer +
                '}';
    }
}
