import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        int i = 0;
        int j = num.length() - 1;

        while (i <= j)
        {
            char left = num.charAt(i);
            char right = num.charAt(j);

            if (
                (left == '0' && right == '0') ||
                (left == '1' && right == '1') ||
                (left == '8' && right == '8') ||
                (left == '6' && right == '9') ||
                (left == '9' && right == '6')
               )
            {
                i++;
                j--;
            }
            else
            {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
