package com.cg.assignment_1;

public class Result {
	public String threeSubMarks(int sub1,int sub2,int sub3)
	{
		String result="";
		if(sub1>60 && sub2>60 && sub3>60)
		{
			result="Passed";
		}
		else if(sub1>60 && sub2>60 || sub1>60 && sub3>60 ||  sub2>60 && sub3>60)
		{
			result="Promoted";
		}
		
		else if (sub1<60 && sub2<60 && sub3<60) {
		
			result="Faild";
		}
		
		return result;
	}

}
