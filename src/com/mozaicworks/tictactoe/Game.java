package com.mozaicworks.tictactoe;

public class Game {

    public void start(){

    }

    public Boolean isOver(){

        return false;
    }

    public Boolean boardIsEmpty()
    {
        return true;
    }

    public Player getFirstPlayer(){
        return Player.X();
    }

    public Player getSecondPlayer(){
        return Player.O();
    }
   }