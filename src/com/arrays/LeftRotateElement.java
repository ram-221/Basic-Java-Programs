package com.arrays;

public class LeftRotateElement {

	public static void main(String[] args) {
		
		int array[] = new int[] {6,7,8,9,10};
		int n = 3;
		
		//Rotate the given array by n times toward left  
		for(int i=0;i<n;i++) {
			
			int j,first;
			
			//Stores the first element of the array  
			first = array[0];
			
			for(j=0;j<array.length-1;j++) {
				array[j] = array[j+1];
			}
			
			//First element of array will be added to the end  
			array[j] = first;
			
		}
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}

