package com.icicibank.loans.personalloan;

public class FirstClass {
	int a= 10;
	int b= 20;
      
	
	public void addition()
	{
       System.out.println( a+b);
     
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Friends");
		FirstClass c=new FirstClass();
		c.addition();
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
