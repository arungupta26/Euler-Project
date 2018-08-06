package com.eulerproject.solution.nThPrimeNumber;

import java.util.Scanner;

/**
 * Calculates the nth prime number
 *
 * @author {Zyst}
 */
public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,
                i = 2,
                x = 2;

        System.out.printf("This program calculates the nth Prime number\n");
        System.out.printf("Please enter the nth prime number you want to find: ");
        n = input.nextInt();
        int counter = 1;
        for (i = 2; i <= n; i++) {
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    break;
                }
            }
            if (x == i) {
                System.out.printf(counter++ + "th prime number is ==> %d \n", x);
            }
        }
    }
}