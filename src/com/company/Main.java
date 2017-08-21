package com.company;

import java.util.Scanner;

public class Main extends Functional {  // inheritance functional class

    public static void main(String[] args) {

        Functional Obj = new Functional();      // Making Object of functional class.
        int option ;                            // to take user input choice from 1-4 options below

        for (int i=0; i<=90; i++){

            System.out.print("*");
        }           // Top asterisks

        System.out.println();
        for (int i =0; i<=25; i++){

            System.out.print(" ");
        }           // Blank space


        System.out.println("SAVE A HOUSE DEPOSIT CALCULATOR \n");
        System.out.println(" “Developed by” Daniyal, Stu-Id-00xx, “ for ITECH1000 Sem 2 2017” \n ");
        for (int i=0; i<=90; i++){

            System.out.print("*");
        }       // bottom asterisks

        do {
            // Menu start

            System.out.println("\n Please Select an Option: ");
            System.out.println("\n 1. Enter House Prices " );
            System.out.println(" 2. Enter Avocado on Toast price " );
            System.out.println(" 3. Deposit Calculator " );
            System.out.println(" 4. Exit System " );
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            switch (option){

                case 1:
                    Obj.HousesPrice();      // calling from functional class to store 3 house prices
                    break;

                case 2:
                    Obj.AvocadoToast();     // calling from functional class to store avocado on toast price
                    break;
                case 3:
                    int zero = 0;                       // local variable just to avoid magic number: means hardcoded no direct.
                    int cheap = Obj.getCheapest();      // calling only cheapest house price user can not jump to deposit option
                    int price = Obj.getAvocadoPrice();  // calling avocados price user can not blank its price
                    if ((cheap >  zero) && (price > zero)){
                        Obj.DepositCal();

                        break;
                    }else {
                        System.out.println("You need to enter all houses and avocado prices first ");

                    }

                    break;
                case 4:
                    System.out.println("System is exiting... ..");
                    return;

                default:
                    break;

            }


        }while(true);


    }


}