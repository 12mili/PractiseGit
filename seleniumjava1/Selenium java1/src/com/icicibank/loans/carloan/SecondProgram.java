package com.icicibank.loans.carloan;

public class SecondProgram  extends MyFirstProgram{
	public static void main(String[] args)
	{
		SecondProgram m = new SecondProgram();
		m.multiple();
		System.out.println(m.a);
		System.out.println(m.b);
		m.addtion();
		
	}

	@Override
	public void addtion() {
		System.out.println("Extends Abstract Class");
		// TODO Auto-generated method stub
		
	}

}

