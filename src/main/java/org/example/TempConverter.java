/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Locale;
import java.util.Scanner;

public class TempConverter {

    static public void main (String[] args){

        Scanner input = new Scanner(System.in);

        int intake, output;
        String choice, temp;

        output = 0;
        temp = " ";

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        choice = input.next().toUpperCase(Locale.ROOT);

        System.out.println("Your choice: "+choice);

        if (choice.equals("C")){

            temp = "Celsius";
            System.out.println("Please enter the temperature in Fahrenheit: ");
            intake = input.nextInt();

            if (Character.isDigit(intake)){
                System.out.println("Invalid input");
                System.exit(0);
            }
            output = (intake - 32) * 5/9;
        }

        if (choice.equals("F")){

            temp = "Fahrenheit";
            System.out.println("Please enter the temperature in Celsius: ");
            intake = input.nextInt();

            if (Character.isDigit(intake)){
                System.out.println("Invalid input");
                System.exit(0);
            }
            output = (intake * 5/9) +32;
        }


        System.out.println("The temperature in "+ temp +" is "+ output +".");



    }
}
