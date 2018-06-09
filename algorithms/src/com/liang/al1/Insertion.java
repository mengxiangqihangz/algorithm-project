package com.liang.al1;

public class Insertion extends Example{
	
	public static void sort(Comparable[] a){
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i; j >=1 && less(a[j], a[j-1]); j--) {
				exch(a, j, j-1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] a = {1,3,5,3,2};
//		String[] a = "lkjdkdljsafj".split("|");
		sort(a);
		show(a);
	}
	
	
}
