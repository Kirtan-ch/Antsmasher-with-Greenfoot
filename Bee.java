import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //if (!isTouching(Background.class)) {
        //setLocation(getX(), getY() + 1); 
        //}
        setLocation(getX(), getY() + 1);
        if (isAtEdge())  {
            getWorld().removeObject(this);
        }
        //if (getY() == 0) 
        //{
          //  ((Background) getWorld()).gameOver();
        //}
    }
    public void pop() 
    {
        Greenfoot.playSound("smash.wav");
        ((Background) getWorld()).countPop();
        getWorld().removeObject(this);
    }
}
