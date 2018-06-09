package com.liang.al2;

/**
 * Ï£¶ûÅÅÐò
 * @author liang
 *
 */
public class Shell extends AlgHelp{
	
	public static void main(String[] args) {
//		String str = "lkjfdklljfljs";
//		Comparable[] num = {1,5,2,9,2,3,5,4,1,8,5,4};
//		sort(num);
		Integer[] str = new Integer[36];
		
		for (int i = 0; i < 36; i++) {
			str[i] = 36 - i ;
		}
		
		sort(str);
	}
	
//	public static void sort(Comparable[] a){
//		int N = a.length;//10
//		int h = 1;
//		while(h < N/3){
//			h = 3*h + 1;//4
//		}
//		while(h>=1){
//			for (int i = h; i < N; i++) {//4
//				for (int j = i; j >= h && less(a[j],a[j-h]); j -= h) {
//					exch(a, j, j-h);
//				}
//			}
////			System.out.println(h);
////			show(a);
//			h = h/3 ;
//		}
////		show(a);
//	}
	
	/**
	 * h=2
	 * @param a
	 */
//	public static void sort(Comparable[] a){
//		int N = a.length;
//		int h = 1;
//		while(h < N/2){
//			h = 2*h + 1;
//		}
//		while(h>=1){
//			for (int i = h; i < N; i++) {//4
//				for (int j = i; j >= h && less(a[j],a[j-h]); j -= h) {
//					exch(a, j, j-h);
//				}
//			}
//			h = h/2 ;
//		}
//	}
	
	/**
	 * h=2
	 * @param a
	 */
	public static void sort(Comparable[] a){
		int N = a.length;
		int h = 1;
		while(h < N/5){
			h = 5*h + 1;
		}
		while(h>=1){
			for (int i = h; i < N; i++) {//4
				for (int j = i; j >= h && less(a[j],a[j-h]); j -= h) {
					exch(a, j, j-h);
				}
			}
			h = h/5 ;
		}
	}
//	public static void main(String[] args) {
////		String str = "lkjfdklljfljs";
//		int[] num = {1,5,2,9,2,3,5,4,1,8,5,4};
//		sort(num);
//		
//	}
//	
//	public static void sort(int[] a){
//		int N = a.length;//10
//		int h = 1;
//		while(h<N/3){
//			h = 3*h + 1;//4
//		}
//		write(a);
//		while(h>=1){
//			for (int i = h; i < N; i++) {//4
//				System.out.println("i : " + i);
//				for (int j = i; j >= h ; j -= h) {
//					System.out.println("j : " + j);
//					if(less(a[j],a[j-h])){
//						exch(a, j, j-h);
//						write(a);
//						
//					}
//				}
//				System.out.println();
//			}
//			h = h/3 ;
//			System.out.println(h);
//		}
//		
//	}
//	
//	public static void exch(int[] a,int i ,int j){
//		int t = a[i];
//		a[i] = a[j];
//		a[j] = t;
//	}
//	
//	public static void write(int[] a){
//		for (int i1 = 0 ; i1 <a.length ; i1++) {
//			System.out.print(a[i1]);
//		}
//		System.out.println();
//	}
}
