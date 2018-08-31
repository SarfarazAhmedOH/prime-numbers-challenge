package com.sahmed.prime;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberImpl implements PrimeNumberGenrator {
    public List<Integer> generate(int startingValue, int endingValue){
        List<Integer> primeNumbersList = new ArrayList<>();
        if (startingValue < 0 || endingValue < 0){
            System.out.println("Invalid range...");
        }
        return primeNumbersList;
    }

    public boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i < value; ++i){
            if (value % i == 0)
                return false;
        }
        return true;
    }
}
