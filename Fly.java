import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Actor
{
    public static int lives=3;
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() +1);
        gameOver();
        //if (getY() == 599) {
            //((Background) getWorld()).gameOver();
        //}
    }
    private void smashFly() {
        //getWorld().removeObject(this);
        GreenfootImage smashedFlyImage = new GreenfootImage("sfly1.png");
        SmashedFly smashedFly = new SmashedFly();
        smashedFly.setImage(smashedFlyImage);
        getWorld().addObject(smashedFly, getX(), getY());
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
        smashFly();
        getWorld().removeObject(this);
    }
    public void gameOver()
    {
        //getWorld().showText(""+lives,100,100);
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
