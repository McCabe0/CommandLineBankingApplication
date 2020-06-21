package com.jackmccabe.controller;

import com.jackmccabe.model.BankAccount;
import com.jackmccabe.model.Customer;
import com.jackmccabe.view.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        Customer customer = new Customer("Jack", "McCabe");
        BankAccount bankAccount = new BankAccount(customer);
        menu.welcomeMessage(customer);


    }
}
