/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game  
{

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        Player player1 = new Player();
        Player player2 = new Player();
        while(true)
        {
            player1.move();
            player2.move();
        }
    }

}
