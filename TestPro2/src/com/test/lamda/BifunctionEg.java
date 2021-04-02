package com.test.lamda;

import java.util.function.BiFunction;

public class BifunctionEg {
public static void main(String args[])
{
	BiFunction<Float,Float,Float> a=Adder :: add;
	Float f=a.apply(30f, (float)18.4);
	System.out.println(f);
	
	BiFunction<String,String,String> a1=Adder :: add;
	String f1=a1.apply("Hello","Everyone");
	System.out.println(f1);
	
	BiFunction<Integer,Float,Float> a2=Adder :: add;
	Float f2=a2.apply(15, (float)18.4);
	System.out.println(f2);
	
	BiFunction<Integer,Integer,Integer> a3=Adder :: add;
	Integer f3=a3.apply(15,50);
	System.out.println(f3);	
}
}
interface Adder
{
	public static float add(float a, float b)
	{
		return a+b;
	}
	
	public static String add(String a, String b)
	{
		return a+b;
	}
	
	public static float add(int a, float b)
	{
		return a+b;
	}
	

	public static int add(int a, int b)
	{
		return a+b;
	}	
}
