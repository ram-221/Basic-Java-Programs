package com.arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		String names[] = {"Moniotr","CPU","Keyboard","Mouse","Laptop"};
		String CopyNames[] = new String[names.length];
		
		for(int i=0;i<names.length;i++) {
			CopyNames[i] = names[i];
		}
		
		for(int i=CopyNames.length-1;i>-1;i--) {
			System.out.println("Copied Element: "+CopyNames[i]);
		}
		
	}
}
