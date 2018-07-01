/*
 * 
 * @author - Chetali Mahore
 */

package com.practice.arrays;

import java.util.*;

public class IsUnique {
	
	/*O(n^2) approach to find whether the string is unique or not without any new data structure*/
	
	public static boolean isUnique(String input) {
		for(int i = 0 ; i < input.length() ; i++) {
			for(int j = 0 ; j < input.length() ; j++) {
				if(input.charAt(i) == input.charAt(j) && (i != j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	/*O(n logn ) approach to find whether is string is unique or not by sorting the array*/
	
	public static boolean isUniqueSort(String input) {
		char str[] = input.toCharArray();
		Arrays.sort(str);

		for(int i = 0 ; i < str.length - 1; i++) {
			if( str[i] == str[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUnique("!abc123@."));
		System.out.println(isUniqueSort("abcfd"));
	}

}
