import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Graphics here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Graphics
{

    /*create private variables of Greenfoot images that will be used for: x image, y image, board
    create private x and y variables relating to the coordinate where the x and o image will be set to for each space in the grid ex. "private int space00_x priavte int space01_y"
    Tic tac toe board:
    Space (0,2) | Space (1,2) | Space (2,2)   
    -----------------------------------------
    Space (0,1) | Space (1,1) | Space (2,1) 
    -----------------------------------------
    Space (0,0) | Space (1,0) | Space (2,0) 
     */
    /**
     * Creates the board and prints it onto the screen
     */
    public void board()
    {

    }

    /**
     * @param (x,y) coordinate of the piece that will be played with (0 , 0) in the bottom left corner of the board
     * places X image on the coordinate
     */
    public void setXImage(int x, int y)
    {

    }

    /**
     * @param (x,y) coordinate of the piece that will be played with (0 , 0) in the bottom left corner of the board
     * places Y image on the coordinate
     */
    public void setYImage(int x, int y)
    {

    }

}
