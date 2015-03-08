/**
 * 
 */
package com.demo.set.api;

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
			Scanner scanner = new Scanner(new SpellChecker().getClass().getResourceAsStream("dictionary.txt"));
			Set<String> set = new HashSet<String>();
		
			while(scanner.hasNext()){
				set.add(scanner.next());
				//System.out.println(scanner.next());
			}
			scanner.close();
			
			scanner = new Scanner(new SpellChecker().getClass().getResourceAsStream("readText.txt"));
			while(scanner.hasNextLine()){
				String[] tokens = scanner.nextLine().split("\\W");
				for(String token : tokens){
					if(!token.isEmpty() && !set.contains(token.toLowerCase())){
						System.out.println("The unmatched words are --> :: " + token);
					}
				}
			}
			scanner.close();
		}catch (Exception ex){
			System.out.println("Exception while fetching the file:");
		}
	}
}