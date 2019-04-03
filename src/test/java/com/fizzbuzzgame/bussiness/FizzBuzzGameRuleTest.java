package com.fizzbuzzgame.bussiness;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by hotice on 2019/4/3.
 */
public class FizzBuzzGameRuleTest {


    @Test
    public void executeTest() {
        Rule rule = new FizzBuzzGameRule();
        assertEquals(
                "if a number is divisible by 3 and 5 then return FizzBuzz",
                "FizzBuzz",
                rule.execute(15));


        assertEquals(
                "if a number is has 3 and 5 in it then return FizzBuzz",
                "FizzBuzz",
                rule.execute(53));


        assertEquals(
                "if a number is divisible by 3 or if it has 3 in it then return Fizz",
                "Fizz",
                rule.execute(9));

        assertEquals(
                "if a number is divisible by 3 or if it has 3 in it then return Fizz",
                "Fizz",
                rule.execute(31));

        assertEquals(
                "if a number is divisible by 5 or if it has 5 in it then return Buzz",
                "Buzz",
                rule.execute(40));

        assertEquals(
                "if a number is divisible by 5 or if it has 5 in it then return Buzz",
                "Buzz",
                rule.execute(52));
    }
}
