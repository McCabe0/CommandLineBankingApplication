package com.jackmccabe.controller;

import com.jackmccabe.model.BankAccount;
import com.jackmccabe.model.Customer;
import com.jackmccabe.view.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.creatingCustomer();

        Customer customer = new Customer(menu.getFirstName(), menu.getLastName());
        BankAccount bankAccount = new BankAccount(customer);
        menu.welcomeMessage(customer);
        menu.actions(bankAccount);


    }
}
