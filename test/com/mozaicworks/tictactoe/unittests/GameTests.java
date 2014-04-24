package com.mozaicworks.tictactoe.unittests;

import com.mozaicworks.tictactoe.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTests {

    private Game game;
    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void whenGameStartsItIsNotOver(){
        game.start();

        assertEquals(false, game.isOver());
    }

    @Test
    public void whenGameStartsTheBoardIsEmpty(){
        game.start();

        assertEquals(true, game.boardIsEmpty());
    }

    @Test
    public void gameHasXAsPlayer(){
        assertEquals(Player.X(), game.getFirstPlayer());
    }

    @Test
    public void gameHasOAsSecondPlayer(){
        assertEquals(Player.O(), game.getSecondPlayer());
    }
}