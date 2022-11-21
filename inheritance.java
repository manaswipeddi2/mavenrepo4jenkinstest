package com.application.fullstackdemo;
class calculator
{
	public int add(int x,int y)
	{
		return x+y;
	}
}
class calc1 extends calculator
{
	public int sub(int x,int y)
	{
		return x-y;
	}
	
}
class calc2 extends calc1
{
	public int mul(int x,int y)
	{
		return x*y;
	}
}
public class inheritance
{

	public static void main(String args[])
	{
	
	calc2 c1=new calc2();
	int result1 = c1.add(3,4);
	int result2 = c1.sub(6,2);
	int result3 = c1.mul(7,8);
	
	System.out.println(result1);
	System.out.println(result2);
	System.out.println(result3);
	}
}
	
	
   
	


