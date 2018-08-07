package com.eulerproject.solution.SpecialPythagoreanTriplet;

public class Solution {


    public static void main(String[] args) {

        pythagoreanTriplets(1000);

    }

    static void pythagoreanTriplets(int limit) {

        // triplet: a^2 + b^2 = c^2
        int a, b, c = 0;

        // loop from 2 to max_limitit
        int m = 2;

        // Limiting c would limit
        // all a, b and c
        while (c < limit) {

            // now loop on j from 1 to i-1
            for (int n = 1; n < m; ++n) {
                // Evaluate and print
                // triplets using
                // the relation between
                // a, b and c
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;

                if (c > limit)
                    break;

                if (a + b + c == 1000) {
                    System.out.println(a + " " + b + " " + c + " ==> " + (a + b + c));
                    System.out.println("Product is " + a * b * c);
                    break;
                }

            }
            m++;
        }

    }

}
