package com.Entitys.MovableEntity;
import java.awt.Rectangle;

//#########
//## imports
//#########
import com.Entitys.Entity;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;

public class Player extends Entity implements MovableEntity, KeyListener {
//#########
//## Variables:
//##  Rectangle hitbox
//##  int[] xycoord
//##  BufferedImage[] sprites
//##  double xVelocity, yVelocity
//#########
    public boolean keyJump;
    public boolean keyLeft;
    public boolean keyRight;
    public boolean keyDown;
    public boolean keyUp;

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(this.hitbox().x, this.hitbox().y, this.hitbox().width, this.hitbox().height);
        g.dispose();
    }

 @Override
    public void physicsProcess(float dt) {
        // TODO Auto-generated method stub

        //#########
        //## 
        //#########
        if(keyLeft && !keyRight)
        {
            this.setX(((Float)(super.xycoords()[0]*(-10)*dt)).intValue());
        }
        
        else if(!keyLeft && keyRight) 
        {
            this.setX(((Float)(super.xycoords()[0]*(10)*dt)).intValue());
        }
    }

    @Override
    public Rectangle getHB() {
        // TODO Auto-generated method stub
        return super.hitbox();
    }

    @Override
    public int[] getCoords() {
        // TODO Auto-generated method stub
        return super.xycoords();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("in KT");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("in KP");
        // TODO Auto-generated method stub
        switch(e.getKeyChar()){
            case 'a':
            this.keyLeft = true;
            break;

            case 'd':
            this.keyRight = true;
            break;

            case ' ':
            this.keyJump = true;
            break;

            case 'w':
            this.keyUp = true;
            break;

            case 's':
            this.keyDown = true;
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("in KR");
        switch(e.getKeyChar()){
            case 'a':
            this.keyLeft = false;
            break;

            case 'd':
            this.keyRight = false;
            break;

            case ' ':
            this.keyJump = false;
            break;

            case 'w':
            this.keyUp = false;
            break;

            case 's':
            this.keyDown = false;
            break;

        }
    }
 
}
