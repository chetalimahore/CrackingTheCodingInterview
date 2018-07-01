/*
 * 
 * @author - Chetali Mahore
 */

package com.practice.dynamicProgramming;

import java.util.*;

public class EditDistance {
	int memTable[][];
	int rowsCount = 0, columnCount = 0;
	
	/*Initialise the memoization table*/
	
	public int initTable(String first, String second) {
		rowsCount = second.length() + 1;
		columnCount = first.length() + 1;
		memTable = new int[rowsCount][columnCount];
		
		memTable[0][0] = 0;
		
		for(int i = 1 ; i < columnCount ; i++) {
			memTable[0][i] = memTable[0][i-1] + 1;
		}
		
		for(int j = 1 ; j < rowsCount ; j++) {
			memTable[j][0] = memTable[j-1][0] + 1;
		}
	
		return editDistance(first, second);
		
	}
	
	/*Dynamic programming approach to find the minimum distance between two strings*/
	
	public int editDistance(String first, String second) {
		for(int i = 1 ; i < rowsCount ; i++) {
			for(int j = 1 ; j < columnCount ; j++) {
				if(second.charAt(i-1) == first.charAt(j-1)) {
					memTable[i][j] = memTable[i-1][j-1];
				}
				else {
					memTable[i][j] = findMin(memTable[i-1][j], memTable[i-1][j-1], memTable[i][j-1]) + 1;
				}
			}
		}
		return memTable[rowsCount-1][columnCount-1];
	}
	
	/*To find the minimum of three numbers*/
	
	public int findMin(int first, int second, int third) {
		if(first < second) {
			if(first < third) {
				return first;
			}
			else {
				return third;
			}
		}
		else {
			if(second < third) {
				return second;
			}
			else {
				return third;
			}
		}
	}
	
	public static void main(String args[]) {
		EditDistance edit = new EditDistance();
		System.out.println(edit.initTable("intention", "execution"));
		
	}
}
