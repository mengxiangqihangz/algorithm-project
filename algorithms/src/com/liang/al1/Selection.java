package com.liang.al1;

public class Selection extends Example{
	
	public static void sort(Comparable[] a){
		int N = a.length;
		
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if(less(a[min],a[j])){
					min  = j;
				}
			}
			exch(a,i,min);
		}
	}
	
	public static void sort2(Comparable[] a){//优化一下，效率高一些
		int N = a.length;
		
		for (int i = 0; i < a.length; i++) {
			Comparable c = a[i];
			int max = i;
			int j = 0;
			for (j = i + 1; j < a.length; j++) {
				if(less(c,a[j])){
					c = a[j];
					max = j;
				}
			}
			exch(a, i, max);
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {1,3,5,3,2};
//		String[] a = "lkjdkdljsafj".split("|");
		sort(a);
		show(a);
	}
	
}
