package com.bridgelabz;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("rows which i need in diamond");
        int noOfRows = scanner.nextInt();
        int midRow = (noOfRows) / 2;
        int row = 1;
        System.out.println(" ");
        // Printing upper half of the diamond
        for (int i = midRow; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
            row++;
        }
        // Printing lower half of the diamond
        for (int i = 0; i <= midRow; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = row; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
            row--;
        }
    }
}


