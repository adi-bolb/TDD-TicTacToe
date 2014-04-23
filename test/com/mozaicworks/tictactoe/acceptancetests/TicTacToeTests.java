package com.mozaicworks.tictactoe.acceptancetests;

public class TicTacToeTests {
    public void XWinsOnColumn(){
        startGame();
        move("X","A1");
        move("0","A2");
        move("X","B1");
        move("0","B2");
        move("X","C1");

        assertXWon();
    }
}