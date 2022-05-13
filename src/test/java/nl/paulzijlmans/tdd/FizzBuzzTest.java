package nl.paulzijlmans.tdd;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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

    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/fizzbuzz/small-test-data.csv")
    void testSmallDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/fizzbuzz/medium-test-data.csv")
    void testMediumDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }

    @ParameterizedTest(name="value={0}, expected={1}")
    @CsvFileSource(resources = "/fizzbuzz/large-test-data.csv")
    void testLargeDataFile(int value, String expected) {
        assertEquals(expected, FizzBuzz.compute(value));
    }
}
