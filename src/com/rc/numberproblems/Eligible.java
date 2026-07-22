package com.rc.numberproblems;
import java.util.Scanner;
// to check eligibility
public class Eligible {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int a=sc.nextInt();
	
	if(a>=18) {
		System.out.println("eligible");}
		else
			System.out.println(" not eligible");
	
	}
	
}

