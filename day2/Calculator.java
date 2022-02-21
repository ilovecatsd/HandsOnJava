package day2;

public class Calculator {
	
		public int add(int a, int b) {
			return a + b;
		}

		public float add(int a, int b, int c) {
			return a + b + c;
		}

		public int subtract(int a, int b) {
			return a - b;
		}

		public double subtract(double a, double b) {
			return a - b;
		}

		public static void main(String[] args) {
			
			Calculator c1 = new Calculator();
			System.out.println(c1.add(8, 8, 5));
			System.out.println(c1.add(7, 5));
			System.out.println(c1.subtract(2.1, 9.0));
			System.out.println(c1.subtract(1, 7));

		}

	}
