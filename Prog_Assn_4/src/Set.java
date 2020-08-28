import java.awt.List;

public class Set {
	public static LinkedNode front, rear, current, previous, target, next;
	public static int count;

	public static void Set() {
		front = rear = null;
		count = 0;
	}

	public static void add(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (front == null) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			count++;
		}
	}

	void delete(int x) {
	//we know that integer is in the List; we need to re-link the previous with the one in front.	
		if (target = int x)
	}

	public boolean exists(int x) {
		if (the value is found in the list) {
		return true;
		
		} else {
			return false;
		}
	}
}
