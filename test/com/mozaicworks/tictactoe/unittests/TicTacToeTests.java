package com.mozaicworks.tictactoe.unittests;

import com.mozaicworks.tictactoe.TicTacToe;
import org.junit.Test;
import static org.junit.Assert.*;

public class TicTacToeTests {

    @Test
    public void testAdd(){
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals(2,ticTacToe.add(1,1));
    }
}
