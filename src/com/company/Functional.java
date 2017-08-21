package com.company;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Functional {

    private int Cheapest , Chosen , Median  ; //int for houses prices
    private int AvocadoPrice; //int for Avocado on Toast price
    private double DepositCheap , DepositChosen , DepositMedian; //  to store flat 20% for each
    private double SmashedAvocados; // to store avocados not to buy

    public int getCheapest() { return Cheapest;
    } // Getter for check Cheapest house price in Main switch case 3.

    public int getAvocadoPrice() {
        return AvocadoPrice;
    } // Getter for check Avocado on Toast price in Main switch case 3.

    //Houses prices method start to collect prices with validation.
    public void HousesPrice(){

        //Cheapest House Code start

        System.out.println("Hosue Details : \n" + "Enter price for cheapest house listing: ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Cheapest = input.nextInt();

        //Chosen House Code start

        System.out.println( "Enter price for chosen house: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Chosen = input.nextInt();

        //Median House Code start

        System.out.println( "Enter price for median house in area: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        Median = input.nextInt();

        // Condition for cheapest value should be smaller in all three start

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

    //Avocado On Toast Method to Collect price for Avocado start:
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

        }

        } // End of AvocadoToast Method:


        // Deposit Calculator Method for calculate how much avocado not to buy start:

    public void DepositCal(){
         int hundred = 100 , twenty = 20 ;
         String Deposit, Smashed;
        System.out.println("Deposit Saving Calculator ");
        for (int i = 0; i<90; i++ ){

            System.out.print("*");

        } // End of asterisks of top:
        System.out.println("\n You will not to buy:");
        for (int i =0; i<1; i++){

            DecimalFormat df = new DecimalFormat("#.00"); // formatting two decimal format

            DepositCheap = (Cheapest/hundred) * twenty;         // flat 20% of given price for cheapest house
            SmashedAvocados = (DepositCheap/AvocadoPrice);      // calculating not to buy avocados

            Deposit = df.format(DepositCheap);          // Saving two decimal format of Deposit Cheapest house in string
            Smashed = df.format(SmashedAvocados);       // Saving two decimal format of Not to Buy Avocados in string
            System.out.println(Smashed + " smashed avocados on toast to save a " + "$"+Deposit +  " deposit for the cheapest house " );

            // ***** End of Cheapest house deposit and smashed avocados with two decimal format:


            DepositChosen = (Chosen/hundred) * twenty;          // flat 20% of given price for chosen house
            SmashedAvocados = (DepositChosen/AvocadoPrice);     // calculating not to buy avocados

            Deposit = df.format(DepositChosen);         // Saving two decimal format of Deposit Chosen house in string
            Smashed = df.format(SmashedAvocados);       // Saving two decimal format of Not to Buy Avocados in string

            System.out.println(Smashed + " smashed avocados on toast to save a $" + Deposit +" deposit for the chosen house ");

            // ***** End of Cheapest house deposit and smashed avocados with two decimal format:


            DepositMedian = (Median/hundred) * twenty;      // flat 20% of given price for Median house
            SmashedAvocados = (DepositMedian/AvocadoPrice); // calculating not to buy avocados

            Deposit = df.format(DepositMedian);         // Saving two decimal format of Median  house in string
            Smashed = df.format(SmashedAvocados);       // Saving two decimal format of Not to Buy Avocados in string

            System.out.println(Smashed + " smashed avocados on toast to save a $" + Deposit + " deposit for a house at the median price " );


                    // ***** End of Median house deposit and smashed avocados with two decimal format:
        }
        for (int i = 0; i<90; i++ ){

            System.out.print("*");

        }               // End of asterisks of bottom

        Cal();          // calling calender method to calculate weeks:
    }

        // Calender Method to show in which week you will be saved deposit amount of chosen house start:

   private void Cal(){
       int times;       // local variable to save how much time you purchase avocados in week:
       int week;        // local variable to save weeks: (DepositChosen) / (times * AvocadosPrice):
       double doubleWeek; // local variable to store double values of week
       String dateNow;
        System.out.println("\n How many times a week do you purchase Avocado on Toast?");

            // Taking user input while user not given positive number:

       Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){

            System.out.println("Not a Number");
            input.next();

        }times = input.nextInt();
        if (times < 0){

            System.out.println("Please Enter Positive Number, Retry Again \n");
            Cal(); // calling recursive function after failing attempts to save program from timeout:

        }else {

            week = (times * AvocadoPrice);          // calculating total expense in week

            doubleWeek = (DepositChosen / week);    // calculating week by dividing deposit of chosen house from above week
            week = (int) doubleWeek;                // converting double week value to int because GregorianCalender not accept double

            GregorianCalendar gregorianCalendar = new GregorianCalendar();  // GregorianCalender Class

            SimpleDateFormat formatter= new SimpleDateFormat("yyyy/MM/dd"); //format it as per your requirement

            gregorianCalendar.add(GregorianCalendar.WEEK_OF_MONTH , week);  // adding above calculated weeks in current
            dateNow = formatter.format(gregorianCalendar.getTime());        // after adding getting time
            System.out.println(dateNow);                             // showing future week when you will be able to collect deposit


        }

    }           // end of Calender method:
    }



