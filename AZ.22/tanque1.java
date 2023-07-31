import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tanque1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanque1 extends Actor {
    private int speed = 3;
    private long lastShotTime = 0;
    private long shootingInterval = 5000;
    private boolean isTouchingParriba = false; // Variable para rastrear si está tocando "parriba"

    public void act() {
        int angle = getRotation();

        double radians = Math.toRadians(angle);
        int dx = (int) Math.round(speed * Math.cos(radians));
        int dy = (int) Math.round(speed * Math.sin(radians));

        if (Greenfoot.isKeyDown("right"))
            setRotation(getRotation() + 2);
        if (Greenfoot.isKeyDown("left"))
            setRotation(getRotation() - 2);

        // Solo permitir mover hacia abajo si no está tocando "parriba"
        if (Greenfoot.isKeyDown("down"))
            setLocation(getX() + dx, getY() + dy);

        // Permitir mover hacia arriba solo si no está tocando "parriba"
        if (Greenfoot.isKeyDown("up"))
            setLocation(getX() - dx, getY() - dy);

        if (Greenfoot.isKeyDown("0")) {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastShotTime >= shootingInterval) {
                dispararBala();
                lastShotTime = currentTime;
            }
        }

        if (isTouching(parriba.class)) {
            isTouchingParriba = true;
            // Ajustar la posición para que Tanque1 no pase a través de Parriba
            if (Greenfoot.isKeyDown("down")){
            setLocation(getX() - dx, getY() - dy);
            }
            if (Greenfoot.isKeyDown("up")){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    if (isTouching(pabajo.class)) {
            isTouchingParriba = true;
            // Ajustar la posición para que Tanque1 no pase a través de Parriba
            if (Greenfoot.isKeyDown("down")){
            setLocation(getX() - dx, getY() - dy);
            }
            if (Greenfoot.isKeyDown("up")){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    if (isTouching(pizquierda.class)) {
            isTouchingParriba = true;
            // Ajustar la posición para que Tanque1 no pase a través de Parriba
            if (Greenfoot.isKeyDown("down")){
            setLocation(getX() - dx, getY() - dy);
            }
            if (Greenfoot.isKeyDown("up")){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    if (isTouching(pderecha.class)) {
            isTouchingParriba = true;
            // Ajustar la posición para que Tanque1 no pase a través de Parriba
            if (Greenfoot.isKeyDown("down")){
            setLocation(getX() - dx, getY() - dy);
            }
            if (Greenfoot.isKeyDown("up")){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    if (isTouching(PA1.class)) {
            isTouchingParriba = true;
            // Ajustar la posición para que Tanque1 no pase a través de Parriba
            if (Greenfoot.isKeyDown("down")){
            setLocation(getX() - dx, getY() - dy);
            }
            if (Greenfoot.isKeyDown("up")){
            setLocation(getX() + dx, getY() + dy);
        }
    }
    if (isTouching(PE1.class)) {
            isTouchingParriba = true;
            // Ajustar la posición para que Tanque1 no pase a través de Parriba
            if (Greenfoot.isKeyDown("down")){
            setLocation(getX() - dx, getY() - dy);
            }
            if (Greenfoot.isKeyDown("up")){
            setLocation(getX() + dx, getY() + dy);
        }
    }
}
     private void dispararBala() {
        Bala2 bala = new Bala2();
        getWorld().addObject(bala, getX(), getY());
        bala.setRotation(getRotation()+180); // La bala toma la misma orientación que el tanque
    }
}
