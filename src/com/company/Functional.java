package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Functional {

    private int Cheapest , Chosen , Median  ; //int for houses prices
    private int AvocadoPrice; //int for Avocado on Toast price
    private int hundred = 100 , twenty = 20;
    private double DepositCheap , DepositChosen , DepositMedian; //  to store flat 20% for each
    private double SmashedAvocados; // to store avocados not to buy

    public int getCheapest() {
        return Cheapest;
    }

    public int getAvocadoPrice() {
        return AvocadoPrice;
    }

    //Houses prices method to collect price with validation.
    public void HousesPrice(){

        ////////Cheapest House Code///////////

        System.out.println("Hosue Details : \n" + "Enter price for cheapest house listing: ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Cheapest = input.nextInt();

        /////////Chosen House Code//////////////

        System.out.println( "Enter price for chosen house: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Chosen = input.nextInt();

        ///////////Median House Code/////////////////

        System.out.println( "Enter price for median house in area: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Median = input.nextInt();

        // Condition for cheapest value should be smaller

        if (((Cheapest >= Chosen) || (Cheapest >= Median))){

            System.out.println("Cheapest Value should be Smaller");

            while(!((Cheapest < Chosen) && (Cheapest < Median))){

                Cheapest = 0; //Taking again cheapest house price if not smaller in all three
                System.out.println( "Enter price for cheapest house: ");
                while (!input.hasNextInt()){

                    System.out.println("Invalid");
                    input.next();
                }
                Cheapest = input.nextInt();
                }

        }
    } // End HousePrice Method here:

    //Avocado On Toast Method to Collect price for Avocado:
    public void AvocadoToast(){
        Scanner input = new Scanner(System.in);
        System.out.println( " Enter the price to purchase Avocado on Toast from a local café or restaurant: ");
        while (!input.hasNextInt()){

            System.out.println("Not a Number");
            input.next();

        }
        AvocadoPrice = input.nextInt();
        if (AvocadoPrice < 0){

            System.out.println("Please Enter Positive Number, Retry Again \n");
            AvocadoToast();

            }else {

            return;
        }

        } // End of AvocadoToast Method


        // Deposit Calculator

    public void DepositCal(){

        System.out.println("Deposit Saving Calculator ");
        for (int i = 0; i<90; i++ ){

            System.out.print("*");

        } // End of asterisks of top
        System.out.println("\n You will not to buy:");
        for (int i =0; i<1; i++){

            DecimalFormat df = new DecimalFormat("#.00"); // formatting two decimal format

            DepositCheap = (Cheapest/hundred) * twenty; // flat 20% of given price for cheapest
            SmashedAvocados = (DepositCheap/AvocadoPrice); // calculating not to buy avocados

            String d = df.format(DepositCheap);
            String s = df.format(SmashedAvocados);
            System.out.println(s + " Cheapest " + d);
            //////////////////////////////////////
            DepositChosen = (Chosen/hundred) * twenty; // flat 20% of given price for chosen
            SmashedAvocados = (DepositChosen/AvocadoPrice); // calculating not to buy avocados

            d = df.format(DepositChosen);
            s = df.format(SmashedAvocados);

            System.out.println(s + " Chosen " + d);
            //////////////////////////////////////

            DepositMedian = (Median/hundred) * twenty; // flat 20% of given price for chosen
            SmashedAvocados = (DepositMedian/AvocadoPrice); // calculating not to buy avocados

            d = df.format(DepositMedian);
            s = df.format(SmashedAvocados);

            System.out.println(s + " Median " + d );

        }
        for (int i = 0; i<90; i++ ){

            System.out.print("*");

        } // End of asterisks of bottom
    }
    }



