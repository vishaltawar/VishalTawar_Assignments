package com.cg.assignment_1;

public class Interest {
	
	public double simpleInterest(double prinAmount,double rate,double time)
	{
		System.out.println("----------------- Interest --------------");
		
	//Formula:- SI= p*r*t/100;
	
	
	double simpleInterest=(prinAmount*rate*time)/100;

	return Math.round(simpleInterest);
	
	}
	
	public double compoundInterest(double prinAmount,double rate,double time)
	{
		//Formula:- Amount = principle*(1+rate/100)^time
		
		
		double compoundInterest=prinAmount*Math.pow((1+rate/100),time);
		
		return Math.round(compoundInterest);
	}
	
}
