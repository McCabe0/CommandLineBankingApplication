package com.jackmccabe.view;

import com.jackmccabe.model.BankAccount;
import com.jackmccabe.model.Customer;

import java.util.Scanner;

public class Menu {
    private Customer customer;
    private BankAccount bankAccount;
    private char options;
    private Scanner scanner;

    public void welcomeMessage(Customer customer){

        System.out.println("Welcome " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Transaction History");
        System.out.println("E. Exit");


    }

    public void actions(){

        do {
            System.out.println("Enter an option");
            options = scanner.next().charAt(0);

            switch (options){

            }

        }while (options != 'E');{
            System.out.println("Thank you for using the system");
        }
    }
}
