package com.company;

import java.util.Scanner;

public class Main {

    public static int Cheapest , Chosen , Median , count;

    public static void main(String[] args) {
	// write your code here
        int a =1, option= 0;

        for (int i=0; i<=90; i++){

            System.out.print("*");
        }

        System.out.println();
        for (int i =0; i<=25; i++){

            System.out.print(" ");
        }
        System.out.println("SAVE A HOUSE DEPOSIT CALCULATOR \n");
        System.out.println(" “Developed by” Daniyal, then your student id, then finally “ for ITECH1000 Sem 2 2017” \n ");
        for (int i=0; i<=90; i++){

            System.out.print("*");
        }

        do {

            System.out.println("\n Please Select an Option: ");
            System.out.println("\n 1. Enter House Prices " );
            System.out.println(" 2. Enter Avocado on Toast price " );
            System.out.println(" 3. Deposit Calculator " );
            System.out.println(" 4. Exit System " );
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            switch (option){

                case 1:
                    HousesPrice();
                    break;

                case 2:
                    System.out.println("This is case 2");
                    break;
                case 3:
                    System.out.println("This is case 3");
                    break;
                case 4:
                    System.out.println("This is case 4");
                    break;
                default:
                    break;

            }


        }while(a==1);


    }
    public static void HousesPrice(){

        ////////Enter Cheapest House///////////

         System.out.println("Hosue Details : \n" + "Enter price for cheapest house listing: ");
         Scanner input = new Scanner(System.in);
         while (!input.hasNextInt()){

             System.out.println("Invalid");
               input.next();
               }
             Cheapest = input.nextInt();

       /////////Enter Chosen House///////////////

        System.out.println( "Enter price for chosen house: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Chosen = input.nextInt();

     ///////////Enter Median House/////////////////

        System.out.println( "Enter price for median house in area: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Median = input.nextInt();

        if (!((Cheapest < Chosen) && (Cheapest < Median))){

            Cheapest = 0;
            


        }


    }

}