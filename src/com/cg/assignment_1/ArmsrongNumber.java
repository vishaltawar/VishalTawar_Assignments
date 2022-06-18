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
			result=no1 +" is Armstrong Number";
		}
		else
		{ 
			result=no1+" is Not Armstrong Number";
		}
		return result;
	}
	
		public void armstrongNoRange()
		{
			
		System.out.println("------------  Armstrong Number Between 100 to 999  -------------------------");

			int i,r,t,arm=0,fn,sn,tn;
			for(i=100;i<=999;i++)
			{
				t=i;
				
				fn=t%10;
				sn=(t/10)%10;
				tn=(t/100)%10;
				arm=(fn*fn*fn)+(sn*sn*sn)+(tn*tn*tn);
				
				if(arm==i)
				{
					System.out.println(i);
					
				}
			}
		}	
}
