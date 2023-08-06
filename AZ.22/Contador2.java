import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador2 extends Actor
{
    /**
     * Act - do whatever the Contador2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int contador=0;
    public void act()
    {
        // Add your action code here.
    }
    public int getContador() {
        return contador;
    }
    public void setContador(int value) {
    contador += value;
}
}
