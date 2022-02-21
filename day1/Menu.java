package day1;
import java.util.Scanner;

public class Menu {
	    @SuppressWarnings({ "resource", "unused" })
		public static void main(String[] args) {
	        
	        int choice;
	        String menu;
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your choice: ");
	        System.out.println("Enter 1 for South Indian ");
	        System.out.println("Enter 2 for North Indian ");
	        System.out.println("Enter 3 for Rajasthani ");
	        System.out.println("Enter 4 for Gujarati ");
	        System.out.println("Enter 5 for Bengali ");
	        System.out.println("Enter 6 for Desserts\n ");
	        
	        
	        choice = sc.nextInt();
	        switch(choice) {
	            case 1:
	            System.out.println("Welcome to hotel Canvas!\n");
	            System.out.println("Please enter your choice:\n Idli (Rs. 45) - 1\n Dosa(Rs. 70) - 2\n Pongal(Rs. 50) - 3\n Poori Masala(Rs. 65) - 4\n Rava Dosa(Rs. 80) - 5 ");
	            break;
	            
	            case 2:
	            System.out.println("Welcome to hotel Canvas!\n");
	            System.out.println("Please enter your choice:\n Aloo Paratha (Rs. 45) - 1\n Rajma Chawal (Rs. 70) - 2\n Paneer Paratha (Rs. 50) - 3\n Roti Sabzi (Rs. 65) - 4\n Poha(Rs. 35) - 5");
	            break;
	            
	            case 3:
	                 System.out.println("Welcome to hotel Canvas!\n");
	                 System.out.println("Please enter your choice:\n Dal Bati Churma (Rs. 70) - 1\n Bajra Roti and Sabzi (Rs. 50) - 2\n Pyaaz Ki Kachori (Rs. 50) - 3");
	                 break;
	                 
	            case 4:
	                System.out.println("Welcome to hotel Canvas!\n");
	                System.out.println("Please enter your choice:\n Dhokla (Rs. 45) - 1\n Onion Thepla (Rs. 50) - 2\n Dabeli (Rs. 30) - 3\n Batata Poha (Rs. 45) - 4\n Gujarati Pudla(Rs. 70) - 5");
	                break;
	        
	           case 5:
	               System.out.println("Welcome to hotel Canvas!\n");
	               System.out.println("Please enter your choice:\n Mughlai Paratha (Rs. 70) - 1\n Luchi and Cholar Dal (Rs. 50) - 2\n Radha Ballabhi (Rs. 70) - 3\n Kochuri with Sabzi (Rs. 60) - 4\n ");
	               break;
	               
	         case 6:
	           System.out.println("Welcome to hotel Canvas!\n");
	           System.out.println("Please enter your choice:\n Chocolte Icecream (Rs. 70) - 1\n Brownie with Icecream (Rs. 90) - 2\n Cold Coffee sundae (Rs. 90) - 3\n Chocolate eclair (Rs. 80) - 4\n ");
	               break;
	}
	}
	}
