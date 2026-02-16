import java.util.Scanner;
import java.util.HashMap;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet())
        {
            System.out.println(c + " -> " + map.get(c));
        }
    }
}

