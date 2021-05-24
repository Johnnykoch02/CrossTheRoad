package com.Entitys.MovableEntity;
//#########
//## imports
//#########
import com.Entitys.Entity;
import java.awt.Rectangle;

public interface MovableEntity {
    
    /**
     * this method is used for physics operations on movable entities
     * @param dt is Amt. of time for one game-loop
     */
    public void physicsProcess(float dt);

    /**
     *Getter for hitbox
     * @return array-coords [0=x,1=y] 
     */
    public Rectangle getHB();

    /**
     * Getter for hitbox
     * @return array-coords [0=x,1=y]
     */
    public int[] getCoords();
    
}
