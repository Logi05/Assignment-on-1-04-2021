package com.test.lamda;

import java.util.Scanner;

public class OddEvenExample {

public static void main(String args[])
{
	System.out.println("Enter an input:");
	Scanner sc=new Scanner(System.in);
	int a1=sc.nextInt();
	Result r=(a)->
	{
	if(a%2==0)
	{
		System.out.println("Even number");
	}
	else
	{
		System.out.println("Odd number");
	}
	};
	r.result(a1);
}
}

interface Result
{
	 void result(int a);
}
