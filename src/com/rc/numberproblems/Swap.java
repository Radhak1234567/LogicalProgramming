package com.rc.numberproblems;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a number");
	
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("before swaping");
	System.out.println("a = " + a + " b = " + b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swaping");
	System.out.println("a = " + a + " b = " + b);

	
}
}
