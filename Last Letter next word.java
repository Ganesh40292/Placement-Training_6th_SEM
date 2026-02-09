package com;

import java.util.Scanner;

public class Antakshari 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String cur = "", prev = "", s = "####";

        do
        {
            cur = in.nextLine();

            if (prev.isEmpty() || 
                cur.charAt(0) == prev.charAt(prev.length() - 1))
            {
                System.out.println(cur);
            }
            else
            {
                System.out.println("Invalid word!");
                break;
            }

            prev = cur;

        } while (!cur.equals(s));

        in.close();
    }
}
