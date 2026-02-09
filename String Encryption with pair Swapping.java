package com;
import java.util.Scanner;

public class stenc
{
    public static String encrypt(String str)
    {
        char arr[] = str.toCharArray();

        for (int i = 0; i < arr.length - 1; i = i + 2)
        {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        return new String(arr);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to encrypt:");
        String input = sc.nextLine();

        String output = encrypt(input);

        System.out.println("Encrypted Output: " + output);
    }
}
