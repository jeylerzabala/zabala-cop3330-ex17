package ex17;

/*

*  UCF COP3330 Summer 2021 Assignment 1 Solution
*  Copyright 2021 Jeyler Zabala

Exercise 17 - Blood Alcohol Calculator
Sometimes you have to perform a more complex calculation based on some provided inputs
and then use that result to make a determination.

Create a program that prompts for your weight, gender,
total alcohol consumed (in ounces), and the amount of time since your last drink.
Calculate your blood alcohol content (BAC) using this formula

BAC = (A × 5.14 / W × r) − .015 × H
where

A is total alcohol consumed, in ounces (oz).
W is body weight in pounds.
r is the alcohol distribution ratio:
0.73 for men
0.66 for women
H is number of hours since the last drink.
Display whether or not it’s legal to drive by comparing the blood alcohol content to 0.08.

Example Output
Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 3
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.049323
It is legal for you to drive.


Enter a 1 is you are male or a 2 if you are female: 1
How many ounces of alcohol did you have? 5
What is your weight, in pounds? 175
How many hours has it been since your last drink? 1

Your BAC is 0.092206
It is not legal for you to drive.

Constraint
Prevent the user from entering non-numeric values.
Challenges
Handle metric units.
Look up the legal BAC limit by state and prompt for the state.
Display a message that states whether or not it’s legal to drive based on the computed BAC.
Develop this as a mobile application that makes it easy to record each drink,
updating the BAC each time a drink is entered.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int ounces, weight, hours;
        double rMen, rWomen, menBAC, womenBAC, BAC;
        rMen = 0.73;
        rWomen = 0.66;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        String gender = in.nextLine();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many ounces of alcohol did you have? ");
        ounces = sc.nextInt();

        System.out.print("What is your weight, in pounds? ");
        weight = sc.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        hours = sc.nextInt();

        // BAC = (A × 5.14 / W × r) − .015 × H

        menBAC = (ounces * 5.14/weight * rMen) - .015 * hours;
        womenBAC = (ounces * 5.14/weight * rWomen) -  .015 * hours;

        if (gender.equals("1")) {
            if(menBAC >= 0.08) {
                System.out.println("Your BAC is " + menBAC +"\nIt is not legal for you to drive.");
            }
            else {
                System.out.println("Your BAC is " + menBAC +"\nIt is legal for you to drive.");}
        }
        else if (gender.equals ("2")) {
            if(womenBAC >= 0.08) {
                System.out.println("Your BAC is " + womenBAC +"\nIt is not legal for you to drive.");
            }
            else {
                System.out.println("Your BAC is " + womenBAC +"\nIt is legal for you to drive.");}
        }

    }
}
