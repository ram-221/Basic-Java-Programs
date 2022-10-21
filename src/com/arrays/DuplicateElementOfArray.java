package com.arrays;

public class DuplicateElementOfArray {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,4,3,4,6,7,5,8,9,8};
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i] == array[j])
					System.out.println(array[j]);
			}
		}
	}
}
