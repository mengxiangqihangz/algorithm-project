package com.liang.al2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Insertion extends AlgHelp{
	
	/**
	 * ��������
	 * iÿ ��һ ���Լ��һ�� ��ǰ����� ���������ΰ��� С��������
	 * @param a
	 */
	public static void sort(Comparable[] a){
		int N = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j >0 && less(a[j],a[j-1]); j--) {
				exch(a, j, j-1);
			}
		}
	}
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
//		String[] a = str.split("|");
//		sort(a);
//		isSorted(a);
//		show(a);
		
//		long l = System.currentTimeMillis();
//		for (int i = 0; i < 10000; i++) {
//			for (int j = 0; j < 10000; j++) {
//				
//			}
//		}
//		System.out.println(System.currentTimeMillis()-l);
	}
}
