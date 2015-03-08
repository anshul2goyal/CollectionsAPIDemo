/**
 * 
 */
package com.demo.linkedlist.api;

import java.util.Scanner;

/**
 * @author Anshul_Goyal
 *
 */

// Create the node
class MyListNode{
	
	int info; // info or data of the node
	MyListNode listNode; //pointer to the next node
	
	//Initialize the node reference to null
	
	public MyListNode() {
		this.listNode = null;
	}
	
}

public class LinkedListDemo {
	
	public static void main (String ... args){
		
		Scanner scanner = new Scanner(System.in);
		
		// Create the nodes....
		MyListNode myListNode = new MyListNode();
		//MyListNode myListNode2 = new MyListNode();
		//MyListNode myListNode3 = new  MyListNode();
		
		/**
		 * Another way to create the nodes is defined below:
		 */
		myListNode.listNode = new MyListNode(); // This is the second node equivalent to myListnode2
		myListNode.listNode.listNode = new MyListNode(); // This is the third node equivalent to myListnode3
		// Store the data in the nodes
		
		System.out.println("\t Please enter the info data for Node A :");
		myListNode.info =  scanner.nextInt();
		
		System.out.println("\t Please enter the info data for Node B :");
		//myListNode2.info =  scanner.nextInt();
		myListNode.listNode.info = scanner.nextInt();
		
		System.out.println("\t Please enter the info data for Node C :");
		//myListNode3.info =  scanner.nextInt();
		myListNode.listNode.listNode.info = scanner.nextInt();
		
		// Linking of the nodes
		/**
		 * This is commented to demonstrate the reference of all nodes via one object
		 */
		//myListNode.listNode = myListNode2; // Attach the reference of Node 2 to node 1
		//myListNode2.listNode = myListNode3; // Attach the reference of Node 3 to Node 2
		
		//Test by printing the content of the list
		System.out.println("Print the content of First Node : "+ myListNode.info);
		
		// Print the content of all the nodes and advance
		while(myListNode != null){
			System.out.println(myListNode.info);
			// Advance the pointer to the next node
			myListNode = myListNode.listNode;
		}
		System.out.println("null"); // This is just an indication to show that the end of list has been reached
		
		//Close the scanner
		scanner.close();
	}
}
