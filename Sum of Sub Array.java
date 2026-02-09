package com;
import java.util.*;
public class sumofsubarray 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
        System.out.print("Enter subarray size k: ");
        int k = in.nextInt();
        if(k > n)
        {
            System.out.println("Invalid: k cannot be greater than n");
            return;
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int st = 0; st <= n - k; st++)
        {
            sum = 0;
            for(int i = st; i < st + k; i++)
            {
                sum += a[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println("Maximum subarray sum = " + maxSum);
    }
}
