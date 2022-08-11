
package com.bridgelabz.day5.Basics;

import java.util.Scanner;

public class VowelConsonant1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Characters");
        char ch = scanner.next().charAt(0);
        if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println("Enter Vowels");
        }else {
            System.out.println("Enter Consonants");
        }
        System.out.println(" ");
    }
}
