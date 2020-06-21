package com.jackmccabe.view;

import com.jackmccabe.model.BankAccount;
import com.jackmccabe.model.Customer;

import java.util.Scanner;

public class Menu {
    private char options;
    private Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;


    public void creatingCustomer(){
        System.out.println("Enter Your first name");
        firstName = scanner.next();
        System.out.println("Enter Your last name");
        lastName = scanner.next();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void welcomeMessage(Customer customer){

        System.out.println("Welcome " + customer.getFirstName() + " " + customer.getLastName());
    }

    public void userInputOptions(){

        System.out.println(
                "A. Check Balance\n" +
                "B. Deposit\n" +
                "C. Withdraw\n" +
                "D. Transaction Summary\n" +
                "E. Exit"
        );

    }


    public void actions(BankAccount bankAccount){

        do {
            System.out.println("\n");
            userInputOptions();
            System.out.println("Enter an option");
            options = scanner.next().charAt(0);

            switch (options){


                case 'A':
                    System.out.println("Your account balance is " + bankAccount.getCustomerCurrentBankAccount() + "$");
                    break;

                case 'B':
                    System.out.println("Enter the value you would like to deposit ");
                    int amount = scanner.nextInt();
                    bankAccount.addingMoneyToAccount(amount);
                    break;

                case 'C':
                    System.out.println("Enter the value you would like to withdraw");
                    amount = scanner.nextInt();
                    bankAccount.creditingMoneyFromTheAccount(amount);
                    break;

                case 'D':
                    System.out.println("Your transaction history is: ");
                    System.out.println("deposit History " + bankAccount.getDepositTransactions());
                    System.out.println("withdraw History " + bankAccount.getCreditTransactions());
                    break;
            }

        }while (options != 'E');{
            System.out.println("Thank you for using the system");
        }
    }
}
