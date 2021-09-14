package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;
import java.util.Calendar;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your current age?");
        String currentAge = sc.nextLine();
        System.out.println("At what age would you like to retire?");
        String retiredAge = sc.nextLine();

        Integer current = Integer.valueOf(currentAge);
        Integer retired = Integer.valueOf(retiredAge);

        System.out.println("You have " + (retired-current) + " years left until you can retire.");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("It's " + year + ", so you can retire in " +(year + (retired-current)));



    }
}