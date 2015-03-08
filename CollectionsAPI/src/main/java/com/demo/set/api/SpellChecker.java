/**
 * 
 */
package com.demo.set.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Anshul_Goyal
 *
 */
public class SpellChecker {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\anshul_goyal\\Documents\\GitHub\\CollectionsAPIDemo\\CollectionsAPI\\src\\main\\resources\\dictionary.properties"));
			Set<String> set = new HashSet<String>();
		
			while(scanner.hasNext()){
				set.add(scanner.next());
			}
			scanner.close();
			
			scanner = new Scanner(new File("C:\\Users\\anshul_goyal\\Documents\\GitHub\\CollectionsAPIDemo\\CollectionsAPI\\src\\main\\resources\\readText.properties"));
			while(scanner.hasNext()){
				String[] tokens = scanner.nextLine().split("\\W");
				for(String token : tokens){
					if(!token.isEmpty() && !set.contains(token.toLowerCase())){
						System.out.println("The unmatched words are --> :: " + token);
					}
				}
			}
			scanner.close();
		}catch (FileNotFoundException ex){
			System.out.println("Exception while fetching the file:");
		}
	}
}