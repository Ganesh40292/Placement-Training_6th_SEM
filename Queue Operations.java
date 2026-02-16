import java.util.Scanner;
public class Main
{
    int[] arr;
    int front;
    int rear;
    int size;
    Main(int size)
    {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    boolean isEmpty()
    {
        return front == -1 || front > rear;
    }
    void enqueue(int value)
    {
        if (rear == size - 1)
        {
            return;
        }
        if (front == -1)
        {
            front = 0;
        }
        rear++;
        arr[rear] = value;
    }
    int dequeue()
    {
        if (isEmpty())
        {
            return -1;
        }
        int value = arr[front];
        front++;
        return value;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Main q = new Main(10);
        String input = sc.nextLine();
        String[] operations = input.split(", ");
        for (String op : operations)
        {
            if (op.startsWith("enqueue"))
            {
                int start = op.indexOf("(") + 1;
                int end = op.indexOf(")");
                int value = Integer.parseInt(op.substring(start, end));
                q.enqueue(value);
            }
            else if (op.startsWith("dequeue"))
            {
                System.out.println(q.dequeue());
            }
        }
    }
}
