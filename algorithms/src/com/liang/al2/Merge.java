package com.liang.al2;

import java.util.Arrays;

public class Merge extends AlgHelp{
	
	/**
	 * 次merge方法 的写法是有问题的
	 * @param a
	 * @param low
	 * @param mid
	 * @param high
	 */
//	public static void merge(Comparable[] a, int low, int mid, int high) {
//		Comparable[] temp = new Comparable[high - low + 1];
//		int i = low;// 左指针
//		int j = mid + 1;// 右指针
//		int k = 0;
//		// 把较小的数先移到新数组中
//		while (i <= mid && j <= high) {
//			if (a[i].compareTo(a[j]) < 0) {
//				temp[k++] = a[i++];
//			} else {
//				temp[k++] = a[j++];
//			}
//		}
//		// 把左边剩余的数移入数组
//		while (i <= mid) {
//			temp[k++] = a[i++];
//		}
//		// 把右边边剩余的数移入数组
//		while (j <= high) {
//			temp[k++] = a[j++];
//		}
//		// 把新数组中的数覆盖nums数组
//		for (int k2 = 0; k2 < temp.length; k2++) {
//			a[k2 + low] = temp[k2];
//		}
//	}

	public static void merge(Comparable[] a, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		Comparable[] temp = new Comparable[high + 1];
		for (int k = 0; k <= high; k++) {
			temp[k] = a[k];
		}
		
		for(int k = low;k <= high;k++){
			if(i>mid){
				a[k] = temp[j++];
			}else if(j>high){
				a[k] = temp[i++];
			}else if(less(a[i], a[j])){
				a[k] = temp[i++];
			}else{
				a[k] = temp[j++];
			}
			
		}
		
	}
	
	public static void sort(Comparable[] a, int low, int high) {
		int mid = (low + high) / 2;
		if (low < high) {
			// 左边
			sort(a, low, mid);
			// 右边
			sort(a, mid + 1, high);
			// 左右归并
			merge(a, low, mid, high);
			System.out.println(Arrays.toString(a));
		}
	}

	public static void sort(Comparable[] a) {
		sort(a, 0, a.length - 1);
	}

	public static void main(String[] args) {
		Integer a[] = { 5, 4, 2, 1, 6, 9, 8, 3, 7, 0 };
		sort(a);
		System.out.println("排序结果：" + Arrays.toString(a));
	}
}
