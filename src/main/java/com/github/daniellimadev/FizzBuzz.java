package com.github.daniellimadev;

public class FizzBuzz {

    public static boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }

    public static boolean isDivisibleBy5(int n) {
        return n % 5 == 0;
    }

    public static boolean isDivisibleBy3And5(int n) {
        return n % 3 == 0 && n % 5 == 0;
    }

    public static String getFizzBuzzValue(int n) {
        if (isDivisibleBy3And5(n)) {
            return "FizzBuzz";
        } else if (isDivisibleBy3(n)) {
            return "Fizz";
        } else if (isDivisibleBy5(n)) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }

    public static void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }

    public static void main(String[] args) {
        int n = 15;
        printFizzBuzz(n);
    }
}