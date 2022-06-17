package com.cg.assignment_1;
import java.util.Scanner;

public class ArmsrongNumber {
	String result;

	public  String armstrongNo(int no1) {
		int r,temp,arm=0;
				
		temp=no1;
		while(temp!=0)
		{
		r=temp%10;
		arm=arm+(r*r*r);
		temp=temp/10;
		}	
		if(arm==no1)
		{
			result="Number is Armstrong";
		}
		else
		{ 
			result="Number is Not Armstrong";
		}
		return result;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number :-");
		int no1= sc.nextInt();
		ArmsrongNumber a =new ArmsrongNumber();
		
		System.out.println(a.armstrongNo(no1));
		
	}
	
}
