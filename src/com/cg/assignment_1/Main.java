package com.cg.assignment_1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{ 
		
		Scanner sc=new Scanner(System.in);
//		ArmsrongNumber a =new ArmsrongNumber();
//		Interest i =new Interest();
//		Result r =new Result();
		IncomeTax incomeTax=new IncomeTax();
//		
//		System.out.print("Enter the Number and check it's Armstrong or Not :- ");
//		int no1= sc.nextInt();
//		
//		System.out.println(a.armstrongNo(no1));
//		System.out.println();
//		a.armstrongNoRange();
//		
//		System.out.println();
//		
//		
//		
//		System.out.println("Enter the Principal Amount :- ");
//		double prinAmount=sc.nextDouble();
//		
//		System.out.println("Enter the Rate :- ");
//		double rate=sc.nextDouble();
//		
//		System.out.println("Enter the  time :- ");
//		double time=sc.nextDouble();
//		
//		System.out.println(	"Simple Interest is "+i.simpleInterest(prinAmount,rate,time));
//		System.out.println(	"Compound Interest is "+i.compoundInterest(prinAmount,rate,time));
//		
//		
//		System.out.println(r.threeSubMarks(67,56,87));
		System.out.println("Enter the Your Income :- ");
		int income=sc.nextInt();
		System.out.println(incomeTax.calculatIncometax(income));
	}

}
