
//Programming Assignment 4 Kip Brower 08-29-20 CPSC 50100-002
//Incomplete
//----------------------------------------------------------
import java.awt.List;

public class Set {
	public static LinkedNode current, previous, target, next, front, list;
	boolean found;
	public static int count = 0, modCount;
	
	public static void Set() {
		

	}

	public static void add(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (front == null)
			front = newNode;
		else
		{
			current = front;
		while (current.next != null)
			current = current.next;
		current.next = newNode;
		}
		count++;
		System.out.println(count);
	}
	

	public static void delete(int x) {

		boolean found = false;
		LinkedNode previous = null;
		LinkedNode current = rear;

		// for (int i = 0; i<count; i++)

		while (current.next != null && !found)
			if (current.equals(current.getElement()))
				found = true;
			else {
				previous = current;
				current = current.getNext();
			}

		if (size() == 1) // only one element in the list
			front = rear = null;
		else if (current.equals(front)) // target is at the head
			front = current.getNext();
		else if (current.equals(rear)) // target is at the tail
		{
			rear = previous;
			rear.setNext(null);
		} else // target is in the middle
			previous.setNext(current.getNext());

		count--;
		modCount++;

		return current.getElement();
	}

	/*
	 * public boolean exists(int x) { if (the value is found in the list) { return
	 * true;
	 * 
	 * } else { return false; } }
	 */
public String toString() {
	
}
	public static boolean isEmpty() {
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int size() {
		return count;
	}

	public LinkedNode getNext() {
		return next;
	}

	public void setNext(LinkedNode node) {
		next = node;
	}

	public LinkedNode getElement() {
		return element;
	}
}
