package com.mozaicworks.tictactoe.acceptancetests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import com.mozaicworks.tictactoe.*;

public class TicTacToeTests {

    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    // TODO: Make this test pass by implementing the methods in
    // the Game class
    @Test
    public void XWinsOnColumn(){
        startGame();
        move(Player.X(),"A1");
        move(Player.O(),"A2");
        move(Player.X(),"B1");
        move(Player.O(),"B2");
        move(Player.X(),"C1");

        assertXWon();
    }

    public void startGame(){
        game.start();
    }

    public void move(Player player, String move){
        game.move(player, move);
    }

    public void assertXWon(){
        assertEquals(Player.X(), game.getWinner());
    }
}