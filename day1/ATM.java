package day1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
			int count = 1;
			int savedacctNum = 45678;
			int savedpass = 234;

	        do{
	        	@SuppressWarnings("resource")
				Scanner sc = new Scanner (System.in);
	            System.out.print("Enter your account number: ");
	            int acctNum = sc.nextInt();
	            System.out.print("Enter your account password: ");
	             int pwd = sc.nextInt();



	            if (( savedacctNum != acctNum) && (savedpass != pwd)){
	                System.out.println(" Account number and/or password is incorrect ");
	                count++;
	            }
	        }while (count <= 4 && count > 1);

	        if (count > 4){
	            System.out.println(" You have exhausted your attempts. ");
	        }

	        else{
	        	System.out.println("Please proceed further ");
	        }

		}
}
