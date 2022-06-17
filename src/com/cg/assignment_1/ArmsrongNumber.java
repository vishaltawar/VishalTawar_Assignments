package com.cg.assignment_1;

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
		ArmsrongNumber a =new ArmsrongNumber();
		System.out.println(a.armstrongNo(153));
		
	}
	
}
