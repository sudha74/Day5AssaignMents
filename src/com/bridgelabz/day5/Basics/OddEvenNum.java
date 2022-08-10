package com.bridgelabz.day5.Basics;

import java.util.Scanner;

public class OddEvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
