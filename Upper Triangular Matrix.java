package com;

import java.util.Scanner;

public class upt
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of matrix:");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        boolean isUpper = true;

        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(a[i][j] != 0)
                {
                    isUpper = false;
                    break;
                }
            }
        }

        if(isUpper)
        {
            System.out.println("It is an Upper Triangular Matrix");
        }
        else
        {
            System.out.println("It is NOT an Upper Triangular Matrix");
        }
    }
}
