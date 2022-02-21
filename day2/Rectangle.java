package day2;

class RectangleA {
	
    int length;
    int breadth;
    void area(int length , int breadth) {
 	   System.err.println("Area of rectangle: " + this.length * + this.breadth);
    }
    void perimeter(int length, int breadth) {
 	   System.err.println(" Perimeter of rectangle: " + (2* (+ this.length + +this.breadth)));
    }
	public RectangleA(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
}
class Square extends RectangleA {
	 int side;
 void area( int side ) {
 	System.out.println(" Area of Square: " + (side*side));
 }
 void perimeter( int side ) {
 	System.out.println(" Area of Square: " + (4*side));
 }
	public Square(int length, int breadth, int side) {
		super(length, breadth);
		this.side = side;
	}
	 
}
public class Rectangle{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RectangleA rectangle = new RectangleA(4,5);
       rectangle.area(4, 5);
       rectangle.perimeter(3, 4);
       Square square = new Square(4,5,1);
       square.area(2);
       square.perimeter(6);
	}

}