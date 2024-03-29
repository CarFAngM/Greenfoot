import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor {
    private int speed = 5;
    public boolean escudo = false;    
    private Contador2 contadorInstance = new Contador2();
   public void act() {
    try {
        move(speed);
    
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
        else {
            matar1();
        }
    } catch (Exception e) {
        // Detener las operaciones y cambiar al mundo "Menú"
        Greenfoot.setWorld(new INICIO());
    }
}
    
    public void matar1() {
        Actor tanque1 = getOneIntersectingObject(tanque1.class);
        Actor PA1 = getOneIntersectingObject(PA1.class);
        Actor PE1 = getOneIntersectingObject(PE1.class);
        Actor parriba = getOneIntersectingObject(parriba.class);
        Actor pabajo = getOneIntersectingObject(pabajo.class);
        Actor pizquierda = getOneIntersectingObject(pizquierda.class);
        Actor pderecha = getOneIntersectingObject(pderecha.class);
       if (tanque1 != null) {
         tanque1 tanque3 = (tanque1) getOneIntersectingObject(tanque1.class);
            if (tanque3.escudo3 == true) {
                Pantalla1 mundo = (Pantalla1) getWorld();
                mundo.intocables2(this);
            } else {
                Pantalla1 mundo = (Pantalla1) getWorld();
                mundo.eliminarBalaYTanque2(this, tanque3);
                int currentContadorValue = contadorInstance.getContador();
                contadorInstance.setContador(1);
            }
        }
    
    if (PA1 != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.eliminarPared(this, PA1);
    }
    
    if (PE1 != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.eliminarPared(this, PE1);
    }
    if (parriba != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables2(this);
    }
    if (pabajo != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables2(this);
    }
    if (pizquierda != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables2(this);
    }
    if (pderecha != null) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables2(this);
    }
    if (escudo) {
        Pantalla1 mundo = (Pantalla1) getWorld();
        mundo.intocables2(this);
    }
    }
    public void setEscudo(boolean escudo) {
        this.escudo = escudo;
    }
}
