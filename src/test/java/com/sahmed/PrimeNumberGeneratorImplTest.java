package com.sahmed;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.sahmed.prime.PrimeNumberGeneratorImpl;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for prime numbers generator.
 */
public class PrimeNumberGeneratorImplTest
{
    private PrimeNumberGeneratorImpl primeNumber = new PrimeNumberGeneratorImpl();

    /**
     * 0 is not prime test
     */
    @Test
    public void zeroIsPrimeFalseTest()
    {

        assertFalse( primeNumber.isPrime(0));
    }
    /**
     * 1 is not prime test
     */
    @Test
    public void oneIsPrimeFalseTest()
    {

        assertFalse( primeNumber.isPrime(1));
    }

    /**
     * odd number is not prime test
     */
    @Test
    public void oddNumberIsPrimeFalseTest()
    {

        assertFalse( primeNumber.isPrime(81));
    }

    /**
     * even number is not prime test
     */
    @Test
    public void evenNumberIsPrimeFalseTest()
    {

        assertFalse( primeNumber.isPrime(100));
    }

    /**
     * prime number test - results in TRUE
     */
    @Test
    public void isPrimeTrueTest()
    {
        assertTrue( primeNumber.isPrime(2));
        assertTrue( primeNumber.isPrime(3));
        assertTrue( primeNumber.isPrime(5));
        assertTrue( primeNumber.isPrime(89));
        assertTrue( primeNumber.isPrime(97));
    }

    /**
     * Invalid range test
     */
    @Test
    public void invalidRangeGenerateEmptyListTest()
    {
        List<Integer> listOfPrime = primeNumber.generate(-15, 10);
        assertTrue(listOfPrime.size() == 0);
        listOfPrime = primeNumber.generate(15, -10);
        assertTrue(listOfPrime.size() == 0);
    }

    /**
     * Valid range - return list of prime numbers test
     */
    @Test
    public void validRangeGenerateListTest()
    {
        List<Integer> listOfPrime = primeNumber.generate(7900, 7920);
        assertTrue(listOfPrime.contains(7901));
        assertTrue(listOfPrime.contains(7907));
        assertTrue(listOfPrime.contains(7919));
    }

    /**
     * Valid reverse range - return list of prime numbers test
     */
    @Test
    public void validReverseRangeGenerateListTest()
    {
        List<Integer> listOfPrime = primeNumber.generate(7920, 7900);
        assertTrue(listOfPrime.contains(7901));
        assertTrue(listOfPrime.contains(7907));
        assertTrue(listOfPrime.contains(7919));
    }

}
