package com.google.s1.student;

import java.util.Scanner;

public class StudentView {
	Scanner sc = new Scanner(System.in);



	// 출력전용

	// 여러명의 학생의 모든 정보를 출력
	public void view(Student[] students) {

		for (int i = 0; i < 2; i++) {
			Student student = students[i];
			this.view(student);
			
			//this.viewStudent(students[i];
			
//			System.out.println("이름" + student.name);
//			System.out.println("번호" + student.num);
//			System.out.println("국어" + student.kor);
//			System.out.println("국어" + student.eng);
//			System.out.println("국어" + student.math);
//			총 3가지 방법
		}

	}

	// viewStudent - 학생의 모든 정보를 출력하는 메서드
	public void view(Student student) {
		System.out.println("이름" + student.name);
		System.out.println("번호" + student.num);
		System.out.println("국어" + student.kor);
		System.out.println("영어" + student.eng);
		System.out.println("수학" + student.math);
		System.out.println("총점" + student.total);
		System.out.println("평균" + student.avg);

	}

	public void view(String message) {
		// String 문자열 출력
		System.out.println("-----------");
		System.out.println(message);
		System.out.println("-----------");

	}

}
