package com.google.s2.overloading;

public class Count {

	public void hap (int num1, int num2) {
		int sum= num1+num2;
		System.out.println(sum);
		
	}
	public void hap(int num1,double num2) { // 비슷한일을 하는 같은 이름의 메서드를 경우의 수에 따라서 여러개 만들어놔야함
	double sum =num1	+ num2; 			// 알아서 맞는거에 찾아감
	System.out.println(sum);
	}
	
	
	
}

