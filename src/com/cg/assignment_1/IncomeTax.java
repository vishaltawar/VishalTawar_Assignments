package com.cg.assignment_1;

public class IncomeTax {
	
	public double calculatIncometax(int income)
	{
		double tax=0;
		
		if(income>0 && income<180000)
		{
			tax=0;
		}
		else if (income>181001 && income<300000) {
			tax=income*10/100;
		}
		else if (income>300001 && income<500000) {
			tax=income*20/100;
		}
		else if (income>500001 && income<1000000) {
			tax=income*30/100;
		}
		
		return tax;
	}

}
