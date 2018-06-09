package com.liang.al2;

import java.util.Arrays;

public class Merge extends AlgHelp{
	
	/**
	 * ��merge���� ��д�����������
	 * @param a
	 * @param low
	 * @param mid
	 * @param high
	 */
//	public static void merge(Comparable[] a, int low, int mid, int high) {
//		Comparable[] temp = new Comparable[high - low + 1];
//		int i = low;// ��ָ��
//		int j = mid + 1;// ��ָ��
//		int k = 0;
//		// �ѽ�С�������Ƶ���������
//		while (i <= mid && j <= high) {
//			if (a[i].compareTo(a[j]) < 0) {
//				temp[k++] = a[i++];
//			} else {
//				temp[k++] = a[j++];
//			}
//		}
//		// �����ʣ�������������
//		while (i <= mid) {
//			temp[k++] = a[i++];
//		}
//		// ���ұ߱�ʣ�������������
//		while (j <= high) {
//			temp[k++] = a[j++];
//		}
//		// ���������е�������nums����
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
			// ���
			sort(a, low, mid);
			// �ұ�
			sort(a, mid + 1, high);
			// ���ҹ鲢
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
		System.out.println("��������" + Arrays.toString(a));
	}
}
