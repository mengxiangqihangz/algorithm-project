package com.liang.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class MostFrequentLetters {
	
	public static void main(String[] args) {
		String str = mostFrequentLetters(" lskjdf nvvvvv.SSSS klsd,.;jfk 123");
		
		System.out.println(str);
	}
	
	public static String mostFrequentLetters(String str){
		
		if(null==str || "".equalsIgnoreCase(str.trim())){
			return "";
		}
		String regex = "(\\s+)|(\\d)|(\\p{P})";
		str = str.replaceAll(regex, "");
		str = str.toLowerCase();
		char[] chars = str.toCharArray();
		
 		char[] temp = new char[chars.length];
		Map<Character, Integer> maps = new HashMap<Character, Integer>();
		
		int value = 0;
		int max = 0;
		for (int i = 0; i < chars.length; i++) {
			char ch = chars[i];
			if (maps.containsKey(ch)) {
				value = maps.get(ch) + 1;
			}else{
				value = 1;
			}
			if(value>max){
				max = value;
			}
			maps.put(ch, value);
		}
		int z = 0;
		for (int i = 0; i <= max; i++) {
			Iterator<Character> it = maps.keySet().iterator();
			TreeSet<Character> treeSet = new TreeSet<Character>();
			int frequency = max - i;
			while(it.hasNext()){
				char key = it.next();
				int num = maps.get(key);
				if(frequency == num){
					treeSet.add(key);
				}
			}
			Iterator<Character> ite = treeSet.iterator();
			while (ite.hasNext()) {
				char cc = ite.next();
				for (int j = 0; j < frequency; j++) {
					temp[z] = cc;
					z++;
				}
			}
		}
		str = Arrays.toString(temp);
		return str;
	}
	
}
