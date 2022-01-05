package com.google.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent 호출
		// 이름,번호,국어 등이 출력
		// 리턴사용

		StudentUtil su = new StudentUtil();
		Student[] students = su.makeStudents();

		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println("이름은" + student.name);
			System.out.println("번호는" + student.num);
			System.out.println("국어는" + student.kor);
			System.out.println("영어는" + student.eng);
			System.out.println("수학은" + student.math);

		}

	}

}
