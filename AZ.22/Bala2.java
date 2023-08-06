import greenfoot.*;
import greenfoot.Actor; 
import greenfoot.World;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public boolean escudo2 = false;
    private Contador contadorInstance = new Contador();
    public void act() {
    try {
        move(speed);
    
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        else {
            matar2();
        }
    } catch (Exception e) {
        // Detener las operaciones y cambiar al mundo "Menú"
       Greenfoot.setWorld(new INICIO());
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
         Tanque2 tanque2 = (Tanque2) getOneIntersectingObject(Tanque2.class);
            if (tanque2.escudo == true) {
                Pantalla1 mundo = (Pantalla1) getWorld();
                mundo.intocables(this);
            } else {
                Pantalla1 mundo = (Pantalla1) getWorld();
                mundo.eliminarBalaYTanque(this, Tanque2);
                int currentContadorValue = contadorInstance.getContador();
                contadorInstance.setContador(1);
            }
        }
    
    if (PA1!= null) {
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
    public boolean getPared() {
        
    return (isTouching(PA1.class) || isTouching(PE1.class) || isTouching(parriba.class) || isTouching(pabajo.class) || isTouching(pizquierda.class) || isTouching(pderecha.class));
}
public void setEscudo(boolean escudo2) {
        this.escudo2 = escudo2;
    }
}
