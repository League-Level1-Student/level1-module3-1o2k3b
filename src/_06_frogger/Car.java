package _06_frogger;
import processing.core.PApplet;
public class Car extends PApplet{
int carX;
int topCarX = 800;
int topCarY;
int carY;
int carSize;
int carSpeed = 8;
int topCarSpeed;
	public Car(int carX, int carY, int carSize, int carSpeed) {
		this.carX = carX;
		this.carY = carY;
		this.carSize = carSize;
		this.carSpeed = carSpeed;
	}

	void display() {

	  }
	public void move() {
		carX+=carSpeed;
	
	if(carX >= 1000) {
		carX= 0;
	
	}
}
public void topMove() {
	topCarX-=carSpeed;
if(topCarX<=-50) {
	topCarX=800;
}
}
	public void upMove() {
		if(carX>=1000) {
			carX = 0;
		}
	}




}

