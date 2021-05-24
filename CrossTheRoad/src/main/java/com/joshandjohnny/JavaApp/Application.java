package com.joshandjohnny.JavaApp;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.Entitys.MovableEntity.Player;


public class Application extends JPanel  {

	public static boolean INSTANCE;
	private int gap;
	private boolean running;
	private Timer timer;
    private float dt;
	private Player test;

	public Application() {
        init();
    }
	public void init() {
        
        test = new Player(Constants.screenWidth/2, Constants.screenHeight/2);
		this.setVisible(true);
		this.setFocusTraversalKeysEnabled(true);
		this.addKeyListener(test);
		this.setSize(Constants.screenWidth,Constants.screenHeight);		
		running = true;
		
	}
	
	public void run() {	

        float timeStart = 0;
		
		while(running)
		{
            //#########
            //## Time Variable for DT
            //#########
			timeStart = Constants.getTime();
		
            
            test.physicsProcess(dt);
			repaint();
            //#########
            //## DT Calculation
            //#########
            dt = Constants.getTime() - timeStart;
            //System.out.println("RUNNING: " +  (1.0/dt));
		}
	}
		


	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//#########
        //## Sets Background
        //#########
		g.setColor(Color.black);
		g.fillRect(0, 0, Constants.gameUnit, Constants.gameUnit);
		
		//#########
         //## Draws Grid-Lines
         //#########
		for(int i = 0; i< Constants.screenHeight; i+=25) {
			g.drawLine(0, i, Constants.screenWidth, i);
		}
		for(int i = 0; i< Constants.screenWidth; i+=25) {
			g.drawLine(i, 0, i, Constants.screenHeight);
		}

        test.paintComponent(g);
        
		g.dispose();
	}

	}

