import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor
{
    /**
     * Act - do whatever the Bomba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isTouching(Tanque2.class)) {
            Tanque2 tanque = (Tanque2) getOneIntersectingObject(Tanque2.class);
            if (tanque != null) {
                tanque.setBombazo(true);
                getWorld().removeObject(this); // Eliminar la bomba después de que se toca con Tanque2
            }
        }
        if (isTouching(tanque1.class)) {
            tanque1 tanque = (tanque1) getOneIntersectingObject(tanque1.class);
            if (tanque != null) {
                tanque.setBombazo(true);
                getWorld().removeObject(this); // Eliminar la bomba después de que se toca con Tanque2
            }
        }
    }
}
