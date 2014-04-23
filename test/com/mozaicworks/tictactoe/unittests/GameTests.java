package com.mozaicworks.tictactoe.unittests;

import com.mozaicworks.tictactoe.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class GameTests {

    @Test
    public void testAdd(){
        Game game = new Game();
        assertEquals(2,game.add(1,1));
    }
}