package com.eulerproject.solution.SummationOfPrimes;

public class Solution {

    public static void main(String[] args) {
        long sum = 0;
        for (int i = 2; i < 2000000; i++) {
            if (checkPrimeNumber(i)) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum is " + sum);
    }

    public static boolean checkPrimeNumber(int num) {
        int temp;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
