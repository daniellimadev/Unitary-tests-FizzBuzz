package com.github.daniellimadev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FizzBuzzTest {

    @Test
    public void testIsDivisibleBy3() {
        assertTrue(FizzBuzz.isDivisibleBy3(3));
        assertTrue(FizzBuzz.isDivisibleBy3(6));
        assertFalse(FizzBuzz.isDivisibleBy3(4));
        assertFalse(FizzBuzz.isDivisibleBy3(5));
    }

    @Test
    public void testIsDivisibleBy5() {
        assertTrue(FizzBuzz.isDivisibleBy5(5));
        assertTrue(FizzBuzz.isDivisibleBy5(10));
        assertFalse(FizzBuzz.isDivisibleBy5(3));
        assertFalse(FizzBuzz.isDivisibleBy5(7));
    }

    @Test
    public void testIsDivisibleBy3And5() {
        assertTrue(FizzBuzz.isDivisibleBy3And5(15));
        assertTrue(FizzBuzz.isDivisibleBy3And5(30));
        assertFalse(FizzBuzz.isDivisibleBy3And5(3));
        assertFalse(FizzBuzz.isDivisibleBy3And5(5));
    }

    @Test
    public void testGetValueThatIsNotDividedBy3And5() {
        assertEquals("1", FizzBuzz.getFizzBuzzValue(1));
        assertEquals("2", FizzBuzz.getFizzBuzzValue(2));
        assertEquals("4", FizzBuzz.getFizzBuzzValue(4));
    }
}
