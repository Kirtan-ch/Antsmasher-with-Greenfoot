import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseMoved(null)) {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
        }
        
        // Pop
        if(Greenfoot.mouseClicked(null)) {
            int x = -getImage().getWidth()/3;
            int y = getImage().getHeight()/3;
            Ant ant = (Ant) getOneObjectAtOffset(x , y, Ant.class);
            Fly fly = (Fly) getOneObjectAtOffset(x , y, Fly.class);
            Bee bee = (Bee) getOneObjectAtOffset(x , y, Bee.class);
            if(ant != null) 
            {
                ant.pop();
            }
             if(fly != null) 
            {
                fly.pop();
            }
            if(bee!=null){
                //bee.pop();
                ((Background) getWorld()).gameOver();
            }
        }
    }
}
