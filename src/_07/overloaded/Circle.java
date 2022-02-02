package _07.overloaded;

public class Circle {

	private int xPos;
	private int yPos;
	private int radius;
	
	 public Circle(int x,int y,int r) {
		 xPos=x;
		 yPos=y;
		 radius=r;
	 }
	 
	 public Circle(int x,int y) {
		 xPos=x;
		 yPos=y;
		 radius=10; //deafult radius
	 }
	 
	 public Circle() {
		 xPos=20; //assume some default values for xPos and yPos
		 yPos=20;
		 radius=10; //deafult radius
	 }
}
