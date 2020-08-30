//Programming Assignment 4 Kip Brower 08-29-20 CPSC 50100-002
//Incomplete
//Adapted from LinkedNode.java examples provided in the text/ supplmental examples from class.

public class LinkedNode {
	int x;
	LinkedNode next, element, target;

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
	return element;
}
}
