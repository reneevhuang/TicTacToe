import greenfoot.*;
public abstract class Audio  
{
    
    public GreenfootSound applause = new GreenfootSound("applause2.mp3");
    public GreenfootSound boo = new GreenfootSound("boo2.mp3");
    public GreenfootSound move = new GreenfootSound("BOUNCE.mp3");
    //must inlcude audio files 
    /**
     * Plays player 1's audio success clipping
     */
    public void player1SuccessSound()
    {
        applause.play();
    }
    
    /**
     * Plays player 2's audio success clipping
     */
    public void player2SuccessSound()
    {
        applause.play();
    }
    
    /**
     * Player move audio clipping
     */
    public void moveSound()
    {
        move.play();
    }
    
    /**
     * Computer winning audio clipping
     */
    public void computerWins()
    {
        boo.play();
    }
    }
