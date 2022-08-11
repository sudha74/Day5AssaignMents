package com.bridgelabz.day5.Basics;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of n");
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("2^0 is 1");
        } else {
            int i = 0;
            while (i < n) {
                int result = (int) Math.pow(2, i);
                System.out.println("2^i " + result);
                i++;
            }
        }
    }
}


