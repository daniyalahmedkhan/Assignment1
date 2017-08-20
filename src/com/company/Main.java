package com.company;

import java.util.Scanner;

public class Main extends Functional {

    public static void main(String[] args) {

        Functional Obj = new Functional();
        int cheap = Obj.getCheapest(); // to check if user not provide houses price. check switch case 3 below
        int price = Obj.getAvocadoPrice(); // to check if user not provide avocado price. check switch case 3 below
        int count =1, option; // count variable to repeat menu and option to take input choice

        for (int i=0; i<=90; i++){

            System.out.print("*");
        }

        System.out.println();
        for (int i =0; i<=25; i++){

            System.out.print(" ");
        }
        System.out.println("SAVE A HOUSE DEPOSIT CALCULATOR \n");
        System.out.println(" “Developed by” Daniyal, Stu-Id-00xx, “ for ITECH1000 Sem 2 2017” \n ");
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
                    Obj.HousesPrice();
                    break;

                case 2:
                    Obj.AvocadoToast();
                    break;
                case 3:
                    if ((cheap <=  0) && (price <=0)){

                        System.out.println("You need to enter all houses and avocado prices first ");
                        break;
                    }else {
                        Obj.DepositCal();
                    }

                    break;
                case 4:
                    return;

                default:
                    break;

            }


        }while(count == 1);


    }


}