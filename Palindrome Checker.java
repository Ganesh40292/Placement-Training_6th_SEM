package com;
import java.util.*;
public class palin 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		str=str.toLowerCase();
		int n=str.length();
		int l=0,r=n-1;
		while(l<r)
		{
			if(str.charAt(l)<str.charAt(r))
			{
				System.out.println("not a palindrome");
				return;
			}
			l++;
			r--;
			
		}
		System.out.println("It is a palindrome");
	}
}
