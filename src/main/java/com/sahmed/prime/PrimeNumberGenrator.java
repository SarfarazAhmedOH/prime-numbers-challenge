package com.sahmed.prime;

import java.util.List;

public interface PrimeNumberGenrator {
    List<Integer> generate(int startingValue, int endingValue);
    boolean isPrime(int value);
}

