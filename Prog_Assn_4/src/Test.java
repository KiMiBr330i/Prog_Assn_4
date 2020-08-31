
//Programming Assignment 4 Kip Brower 08-29-20 CPSC 50100-002
//Test.java.  Uses Set.java and LinkedNode.java.
//----------------------------------------------------------
import java.awt.List;
import java.util.Scanner;

public class Test {
	static int comm = 0, number;
	static int[][] act;
	static String[] command;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Kip Brower");
		System.out.println("PROGRAMMING ASSIGNMENT 4 - SET");
		System.out.println(" ");
		Set newSet = new Set();
		
		
	//infinite loop for user input of commands	
		while (command != null);{
		System.out.print("Enter a command: ");
		String input = scan.nextLine();
		String[] command = input.split(" ");
		int addNum = Integer.parseInt(command[1]);
		String addComm = command[0];
	
		if (addComm == "add")
			newSet.add(addNum);
		else if 
		(addComm == "delete")
			newSet.delete(addNum);
		else if
			(addComm == "exists")
			newSet.exists(addNum);
	}

}
}
