import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmashedFly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmashedFly extends Actor
{
    int count=0;
    /**
     * Act - do whatever the SmashedFly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (count++>120){
            getWorld().removeObject(this);
        }
        // Add your action code here.
    }
}
