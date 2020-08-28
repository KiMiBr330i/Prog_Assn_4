import java.util.Scanner;

public class Test {
Scanner Scan = new Scanner(System.in);
public static LinkedNode front, rear, current, previous, target, next;
public static int count;
	public static void main(String[] args) {
	
	Set.add(5);
	Set.add(6);
	Set.add(7);
		
	}
	
	public static void Set() {
		front = rear = null;
		count = 0;
	
	}
	public static void add(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (front != null) 
			rear.next = newNode;
		else 
			front = newNode;
			rear = newNode;
			count++;
			System.out.println(count);
		}
	

}

