package com.eulerproject.solution.LargestSeriesProductCalculator;

public class Solution {

    private byte[] digits = null;

    Solution(String str) {
        if (str == null)
            throw new IllegalArgumentException("String to search must be non-null.");

        digits = new byte[str.length()];
        for (int i = 0; i < digits.length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9')
                throw new IllegalArgumentException("String to search may only contains digits.");
            digits[i] = (byte) (c - '0');
        }
    }

    public long calculateLargestProductForSeriesLength(int n) {
        if (n > digits.length)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if (n < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        if (n == 0) return 1;

        long prod = 1, max = 0;
        byte[] priors = new byte[n];
        for (int i = 0, m = 0; i < digits.length; i++) {
            byte d = digits[i];
            if (d == 0) {
                m = 0;
                prod = 1;
            } else {
                prod *= d;
                m += 1;
                if (m > n) prod /= priors[i % n];
                priors[i % n] = d;
                if (m >= n && prod > max) max = prod;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        final Solution calculator = new Solution("7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450");

        final long actualProduct = calculator.calculateLargestProductForSeriesLength(13);

        System.out.println(actualProduct);

    }
}
