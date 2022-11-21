package com.application.fullstackdemo;


abstract class Shape
{
	abstract void printArea(int x,int y);
	
}
class Rectangle extends Shape
{
	void printArea(int x,int y)
	{
	System.out.println("Area of rectangle is "+(x*y));
    }
}
class Triangle extends Shape
{
	void printArea(int x,int y)
	{
		System.out.println("Area of triangle is "+((0.5*x*y)));
	}
}
class Circle extends Shape
{
	double PI=3.14;
	void printArea(int x,int y)
	{
		System.out.println("Area of circle is "+(PI*x*x));
	}
}
public class Abstractprogram
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		r.printArea(10,15);
		Triangle t=new Triangle();
		t.printArea(10,5);
		Circle c=new Circle();
		c.printArea(10,10);
	}
}

