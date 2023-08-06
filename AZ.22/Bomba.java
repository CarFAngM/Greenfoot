import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomba extends Actor {
    private boolean toBeRemoved = false;

    public void act() {
        if (isTouching(Tanque2.class)) {
            Tanque2 tanque2 = (Tanque2) getOneIntersectingObject(Tanque2.class);
            if (tanque2 != null) {
                tanque2.setBombazo(true);
                toBeRemoved = true; // Marcar para eliminación
            }
        }
        if (isTouching(tanque1.class)) {
            tanque1 tanque = (tanque1) getOneIntersectingObject(tanque1.class);
            if (tanque != null) {
                tanque.setBombazo(true);
                toBeRemoved = true; // Marcar para eliminación
            }
        }

        if (toBeRemoved && getWorld() != null) {
            getWorld().removeObject(this); // Eliminar la bomba si está marcada para eliminación y aún está en el mundo
        }
    }
}
