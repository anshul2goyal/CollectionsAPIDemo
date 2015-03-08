/**
 * 
 */
package com.demo.map.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Anshul_Goyal
 * 
 * Anagram is a word formed by reordering the letters of another word or phrase
 * 
 * e.g. barde, bread, derab, beard, debar, bared
 *
 */
public class AnagramsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Read the file
		Scanner scanner = new Scanner(new AnagramsDemo().getClass().getResourceAsStream("anagrams.txt"));
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		while(scanner.hasNextLine()){
			String word = scanner.nextLine();
			String key = sortString(word);
			
			List<String> anagrams = map.get(key);
			
			if(null == anagrams){
				anagrams = new ArrayList<String>();
			}
			
			anagrams.add(word);
			map.put(key, anagrams);
		}
		
		scanner.close();
		System.out.println(map.get(sortString("adred")));
	}
	
	private static String sortString(String str){
		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

}
