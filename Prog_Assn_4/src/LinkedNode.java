

public class LinkedNode {
	int x;
	LinkedNode next, element;

	public LinkedNode() {
		next = null;
	}

	public LinkedNode(int x) {
		this.x = x;
	}

	public LinkedNode getNext() {
	return next;
	}
 public void setNext(LinkedNode node)
	    {
	        next = node;
	    }

public LinkedNode getElement() {
	// TODO Auto-generated method stub
	return element;
}
}
