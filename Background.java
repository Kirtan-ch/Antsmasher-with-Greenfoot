import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    Counter counter = new Counter("Score: ");
    int lives = 3;
    
    //private boolean gameOver;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Background()
    {    
        super(400, 600, 1); 
        setPaintOrder(ScoreBoard.class, Player.class, Ant.class, Counter.class);

        
        populate();

        prepare();
        //gameOver=false;
    }
    public void act() 
    {
        if(Greenfoot.getRandomNumber(800) < 6) {
            addObject(new Ant(), Greenfoot.getRandomNumber(390), 0);   
        }
        if(Greenfoot.getRandomNumber(800) < 6) {
            addObject(new Fly(), Greenfoot.getRandomNumber(390), 0);   
        }
        if(Greenfoot.getRandomNumber(2000) < 6) {
            addObject(new Bee(), Greenfoot.getRandomNumber(390), 0);   
        }
        //if(!gameOver){
        //}
        //else{
          //  displayGameOverImage();
        //}
    }
    public void countPop()
    {
        counter.add(1);
    }
    public void gameOver() 
    {
        addObject(new ScoreBoard(counter.getValue()), getWidth()/2, getHeight()/2);
        Greenfoot.playSound("lost.wav");
        Greenfoot.stop();
        //gameOver=true;
    }
    //private void displayGameOverImage(){
      //  GreenfootImage gameOverImage = new GreenfootImage("bee.png");
        //getBackground().drawImage(gameOverImage, getWidth() / 2 - gameOverImage.getWidth() / 2, getHeight() / 2 - gameOverImage.getHeight() / 2);
    //}
    
    private void populate()
    {
        addObject(new Player(), 200, 300);

        addObject(counter, 90, 530);
    }
    
    private void prepare()
    {
        Ant.lives = 3;
        Fly.lives=3;
    }
}
