package com.arrays;

public class ReverseOrderOfArrayy {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5,6,7,8,9};
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}
}
