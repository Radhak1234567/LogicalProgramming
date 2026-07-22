package com.rc.numberproblems;
//within n
import java.util.Scanner;
public class Factorial1 {
			
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int n=sc.nextInt();
			System.out.println("enter a number");
			int end=sc.nextInt();
	        for (int i = n; i <= end; i++) {
	            System.out.println(i + "! = " + getFactorial(i));
	        }
		
			//or int factorial=getFactorial(n);
			//System.out.println(getFactorial);
		
			
		}
		public static int getFactorial(int n) {
			int fact=1;
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			
			}
			return fact;
		
		}

	
}
