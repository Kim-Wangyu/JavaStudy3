package com.google.s1.student;

import java.util.Scanner;

public class StudentUtil {
	Scanner sc = new Scanner(System.in);
//학생 객체를 생성하고 정보를 입력 받는 
	public Student search(Student[] students) {
		// 검색 할 학생의 번호를 입력
		// 입력받은 번호와 일치하는 학생 찾아서 리턴

		System.out.println("검색할 학생 번호 입력");
		int selectNum = sc.nextInt();

		Student student = null;

		for (int i = 0; i < students.length; i++) {

			if (selectNum == students[i].num) {
				student = students[i];

			}
		}
		return student;
	}
	
	public Student[] makeStudents() {
		//학생의 수를 입력 받음
		//키보드로부터 이름,번호,국어 영어수학입력
		//학생들의 정보를 리턴
		Scanner sc= new Scanner(System.in);
		Student stu = new Student();
		
		
		System.out.println("학생수 입력");
		int count=sc.nextInt();
		Student [] students = new Student[count];
		
		for(int i=0;i<students.length;i++) {
		Student student = new Student();
		
			
			System.out.println("학생이름 입력");
		student.name=sc.next();
		System.out.println("번호 입력");
		student.num=sc.nextInt();
		System.out.println("국어 입력");
		student.kor=sc.nextInt();
		System.out.println("영어 입력");
		student.eng=sc.nextInt();
		System.out.println("수학 입력");
		student.math=sc.nextInt();
		students[i]=student;
		
		
		}
		return students;
	}
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
