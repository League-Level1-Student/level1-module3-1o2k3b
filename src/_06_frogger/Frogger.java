package _06_frogger;

import javax.swing.JOptionPane;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int X = 322;
    int Y = 550;
    int targetX = X;
    int targetY = Y;
    int carSpeed = 5;
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
            if(keyCode == UP && targetY == Y)
            {
            	targetY = Y - 80;
            	
                //Frog Y position goes up
            }
            else if(keyCode == DOWN && targetY == Y)
            {
            	targetY = Y + 80;
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT && targetX == X)
            {
            	targetX = X + 80;
                //Frog X position goes right
            }
            else if(keyCode == LEFT && targetX == X)
            {
            	targetX = X - 80;
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
    	if(targetY<Y) {
    		Y = Y-8;
    	}
    	if(targetY>Y) {
    		Y = Y+8;
    	}
    	if(targetX>X) {
    		X = X+8;
    	}
     	if(targetX<X) {
    		X = X-8;
    	}
     	if(targetX<0) {
     		targetX = 10;
     	}
     	if(targetX>792) {
     		targetX =targetX-16;
     	}
     	if(targetY>592) {
     		targetY =targetY-16;
     	}
     	if(targetY<8) {
     		targetY =targetY+16;
     	}
     	System.out.println(car.carX + " " + car.carY + " " + car.topCarX + " " + car.topCarY + " " + X+ " " + Y);
if(X>car.carX && X<car.carX+75) {
	if(Y<carY+75 && Y>carY) {
		JOptionPane.showInputDialog("your frog got sidelined by a car");
	}
}
background(10, 83, 175);
fill(16, 150, 82);
ellipse(X, Y, 45, 45);
fill(107, 0, 0);
car.move();
rect(car.carX , carY,  carSize, 50);
car.topMove();
fill(16, 97, 156);
rect(car.topCarX, 250, carSize, 50);
car.upMove();
fill(178, 78, 0);
rect(car.carX, 150, carSize, 50);
car.topMove();
fill(67, 179, 98);
rect(car.topCarX, 65, carSize, 50);
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
