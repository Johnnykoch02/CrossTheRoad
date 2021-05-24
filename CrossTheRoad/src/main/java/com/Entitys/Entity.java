package com.Entitys;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.joshandjohnny.JavaApp.Constants;

public abstract class Entity {
    
    private Rectangle hitbox;
    private int[] xycoord = new int[2];
    private BufferedImage[] sprites;
    private double xVelocity;
    private double yVelocity;

    public Entity(int x, int y) {

        this.xycoord[0] = x;
        this.xycoord[1] = y;
        this.hitbox = new Rectangle(this.xycoord[0], this.xycoord[1], Constants.gameUnit*2, Constants.gameUnit*2);

    }

    


}
