package com.jackmccabe.controller;

import com.jackmccabe.model.BankAccount;
import com.jackmccabe.model.Customer;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Jack", "McCabe");

        BankAccount bankAccount = new BankAccount(0,customer);




    }
}
