/*
 * @author - Chetali Mahore
 */


package com.practice.arrays;

import java.util.*;

public class PalindromePermutation {
	
	/*To check whether a permutation is a palindrome or not. O(n) time complexity and O(n) space complexity*/
	
	public static boolean palinPermutation(String input) {
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		int count = 0 ;
		
		for(int i = 0 ; i < input.length() ; i++) {
			int value;
			char key = input.charAt(i);
			if(hmap.containsKey(key)) {
				value = hmap.get(key);
				value++;
				hmap.put(key, value);
			}
			else {
				hmap.put(key, 1);
			}
		}
		
		if(input.length() % 2 == 0) {
			for(Map.Entry<Character, Integer> entry: hmap.entrySet()) {
				if(entry.getValue() % 2 == 0) {
					continue;
				}
				else return false;
			}
		}
		else {
			for(Map.Entry<Character, Integer> entry: hmap.entrySet()) {
				if(entry.getValue() % 2 != 0) {
					count++;
					if(count > 1) {
						return false;
					}
				}
				else {
					continue;
				}
			}
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palinPermutation("tactcoa"));
	}

}
