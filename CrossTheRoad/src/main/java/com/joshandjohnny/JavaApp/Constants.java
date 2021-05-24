package com.joshandjohnny.JavaApp;
public class Constants {
    
    public static final int screenWidth = 400;
    public static final int screenHeight = 800;
    public static final int gameUnit = 25;

    public static float timeStarted = System.nanoTime();

    public static float getTime() {
        return (float)((System.nanoTime() - timeStarted) *1E-9);  
    }
}

//#########
//## 
//#########

