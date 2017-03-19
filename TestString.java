package com.test.String;

public class TestString {
	public static void main(String args[]) {
		String str = "";
		for (int i = 0; i <= 9; i++) {
			Long time1 = System.nanoTime();
			for (int j = 0; j < 10000; j++) {
				str += 'a';
			}
			Long time2 = System.nanoTime();
			System.out.println("String每循环10000次的时间为：" + (double)((time2 - time1)/1000000000.0));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 9; i++) {
			Long time3 = System.nanoTime();
			for (int j = 0; j < 10000; j++) {
				sb.append('a');
			}
			Long time4 = System.nanoTime();
			System.out.println("StringBuilder每循环10000次的时间为：" +(double) ((time4 - time3)/1000000000.0));
		}
	}
}