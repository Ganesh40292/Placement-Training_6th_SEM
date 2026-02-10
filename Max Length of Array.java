package com;
import java.util.Scanner;
public class LenSubArray 
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int arr[]= {3,1,5,1,2};
		int n=arr.length;
		int k=7;
		int st=0,sum=0,len=0,maxL=0;
		for(int end=0;end<n;end++)
		{
			sum=sum+arr[end];
			while(sum>k)
			{
				sum=sum-arr[st];
				st++;
			}
			len=end-st+1;
			maxL=Math.max(maxL, len);
		
		}
		System.out.println(maxL);
	}
}
