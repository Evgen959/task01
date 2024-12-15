package service;

import service.interfeces.CatalanNamber;

import java.math.BigInteger;

// This class calculates the Catalan number. Since the Java class Math does not have a method for calculating the Catalan number, to save time, the implementation of the methods was taken from the Internet.

public class CatalanNumberImpl implements CatalanNamber {

    // Method for calculating factorial
    private BigInteger factorial(int n) {
        // Variable declaration. The variable type is BigInteger since result can be very large.
        BigInteger result = BigInteger.ONE;
        // Цикл
        for (int i = 2; i <= n; i++) {
            // The valueOf method converts an int or long number to a BigInteger.
            // The multiply method multiplies two BigInteger objects, a result object and a BigInteger.valueOf(i) object.
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    // Method for calculating the Catalan number
    @Override
    public BigInteger catalan(int n) {
        // The condition is that the number n is not negative
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        BigInteger numerator = factorial(2 * n); // (2n)!
        BigInteger denominator = factorial(n).multiply(factorial(n + 1)); // n! * (n+1)!
        // divide - method performs division
        return numerator.divide(denominator); // C_n = (2n)! / (n! * (n+1)!)
    }
}
