import cn.extremeprogramming.kata.GameNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameNumberTest {
    @Test
    public void should_say_1_when_raw_number_is_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals(gameNumber.toString(), ("1"));
    }
    @Test
    public void should_say_fizz_when_raw_number_is_3() {
        assertEquals(new GameNumber(3).toString(), ("Fizz"));
    }
    @Test
    public void should_say_buzz_when_raw_number_is_5() {
        assertEquals(new GameNumber(5).toString(), ("Buzz"));
    }
    @Test
    public void should_say_fizzbuzz_when_raw_number_is_15() {
        assertEquals(new GameNumber(15).toString(), ("FizzBuzz"));
    }
    @Test
    public void should_say_fizz_or_buzz_when_raw_number_contains_3_or_5() {
        assertEquals(new GameNumber(13).toString(), ("Fizz"));
        assertEquals(new GameNumber(51).toString(), ("FizzBuzz"));
        assertEquals(new GameNumber(52).toString(), ("Buzz"));
    }

}