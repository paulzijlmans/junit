package nl.paulzijlmans.tdd;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;

    public static String compute(int number) {
        if (isDivisibleByThreeAndFive(number)) {
            return FIZZBUZZ;
        }
        if (isDivisibleByThree(number)) {
            return FIZZ;
        }
        if (isDivisibleByFive(number)) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private static boolean isDivisibleByThreeAndFive(int number) {
        return isDivisibleByThree(number) && isDivisibleByFive(number);
    }

    private static boolean isDivisibleByThree(int number) {
        return isDivisibleBy(number, FIZZ_DIVISOR);
    }

    private static boolean isDivisibleByFive(int number) {
        return isDivisibleBy(number, BUZZ_DIVISOR);
    }

    private static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
