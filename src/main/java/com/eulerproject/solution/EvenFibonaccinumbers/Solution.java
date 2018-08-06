package com.eulerproject.solution.EvenFibonaccinumbers;

public class Solution {

    public static void main(String[] args) {

        int num1 = 0, num2 = 1, sum = 0;

        for (int i = 0; true; i++) {

            int res = fibonacci(num1, num2);
            num1 = num2;
            num2 = res;
            System.out.println(num1+","+num2);
            if (res > 4 * 1000000)
                break;

            if (res % 2 == 0) {
                sum += res;
            }

        }

        System.out.println(sum);
    }

    private static int fibonacci(int num1, int num2) {
        return num1 + num2;
    }


}
