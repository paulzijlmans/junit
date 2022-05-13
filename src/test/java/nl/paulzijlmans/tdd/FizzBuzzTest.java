package nl.paulzijlmans.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void testForDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.compute(3), "Should return Fizz");
    }

    @Test
    void testForDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.compute(5), "Should return Buzz");
    }

    @Test
    void testForDivisibleByThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    @Test
    void testForNotDivisibleByThreeAndFive() {
        assertEquals("1", FizzBuzz.compute(1), "Should return FizzBuzz");
    }
}
