package com;

import java.util.Scanner;

public class EorO
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        int s = 0;
        int e = n - 1;
        while (s < e)
        {
            while (s < e && arr[s] % 2 == 0)
            {
                s++;
            }
            while (s < e && arr[e] % 2 != 0)
            {
                e--;
            }
            if (s < e)
            {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
