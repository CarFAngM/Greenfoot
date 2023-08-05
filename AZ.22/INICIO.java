import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class INICIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class INICIO extends World
{

    /**
     * Constructor for objects of class INICIO.
     * 
     */
    public INICIO()
    {    
           // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act(){
        if (Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
            Greenfoot.setWorld(new Pantalla1());
        }
    }
    }

