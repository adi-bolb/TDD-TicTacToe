package com.mozaicworks.tictactoe.acceptancetests;

import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTests {

    @Test
    public void XWinsOnColumn(){
        startGame();
        move("X","A1");
        move("0","A2");
        move("X","B1");
        move("0","B2");
        move("X","C1");

        assertXWon();
    }

    void startGame(){
    }

    void move(String player, String move){
    }

    void assertXWon(){
        assertEquals(true, false);
    }
}