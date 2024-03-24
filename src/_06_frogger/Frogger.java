package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int X;
    int Y;
    int carSpeed = 20;
    int carSize = 75;
    int carX = 50;
    int carY = 350;
    int TopCarY = 150;
    Car car;
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
            	Y = Y - 3;
                //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
            	Y = Y + 3;
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
            	X = X+3;
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
            	X = X-3;
                //Frog X position goes left
            }
        }
    }
    @Override
    public void setup() {
    	   car = new Car(carX, carY, carSize, carSpeed);
    }

    @Override
    public void draw() {
background(10, 83, 175);
fill(16, 150, 82);
ellipse(375, 500, 45, 45);
fill(107, 0, 0);
car.move();
rect(car.carX , carY,  carSize, 50);
car.topMove();
fill(16, 97, 156);
rect(car.topCarX, TopCarY, carSize, 50);
    }
    public void walls(int X, int Y) {
    	if(X >= 550) {
    		if(keyCode == RIGHT) {
    			X = 550;
    		}
    	}
    	if(X <= 50) {
    		if(keyCode == LEFT) {
    			X = 50;
    		}
    	}
    	if(Y <= 0) {
    		if(keyCode == UP) {
    			Y = 0;
    		}
    	}
	if(Y >= 800) {
		if(keyCode == UP) {
			Y = 800;
		}
	}
	
}
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
