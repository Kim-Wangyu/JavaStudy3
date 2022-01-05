package com.google.s1.student;

import java.util.Scanner;

public class StudentView {
	Scanner sc = new Scanner(System.in);



	// 출력전용

	// 여러명의 학생의 모든 정보를 출력
	public void viewStudents(Student[] students) {

		for (int i = 0; i < 2; i++) {
			Student student = students[i];
			System.out.println("이름" + student.name);
			System.out.println("번호" + student.num);
			System.out.println("국어" + student.kor);
			System.out.println("국어" + student.eng);
			System.out.println("국어" + student.math);

		}

	}

	// viewStudent - 학생의 모든 정보를 출력하는 메서드
	public void viewStudent(Student student) {
		System.out.println("이름" + student.name);
		System.out.println("번호" + student.num);
		System.out.println("국어" + student.kor);
		System.out.println("국어" + student.eng);
		System.out.println("국어" + student.math);

	}

	public void viewMessage(String message) {
		// String 문자열 출력
		System.out.println("-----------");
		System.out.println(message);
		System.out.println("-----------");

	}

}
