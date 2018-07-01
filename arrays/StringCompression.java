/*
 * @author - Chetali Mahore
 * *
 */

package com.practice.arrays;

public class StringCompression {

	/*O(n^2) approach for string compression*/
	
	public static String stringCompression(String input) {
		int i = 0, j = 1, count = 0;
		StringBuilder build = new StringBuilder();
		while(i < input.length()) {
			count = 1;
			while(j < input.length()) {
				if(input.charAt(i) == input.charAt(j)) {
					count++;
					j++;
				}
				else {
					break;
				}
			}
			build.append(input.charAt(i)).append(count);
			if(j == input.length()) {
				break;
			}
			else {
				i = j ;
				j = j+1;
			}
		}
		
		if(build.length() < input.length()) {
			return build.toString();
		}
		else {
			return input;
		}
	}
	
	public static void main(String args[]) {
		System.out.println(stringCompression("aabcccccaaad"));
	}
}
