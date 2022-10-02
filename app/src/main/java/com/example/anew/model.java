package com.example.anew;

public class model
{
    private int[][] board;
    private int currTurn;
    private final int ROWS=3,COLS=3;

    public enum GAME_STATUS
    {
        ONGOING,TIE,WIN;
    }
    public enum PLAYER_SYMB
    {
        NO,X,O;
    }
    public model()
    {
        currTurn=0;
        board=new int[ROWS][COLS];
    }

    public boolean isLeagal(int row, int col)
    {
        return this.board[row][col]==0;
    }
    public boolean checkWin()
    {
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j <board[0].length; j++)
            {


            }
        }
        return true;
    }
    public void doMove(int row, int col, int player)
    {
        if(isLeagal(row,col))
        {
            board[row][col]=player;
        }
    }

}
