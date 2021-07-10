package com.bridgelabz.fibonacci;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num = 10;
		series(num);
	}
		public static void series(int num) 
		{
			int n1 = 0;
			int n2 = 1;
			int n3 = 0;
			
			System.out.print(n1+" "+n2);
			for (int i =2; i < num; i++) 
			{
				n3=n1+n2;
				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
}