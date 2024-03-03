package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int X;
    int Y;
    @Override
    public void settings() {
        size(800, 600);
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

    }

    @Override
    public void draw() {
background(10, 83, 175);
fill(16, 150, 82);
ellipse(375, 500, 45, 45);
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
