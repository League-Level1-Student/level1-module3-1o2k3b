package _06_frogger;
import processing.core.PApplet;
public class Car extends PApplet{
int carX;
int carY;
int carSize;
int carSpeed;
	public Car(int carX, int carY, int carSize, int carSpeed) {
		this.carX = carX;
		this.carY = carY;
		this.carSize = carSize;
		this.carSpeed = carSpeed;
	}

	void display() {
	    fill(0, 255, 0);
	    rect(carY , carX,  carSize, 40);
	  }
public void move() {
	carX-=carSpeed;
	if(carX == 0) {
		carX= 600;
	}
	carX+=carSpeed;
	if(carX == 600) {
		carX= 0;
	}
}
	}

