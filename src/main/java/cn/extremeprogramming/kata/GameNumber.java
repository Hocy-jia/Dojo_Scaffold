package cn.extremeprogramming.kata;

import static java.lang.String.valueOf;

public class GameNumber {
    private int rawNumber;

    public GameNumber(int rawNumber) {

        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedTo(3) && isRelatedTo(5))
            return "FizzBuzz";

        if (isRelatedTo(3)) {
            return "Fizz";
        }
        if (isRelatedTo(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }

    private boolean isRelatedTo(int denominator) {
        return rawNumber % denominator == 0 || valueOf(rawNumber).contains(valueOf(denominator));
    }
}
