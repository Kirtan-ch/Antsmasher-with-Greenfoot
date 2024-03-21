import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ant extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int lives=3;
    public void act()
    {
        setLocation(getX(), getY() +1);
        
        
        gameOver();
        
    }
    private void smashAnt() {
        //getWorld().removeObject(this);
        GreenfootImage smashedAntImage = new GreenfootImage("sant1.png");
        SmashedAnt smashedAnt = new SmashedAnt();
        smashedAnt.setImage(smashedAntImage);
        getWorld().addObject(smashedAnt, getX(), getY());
        
        //Timer timer = new Timer(60);
        //timer.start();
        //smashedAnt.setTimer(timer);
        //Greenfoot.delay(60);
        //getWorld().removeObject(smashedAnt);
    }
    public void pop() 
    {
        Greenfoot.playSound("smash.wav");
        ((Background) getWorld()).countPop();
        smashAnt();
        getWorld().removeObject(this);
        
    }
    public void gameOver()
    {
        getWorld().showText("Lives: "+lives,70,500);
        if (isAtEdge())  
        {
            
            lives=lives-1;
            getWorld().showText(""+lives,100,100);
            if(lives ==0){
                
                ((Background) getWorld()).gameOver();
            
            }
            getWorld().removeObject(this);
            
        }
        
    }
}
