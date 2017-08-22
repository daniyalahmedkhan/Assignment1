package com.company;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

// This class contains 4 methods..
// 1-  housePrice method will save the all three house prices with validation of whole positive no with cheapest should be smaller in all three.
// 2- avocadoToast method will save the price of avocado on toast with validation whole positive no.
// 3- depositCal method will calculate 20% flat deposit of all three houses which we saved in housePrice method.
// 4- cal method is for GregorianCalender it will ask you how many time you purchase avocado then calculate weeks.
// getCheapest and getAvocadoPrice Getter is returning the value to main in switch case 3 to check user can not select direct deposit without given the amount of houses and avocado.
 class Functional {

    private int cheapest , chosen , median  ; //int for houses prices
    private int avocadoPrice;                 //int for Avocado on Toast price
    private double depositCheap , depositChosen , depositMedian; //  to store flat 20% for each


    public int getCheapest() { return cheapest;
    } // Getter for check Cheapest house price in Main switch case 3.

    public int getAvocadoPrice() {
        return avocadoPrice;
    } // Getter for check Avocado on Toast price in Main switch case 3.

    //Houses prices method start to collect prices with validation.
    public void housesPrice(){

        //Cheapest House Code start

        System.out.println("Hosue Details : \n" + "Enter price for cheapest house listing: ");
        Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        cheapest = input.nextInt();

        //Chosen House Code start

        System.out.println( "Enter price for chosen house: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        chosen = input.nextInt();

        //Median House Code start

        System.out.println( "Enter price for median house in area: ");
        while (!input.hasNextInt()){

            System.out.println("Invalid");
            input.next();
        }
        median = input.nextInt();

        // Condition for cheapest value should be smaller in all three start

        if (((cheapest >= chosen) || (cheapest >= median))){

            System.out.println("Cheapest Value should be Smaller");

            while(!((cheapest < chosen) && (cheapest < median))){

                cheapest = 0; //Taking again cheapest house price if not smaller in all three
                System.out.println( "Enter price for cheapest house: ");
                while (!input.hasNextInt()){

                    System.out.println("Invalid");
                    input.next();
                }
                cheapest = input.nextInt();
                }

        }
    } // End HousePrice Method here:

    //Avocado On Toast Method to Collect price for Avocado start:
    public void avocadoToast(){
        Scanner input = new Scanner(System.in);
        System.out.println( " Enter the price to purchase Avocado on Toast from a local café or restaurant: ");
        while (!input.hasNextInt()){

            System.out.println("Please enter positive whole no: ");
            input.next();

        }
        avocadoPrice = input.nextInt();
        if (avocadoPrice < 0){

            System.out.println("Please Enter Positive Number, Retry Again \n");
            avocadoToast();

            }

        } // End of AvocadoToast Method:


        // Deposit Calculator Method for calculate how much avocado not to buy start:

    public void depositCal(){
         double smashedAvocados;   // to store avocados not to buy
         int  hundred = 100 , twenty = 20 ;
         String Deposit, Smashed;
        System.out.println("Deposit Saving Calculator ");
        for (int i = 0; i<90; i++ ){

            System.out.print("*");

        } // End of asterisks of top:
        System.out.println("\n You will not to buy:");
        for (int i =0; i<1; i++){

            DecimalFormat df = new DecimalFormat("#.00"); // formatting two decimal format

            depositCheap = (cheapest/hundred) * twenty;         // flat 20% of given price for cheapest house
            smashedAvocados = (depositCheap/avocadoPrice);      // calculating not to buy avocados

            Deposit = df.format(depositCheap);          // Saving two decimal format of Deposit Cheapest house in string
            Smashed = df.format(smashedAvocados);       // Saving two decimal format of Not to Buy Avocados in string
            System.out.println(Smashed + " smashed avocados on toast to save a " + "$"+Deposit +  " deposit for the cheapest house " );

            // ***** End of Cheapest house deposit and smashed avocados with two decimal format:


            depositChosen = (chosen/hundred) * twenty;          // flat 20% of given price for chosen house
            smashedAvocados = (depositChosen/avocadoPrice);     // calculating not to buy avocados

            Deposit = df.format(depositChosen);         // Saving two decimal format of Deposit Chosen house in string
            Smashed = df.format(smashedAvocados);       // Saving two decimal format of Not to Buy Avocados in string

            System.out.println(Smashed + " smashed avocados on toast to save a $" + Deposit +" deposit for the chosen house ");

            // ***** End of Cheapest house deposit and smashed avocados with two decimal format:


            depositMedian = (median/hundred) * twenty;      // flat 20% of given price for Median house
            smashedAvocados = (depositMedian/avocadoPrice); // calculating not to buy avocados

            Deposit = df.format(depositMedian);         // Saving two decimal format of Median  house in string
            Smashed = df.format(smashedAvocados);       // Saving two decimal format of Not to Buy Avocados in string

            System.out.println(Smashed + " smashed avocados on toast to save a $" + Deposit + " deposit for a house at the median price " );


                    // ***** End of Median house deposit and smashed avocados with two decimal format:
        }
        for (int i = 0; i<90; i++ ){

            System.out.print("*");

        }               // End of asterisks of bottom

        cal();          // calling calender method to calculate weeks:
    }

        // Calender Method to show in which week you will be saved deposit amount of chosen house start:

   private void cal(){
       int times;       // local variable to save how much time you purchase avocados in week:
       int week;        // local variable to save weeks: (DepositChosen) / (times * AvocadosPrice):
       double doubleWeek; // local variable to store double values of week
       String dateNow;
        System.out.println("\n How many times a week do you purchase Avocado on Toast?");

            // Taking user input while user not given positive number:

       Scanner input = new Scanner(System.in);
        while (!input.hasNextInt()){

            System.out.println("Please enter positive whole no: ");
            input.next();

        }times = input.nextInt();
        if (times < 0){

            System.out.println("Please Enter Positive Number, Retry Again \n");
            cal(); // calling recursive function after failing attempts to save program from timeout:

        }else {

            week = (times * avocadoPrice);          // calculating total expense in week

            doubleWeek = (depositChosen / week);    // calculating week by dividing deposit of chosen house from above week
            week = (int) doubleWeek;                // converting double week value to int because GregorianCalender not accept double

            GregorianCalendar gregorianCalendar = new GregorianCalendar();  // GregorianCalender Class

            SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/yyyy"); //format it as per your requirement

            gregorianCalendar.add(GregorianCalendar.WEEK_OF_MONTH , week);  // adding above calculated weeks in current
            dateNow = formatter.format(gregorianCalendar.getTime());        // after adding getting time
            System.out.println("If you stop buying avocados on toast from today and save the money instead,\n" +
                    "your deposit for a $" +chosen+ " house will be saved in the week of week "+dateNow);
                            // showing future week when you will be able to collect deposit


        }

    }           // end of Calender method:
    }



