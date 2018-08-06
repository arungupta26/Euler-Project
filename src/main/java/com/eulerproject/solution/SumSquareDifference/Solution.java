package com.eulerproject.solution.SumSquareDifference;


public class Solution {


    public static void main(String[] args) {



        int n  =100;
        int sum = 0 ;
        double squareSum = 0;


        for(int i=1; i<=n ; i++)
        {
            sum+=i;
            squareSum+=Math.pow(i, 2);
        }
        System.out.printf("Difference is : %f\n", Math.pow(sum,2) - squareSum);
    }
}
