import java.awt.List;




public class Set {
	public static LinkedNode front, rear, current, previous, target, next;
	boolean found;
	public static int count, modCount;

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


	public static LinkedNode delete(int x) {
   
    boolean found = false;
    LinkedNode previous = null;
    LinkedNode current = rear;
  
    while (current != null && !found)
        if (target.equals(current.getElement()))
            found = true;
        else
        {
            previous = current;
            current = current.getNext();
        }
        
 
    if (size() == 1)  // only one element in the list
        front = rear = null;
    else if (current.equals(front))  // target is at the head 
        front = current.getNext();
    else if (current.equals(rear))  // target is at the tail
    {
        rear = previous;
        rear.setNext(null);
    }
    else  // target is in the middle
        previous.setNext(current.getNext());
  
    count--;
	modCount++;
  
    return current.getElement();
}

	public boolean exists(int x) {
		if (the value is found in the list) {
		return true;
		
		} else {
			return false;
		}
	}

public static boolean isEmpty() {
	if (count == 0) {
		return true;
	}else {
		return false;
	}
}
public static int size() {
	return count;
}

}

