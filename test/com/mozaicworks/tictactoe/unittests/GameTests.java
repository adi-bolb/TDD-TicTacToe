package com.mozaicworks.tictactoe.unittests;

import com.mozaicworks.tictactoe.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTests {

    @Test
    public void WhenGameStartsItIsNotOver(){
        Game game = new Game();
        game.start();

        assertEquals(false, game.isOver());
    }
}