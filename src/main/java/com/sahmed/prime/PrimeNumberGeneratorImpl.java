package com.sahmed.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberGeneratorImpl implements PrimeNumberGenrator {

    /**
     * Generate prime numbers in a given range
     */
    public List<Integer> generate(int startingValue, int endingValue){
        List<Integer> primeNumbersList = new ArrayList<Integer>();

        if (startingValue < 0 || endingValue < 0){
            System.out.println("Invalid range...");
            return primeNumbersList;
        }
        int begin = startingValue;
        int end = endingValue;
        if (endingValue < startingValue) {
            begin = endingValue;
            end = startingValue;
        }
        return IntStream.rangeClosed(begin, end)
                .filter(x -> isPrime(x)).boxed()
                .collect(Collectors.toList());
    }

    /**
     * Generate prime numbers in a given range
     */
    public boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        return !IntStream.range(2, value).anyMatch(i -> value % i == 0);
    }
}
