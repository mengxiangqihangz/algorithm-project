package com.liang.al2;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {// -1ÎªÁË·ÀÖ¹Òç³ö
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];

					arr[j] = arr[j + 1];

					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {8,3,7,8,4,7,2,8,4,7,8,2,8,7};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bubbleSort1(){
		
		
		
	}
	
}
