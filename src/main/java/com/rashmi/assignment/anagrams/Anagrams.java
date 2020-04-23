package com.rashmi.assignment.anagrams;

import java.util.Arrays;

/**
 * @author RashmiKumari
 *
 */
public class Anagrams {
	
	public static void main(String[] args) {
		String a= "care1";
		String b= "race1";
		if ( a.length() == b.length()) {
			a = a.replaceAll("\\s", "").toLowerCase();
			b = b.replaceAll("\\s", "").toLowerCase();
			// convert string to char array
			char[] firstArray = a.toCharArray();
			char[] secondArray = b.toCharArray();
			// sort both the arrays
			Arrays.sort(firstArray);
			Arrays.sort(secondArray);
			if (Arrays.equals(firstArray, secondArray)) {
				System.out.println("anagram");
			}
		}
	}
}
