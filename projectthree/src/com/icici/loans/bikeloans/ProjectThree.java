package com.icici.loans.bikeloans;

public class ProjectThree implements projectfour{
	int a=15,b=10,c=0;
	public void subtraction() {
	c=a-b;
	System.out.println("subtraction of a&b are:"+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ProjectThree obj=new ProjectThree();
	obj.subtraction();
	obj.multiplication();
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("multiplication override in projectfour");
	}

}
