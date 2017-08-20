package com.company;

import java.util.Scanner;

public class Main extends Functional {

    public static void main(String[] args) {

        Functional Obj = new Functional();
        int a =1, option;

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
                    Obj.DepositCal();
                    break;
                case 4:
                    return;

                default:
                    break;

            }


        }while(a==1);


    }


}