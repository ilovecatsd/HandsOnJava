package day2;

interface Item {
	String name = "";
	int price = 0;
	int discount =0;
	String category = "";
}

class Ink_Pen implements Item {
	String name;
	String category;
	int price;
	int discount;
	String Review;
	
	public Ink_Pen(String name, String category, int price, int discount , String Review) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.Review = Review;
	}
	void display() {
		System.out.println(" name : " + this.name + " category : " + this.category + " Price : " + this.price + " discount : " + this.discount + " Review : " + this.Review);
	}
}

class Grocery implements Item {
	String name;
	String category;
	int price;
	int discount;
	String Review;

	public Grocery() {
		super();
	}

	public Grocery(String name, String category, int price, int discount , String Review) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.discount = discount;
		this.Review = Review;
	}
	
	void display() {
		System.out.println("name :" + this.name + " category :" + this.category + " Price : "  + this.price + " discount : " + this.discount +  " Review : " + this.Review);
	}
}

public class Flipkart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ink_Pen p = new Ink_Pen("Parker", "Ink_Pen" , 25 , 25 ," Good " );
	    Ink_Pen p1 = new Ink_Pen(" Cello ", " Ink_Pen " , 20 , 2 ," Amazing  " );
	    Grocery g1 = new Grocery(" Tea ", " Grocery ", 85 , 4 ," Very good ");
	    Grocery g2 = new Grocery(" cereals ", " Grocery ", 100 , 5 , " Amazing ");
	    p.display();
	    p1.display();
	    g1.display();
	    g2.display();
	}
}