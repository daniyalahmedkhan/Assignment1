package com.company;

import java.util.Scanner;

public class Functional {

    public int Cheapest , Chosen , Median; //int for houses prices
    public int AvocadoPrice; //int for Avocado on Toast price

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

        if (!((Cheapest < Chosen) && (Cheapest < Median))){

            System.out.println("Cheapest Value should be Smaller");

            while((Cheapest > Chosen) && (Cheapest > Median)){

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

        }

    }



