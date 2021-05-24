package com.Entitys;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.joshandjohnny.JavaApp.Constants;

import org.w3c.dom.css.Rect;

public abstract class Entity {
    
    private Rectangle hitbox;
    private int[] xycoord = new int[2];
    private BufferedImage[] sprites;
    private double xVelocity, yVelocity;

    public Entity(int x, int y) {

        this.xycoord[0] = x;
        this.xycoord[1] = y;
        this.hitbox = new Rectangle(this.xycoord[0], this.xycoord[1], Constants.gameUnit, Constants.gameUnit);

    }

    protected int[] xycoords() { return this.xycoords();}
    protected Rectangle hitbox() { return this.hitbox;}
    protected double xVelocity() { return this.xVelocity;}
    protected double yVelocity() {return this.yVelocity;}
    protected BufferedImage[] sprites() { return this.sprites;} 
    protected void setX(int x) { this.xycoord[0] = x;}
    protected void setY(int y) { this.xycoord[1] = y;}
    protected void setYVel(double yVel){this.yVelocity = yVel;}
    protected void setXVel(double xVel){this.xVelocity = xVel;}
    protected void setSprites(BufferedImage[] sprites) {this.sprites = sprites;}

	public void paintComponent(Graphics g) {}

}
