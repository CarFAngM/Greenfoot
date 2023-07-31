import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menú here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menú extends World
{

    /**
     * Constructor for objects of class Menú.
     * 
     */
    public Menú()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo();
        /*Greenfoot.playSound("intro.wav");*/
    }
    private void prepararMundo(){
        addObject(new OPCJugar(), 300,200);
    }
    public void act(){
        if (Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.setWorld(new Pantalla1());
        }
    }
    
}
