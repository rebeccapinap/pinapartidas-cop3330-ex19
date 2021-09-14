package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double bmi = 0;

        // Determines if BMI is above, below, or average
        System.out.print("What is your height? ");
        double height = input.nextInt();

        System.out.print("What is your weight? ");
        double weight = input.nextInt();

        bmi = ((weight / (height * height)) * 703);

        if (bmi >= 18.5 && bmi <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else if (bmi < 18.5)
        {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if (bmi > 25)
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
