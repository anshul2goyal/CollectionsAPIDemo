/**
 * 
 */
package com.demo.set.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author Anshul_Goyal
 *
 */
public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] colors = {"white", "pink", "red", "green", "red", "orange","Aa","BB"};
		
		List<String> list = new ArrayList<String>();
		
		list.add("white");
		list.add("pink");
		list.add("red");
		list.add("green");
		list.add("red");
		list.add("orange");
		list.add("Aa");
		list.add("BB");
		
		Set<String> set = new HashSet<String>();
		
		int hash = 0;
		for(String str : colors){
			if(str != null){
				hash += str.hashCode(); 
			}
			System.out.format("Hash code for element %s is :: %2d \n",str, str.hashCode());
			set.add(str);
		}
		
		// HashCode Implementation
		System.out.format("Total of hash code is %s:",hash+"\n\n");
		System.out.println("The total hash is :: "+set.hashCode());
		
		
		 int h = 0;
	        Iterator<String> i = list.iterator();
	        while (i.hasNext()) {
	            String obj = i.next();
	            if (obj != null)
	                h += obj.hashCode();
	        }
	        System.out.println("List hashcode ::"+h);
	}

}