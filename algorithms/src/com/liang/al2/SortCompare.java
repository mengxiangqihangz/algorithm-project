package com.liang.al2;

import java.lang.Thread.State;

/**
 * 性能测试类
 * @author liang
 *
 */
public class SortCompare {
	
	public static double time(String alg,Comparable[] a){
		long startTime = System.currentTimeMillis();
		if (alg.equalsIgnoreCase("Inserting")) {
			Insertion.sort(a);
		}else if(alg.equalsIgnoreCase("Selection")){
			Selection.sort(a);
		}else if(alg.equalsIgnoreCase("Shell")){
			Shell.sort(a);
		}else if(alg.equalsIgnoreCase("Merge")){
			Merge.sort(a);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
	/**
	 * 利用算法 将 T个长度为N的数组 排序 
	 * 比较他们的消耗的时间
	 * @param alg
	 * @param N
	 * @param T
	 * @return
	 */
	public static double timeRandomInput(String alg,int N,int T){
		double total = 0.0;
		Comparable[]  a = new Comparable[N];
		for (int t = 0; t < T; t++) {
			for (int i = 0; i < N; i++) {
				a[i] = Math.random();
//				System.out.println(a[i]);
			}
			total += time(alg,a);
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		String alg1 = "Inserting";
		String alg2 = "Selection";
		String alg3 = "Shell";
		String alg4 = "Merge";
		int N = 1000;
		int T = 1000;
//		double t1 = timeRandomInput(alg1, N, T);
//		System.out.println("Inserting : " + t1 + " ms");
//		
//		double t2 = timeRandomInput(alg2, N, T);
//		System.out.println("Selection : " + t2 + " ms");
		
//		double t3 = timeRandomInput(alg3, N, T);
//		System.out.println("Shell : " 		+ t3 + " ms");
		
		double t4 = timeRandomInput(alg4, N, T);
		System.out.println("Shell : " 		+ t4 + " ms");   
	}
	
}
