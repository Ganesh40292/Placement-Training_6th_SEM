import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class ReverseLinkedList
{
    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void printList(Node head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] values = input.split(" ");
        Node head = null;
        Node temp = null;
        for (String v : values)
        {
            int num = Integer.parseInt(v);
            Node newNode = new Node(num);
            if (head == null)
            {
                head = newNode;
                temp = head;
            }
            else
            {
                temp.next = newNode;
                temp = newNode;
            }
        }
        head = reverse(head);
        printList(head);
    }
}
