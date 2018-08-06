package com.eulerproject.solution.Smallestmultiple;

public class Solution {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int result = 0;

        for (int i = 2520; i > 0; i++) {
            if (findsmallestLCM(i)) {
                result = i;
                break;
            }
        }

        System.out.print("Result: " + result +
                ".\nTime required nanoseconds: " +
                (System.nanoTime() - startTime) + ".");
    }

    public static boolean findsmallestLCM(int i) {
        return i % 2 == 0 &&
                i % 3 == 0 &&
                i % 4 == 0 &&
                i % 5 == 0 &&
                i % 6 == 0 &&
                i % 7 == 0 &&
                i % 8 == 0 &&
                i % 9 == 0 &&
                i % 10 == 0 &&
                i % 11 == 0 &&
                i % 12 == 0 &&
                i % 13 == 0 &&
                i % 14 == 0 &&
                i % 15 == 0 &&
                i % 16 == 0 &&
                i % 17 == 0 &&
                i % 18 == 0 &&
                i % 19 == 0 &&
                i % 20 == 0;
    }
}