package com.liang.al1;

public class Example {
	
	public static boolean less(Comparable v,Comparable w){
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a,int i,int j){
		Comparable c = a[i];
		a[i] = a[j];
		a[j] = c;
	}
	
	public static void show(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
	
	public static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			if(a[i-1].compareTo(a[i])>0){
				return false;
			}
		}
		return true;
	}
	
}
