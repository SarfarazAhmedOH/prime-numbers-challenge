package com.sahmed;

import com.sahmed.prime.PrimeNumberGeneratorImpl;

import java.util.List;
import java.util.Scanner;

/**
 * Prime Numbers Generator for a given range
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter the range to generate Prime Numbers!" );
        // scanner to read the command-line input
        Scanner scanner = new Scanner(System.in);
        // Prompt for starting value of the range
        System.out.print("Starting Value: ");
        // read starting value
        int start = scanner.nextInt();
        System.out.print("Ending Value: ");
        // read ending value
        int end = scanner.nextInt();

        // Create an instance of Prime Number Generator
        PrimeNumberGeneratorImpl primeNumberGenerator = new PrimeNumberGeneratorImpl();

        List<Integer> list = primeNumberGenerator.generate(start, end);
        System.out.println("Prime numbers in the given range are: ");
        list.forEach(System.out::println);
    }
}
