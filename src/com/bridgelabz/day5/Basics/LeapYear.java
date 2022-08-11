package com.bridgelabz.day5.Basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println("Enter LeapYear");
        } else {
            System.out.println("Enter Not LeapYear");
        }
        System.out.println("Enter Actual Year");
    }
}


