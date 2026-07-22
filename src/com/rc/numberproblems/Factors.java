package com.rc.numberproblems;

import java.util.Scanner;

//sum of factors of given number
public class Factors {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
    int sum = 0;
	
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			  System.out.println(i);
			sum=sum+i;
		}
	}
	  System.out.println("Sum of factors = " + sum);
	}
}
