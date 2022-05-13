package nl.paulzijlmans.tdd;

public class FizzBuzz {
    /*
        If number is divisible by 3, print Fizz
        If number is divisible by 5, print Buzz
        If number is divisible by 3 and 5, print FizzBuzz
        If number is NOT divisible by 3 and 5, print the number
     */

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";

    public static String compute(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return FIZZBUZZ;
        }
        if (number % 3 == 0) {
            return FIZZ;
        }
        if (number % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(number);
    }
}
