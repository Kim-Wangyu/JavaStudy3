package com.google.s1.student;

import java.util.Scanner;

public class StudentUtil {

	public Student makeStudent() {
		// 키보드로부터 이름, 번호, 국어,영어,수학을 입력받아
		// 입력받은것들을 리턴
		Scanner sc = new Scanner(System.in);

		System.out.println("이름입력");
		String name = sc.next();
		System.out.println("번호입력");
		int number = sc.nextInt();
		System.out.println("국어입력");
		int kor = sc.nextInt();
		System.out.println("영어입력");
		int eng = sc.nextInt();
		System.out.println("수학입력");
		int math = sc.nextInt();
		// 1.배열 - 같은 데이터타입만 가능
		// 2. class
		Student student = new Student();
		student.name = name;
		student.num = number;
		student.kor = kor;
		student.eng = eng;
		student.math = math;

		return student;

	}
}
