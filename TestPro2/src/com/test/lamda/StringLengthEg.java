package com.test.lamda;

import java.util.Scanner;
public class StringLengthEg {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	A a=(s)->
	{
		int len=s.length();
		System.out.println("Length of the String is: "+len);
	};
	a.length(s1);
}
}

interface A
{
	void length(String s);
}