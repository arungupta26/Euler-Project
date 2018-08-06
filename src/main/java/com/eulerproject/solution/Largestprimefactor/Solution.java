package com.eulerproject.solution.Largestprimefactor;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {


        long testNum = 600851475143l;
        int maxFactor = 0;

        for (int i = 2; i < Math.sqrt(testNum); i++) {
            if (testNum % i == 0 && checkPrimeFactor(i))
                maxFactor = i;

        }

        System.out.println(maxFactor);

    }

    private static boolean checkPrimeFactor(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }
}
