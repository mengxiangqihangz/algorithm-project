package com.liang.al1;

import java.util.Arrays;

public class Merge {

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;// ��ָ��
        int j = mid + 1;// ��ָ��
        int k = 0;
        // �ѽ�С�������Ƶ���������
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // �����ʣ�������������
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // ���ұ߱�ʣ�������������
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // ���������е�������nums����
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
    }

    public static void mergeSort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            // ���
            mergeSort(a, low, mid);
            // �ұ�
            mergeSort(a, mid + 1, high);
            // ���ҹ鲢
            merge(a, low, mid, high);
            System.out.println(Arrays.toString(a));
        }

    }

    public static void main(String[] args) {
        int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
        mergeSort(a, 0, a.length - 1);
        System.out.println("��������" + Arrays.toString(a));
    }
}