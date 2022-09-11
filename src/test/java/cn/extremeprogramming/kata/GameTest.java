package cn.extremeprogramming.kata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void should_create_game_object_with_given_size() {
        Game game = new Game(100);
    }
    @Test
    public void should_provide_words_to_be_spoken() {
        Game game = new Game(100);
        List<String> wordsToBeSpoken =game.words();
        assertEquals(wordsToBeSpoken.size(), (100));
        assertEquals(wordsToBeSpoken.get(0), ("1"));

    }
    @Test
    public void should_say_fizz_when_raw_number_is_13() {
        assertEquals(new GameNumber(13).toString(), ("Fizz"));
    }
}
