/*
 * 
 * @author- Chetali Mahore
 */

package com.practice.arrays;

public class URLify {
	
	/*Using StringBuilder to replace empty spaces with %20*/
	
	public static String urlify(String url, int length) {
		StringBuilder constructString = new StringBuilder();
		
		for(int i = 0 ; i < url.length() ; i++) {
			if(url.charAt(i) == ' ') {
				constructString.append("%20");
			}
			else constructString.append(url.charAt(i));
		}
		
		return constructString.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(urlify("Mr John Smith",13));
	}

}
