import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala2 extends Actor
{
    /**
     * Act - do whatever the Bala2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;

    public void act() {
        move(speed);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        } else {
            matar2();
        }
    }
    public void matar2(){
        Actor Tanque2 = getOneIntersectingObject(Tanque2.class);
        Actor PA1 = getOneIntersectingObject(PA1.class);
        Actor PE1 = getOneIntersectingObject(PE1.class);
        Actor parriba = getOneIntersectingObject(parriba.class);
        Actor pabajo = getOneIntersectingObject(pabajo.class);
        Actor pizquierda = getOneIntersectingObject(pizquierda.class);
        Actor pderecha = getOneIntersectingObject(pderecha.class);
        if (Tanque2 != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.eliminarBalaYTanque(this,Tanque2);
    }
    
    if (PA1 != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.eliminarPared2(this, PA1);
    }
    
    if (PE1 != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.eliminarPared2(this, PE1);
    }
    if (parriba != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables(this);
    }
    if (pabajo != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables(this);
    }
    if (pizquierda != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables(this);
    }
    if (pderecha != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables(this);
    }
    }
}
