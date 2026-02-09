package com;
import java.util.*;
public class SW 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int arr[]= {1,2,3,4};
		int n=arr.length;
		for(int st=0;st<n;st++)
		{
			for(int end=st;end<n;end++)
			{
				for(int i=st;i<=end;i++)
				{
					System.out.print(arr[i]+"");
				}
				System.out.println();
			}
		}
		
	}
}
