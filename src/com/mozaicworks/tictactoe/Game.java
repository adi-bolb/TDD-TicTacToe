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

    public void move(Player player, String move){
        // Record movements into a hash with player as key
        // and move as a value
    }

    public Player getWinner(){
        // Find if the current board contains three moves ending with
        // 1 (A1, B1, C1) and if it is the case return that player
        // from the hash
        return null;
    }
   }