package com.eulerproject.solution.Multiplesof3and5;

public class Solution {


    public static void main(String[] args) {


        int sum = 0;

        for (int i = 2; i < 1000; i++) {
            if (i % 3 == 0)
                sum += i;

            else if (i % 5 == 0)
                sum += i;

            else if (i % 15 == 0)
                sum -= i;

        }

        System.out.println(sum);
    }
}
