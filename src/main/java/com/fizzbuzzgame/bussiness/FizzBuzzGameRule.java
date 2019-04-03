package com.fizzbuzzgame.bussiness;

/**
 * Created by hotice on 2019/4/3.
 */
public class FizzBuzzGameRule implements Rule<String, Integer> {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final int ZERO = 0;
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final String THREE_STRING = "3";
    private static final String FIVE_STRING = "5";

    /**
     * A number is Fizz if it is divisible by 3 or if it has 3 in it.
     * A number is Buzz if it is divisible by 5 or if it has 5 in it.
     * A number is FizzBuzz if it is divisible by 3 and 5 or if it has 3 and 5 in it.
     * @param value A number
     * @return  Fizz or Buzz or FizzBuzz
     */
    public String execute(Integer value) {
        //if a number is divisible by 3 and 5 then return FizzBuzz
        if(value % THREE == ZERO) {
            if(value % FIVE == ZERO) {
                return FIZZ_BUZZ;
            }
        }

        //if a number is has 3 and 5 in it then return FizzBuzz
        String valueString = Integer.toString(value);
        if(valueString.contains(THREE_STRING) && valueString.contains("5")) {
            return FIZZ_BUZZ;
        }

        //if a number is divisible by 3 or if it has 3 in it then return Fizz
        if(value % THREE == ZERO || Integer.toString(value).contains(THREE_STRING)) {
            return FIZZ;
        }

        //if a number is divisible by 5 or if it has 5 in it then return Buzz
        if(value % FIVE == ZERO || Integer.toString(value).contains(FIVE_STRING)) {
            return BUZZ;
        }

        return Integer.toString(value);
    }
}
