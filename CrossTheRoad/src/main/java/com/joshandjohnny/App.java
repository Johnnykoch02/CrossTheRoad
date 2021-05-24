package com.joshandjohnny;

import javax.swing.JFrame;
import java.awt.Color;

import com.joshandjohnny.JavaApp.Application;
import com.joshandjohnny.JavaApp.Constants;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("CrossTheRoad: by Josh and Johnny");
		frame.setSize(Constants.screenWidth, Constants.screenHeight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setBackground(Color.white);
		frame.setVisible(true);
		Application app = new Application();
		frame.add(app);
		// frame.addKeyListener(app.getListener());
		frame.setContentPane(app);
		app.run();
    }
}
