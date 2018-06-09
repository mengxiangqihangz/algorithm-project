package com.liang.al2;

import java.util.Scanner;

public class Selection extends AlgHelp{
	/**
	 * 选择排序
	 * min 收集的是 i之后的最小元素的 index
	 * @param a
	 */
	public static void sort(Comparable[] a){
		int N  = a.length;
		for (int i = 0; i < N; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(less(a[j],a[min])){
					min = j;
				}
			}
			exch(a, i, min);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] a = str.split("|");
		sort(a);
		isSorted(a);
		show(a);
		
	}
	
}
