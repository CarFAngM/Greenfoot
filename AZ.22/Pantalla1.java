import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pantalla1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pantalla1 extends World
{

    /**
     * Constructor for objects of class Pantalla1.
     * 
     */
    public Pantalla1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepararMundo1();
    }
    private void prepararMundo1(){
        addObject(new pizquierda(), 40,200);
        addObject(new pderecha(), 560,200);
        addObject(new parriba(), 300,40);
        addObject(new pabajo(), 300,360);
        addObject(new P1(), 300,200);
        addObject(new tanque1(), 60,60);
        addObject(new Tanque2(), 535,345);
        addObject(new PE1(), 90,70);
        addObject(new PE1(), 300,70);
        addObject(new PA1(), 300,100);
        addObject(new PA1(), 350,100);
        addObject(new PA1(), 180,100);
        addObject(new PE1(), 180,70);
        addObject(new PE1(), 300,200);
        addObject(new PE1(), 230,200);
        addObject(new PA1(), 258,230);
        addObject(new PA1(), 270,230);
        addObject(new PA1(), 258,170);
        addObject(new PA1(), 270,170);
        addObject(new PA1(), 120,155);
        addObject(new PE1(), 90,125);
        addObject(new PA1(), 120,220);
        addObject(new PE1(), 90,250);
        addObject(new PE1(), 90,275);
        addObject(new PA1(), 120,305);
        addObject(new PA1(), 170,305);
        addObject(new PA1(), 220,305);
        addObject(new PA1(), 270,305);
        addObject(new PE1(), 300,275);
        addObject(new PE1(), 300,245);
        addObject(new PE1(), 180,275);
        addObject(new PE1(), 500,275);
        addObject(new PA1(), 530,245);
        addObject(new PA1(), 470,305);
        addObject(new PA1(), 420,305);
        addObject(new PA1(), 370,305);
        addObject(new PA1(), 320,305);
        addObject(new PE1(), 400,332);
        addObject(new PE1(), 200,332);
        addObject(new PE1(), 360,130);
        addObject(new PA1(), 390,160);
        addObject(new PA1(), 440,160);
        addObject(new PE1(), 470,190);
        addObject(new PA1(), 390,220);
        addObject(new PA1(), 440,220);
    }
    public void eliminarBalaYTanque(Bala2 bala,Actor tanque) {
        removeObject(bala);
        removeObject(tanque);
    }
    public void eliminarBalaYTanque2(Bala bala, Actor tanque) {
        removeObject(bala);
        removeObject(tanque);
    }
    public void eliminarPared(Bala bala, Actor pared) {
        removeObject(bala);
        removeObject(pared);
    }
    public void eliminarPared2(Bala2 bala, Actor pared) {
        removeObject(bala);
        removeObject(pared);
    }
    public void intocables(Bala2 bala){
    removeObject(bala);
    }
    public void intocables2(Bala bala){
    removeObject(bala);
    }
}
