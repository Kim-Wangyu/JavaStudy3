package com.google.s1.student;

public class Student {
//Data저장용도

	String name;
	int num;
	int kor;
	int eng;
	int math;

	int total;
	double avg;

	public void makeTotal() {

//		System.out.println("참조변수 this");//우리가만드는거아님,자동으로생기는 변수임
//		System.out.println("참조변수 this : "+this);
		this.total= this.kor+this.eng+this.math;
		avg= total/3.0;
	}

	public void hello() {
		System.out.println("안녕하세요.");
	}
}
