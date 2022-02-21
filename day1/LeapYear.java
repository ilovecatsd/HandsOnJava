package day1;

import java.util.Scanner;

public class LeapYear {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			         Scanner sc = new Scanner(System.in);
			         int year;
			         System.out.println("Enter the year: ");
			         year= sc.nextInt();
			         if((year % 4 == 0) && (year % 100 != 0)|| (year % 400 == 0))
			        	 System.out.println("It is a leap Year");
			         else
			        	 System.out.println("It is not a leap Year");
				}


	}
