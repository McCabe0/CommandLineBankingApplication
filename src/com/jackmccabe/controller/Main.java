package com.jackmccabe.controller;

import com.jackmccabe.model.BankAccount;
import com.jackmccabe.model.Customer;

public class Main {

    public static void main(String[] args) {



        BankAccount bankAccount = new BankAccount(new Customer("Jack", "McCabe"));

        bankAccount.addingMoneyToAccount(1);


    }
}
