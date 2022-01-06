package com.google.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		int select = 0;
		StudentUtil su = new StudentUtil();
		// while밖으로 ! 객체는 하나만필요
		su.initUtil();//init로 초기화 스캐너
		Student[] students = null;
		// while밖으로 !와일문 안에 있으면 초기화되기때문에 밖에 놓을필요

		StudentView sv = new StudentView();
		while (flag) {

			System.out.println("1.학생들의 정보 입력");
			System.out.println("2.학생들의 정보 출력");
			System.out.println("3.학생정보 검색");
			System.out.println("4.프로그램 종료");
			select = scan.nextInt();

			switch (select) {
			case 1:

				students = su.makeStudents();

				break;
			case 2:
				if (students != null) {
					sv.view(students);
				} else {
					sv.view("학생정보없음");
				}
				break;
			case 3:
				Student student = su.search(students);
				if (student != null) {

					sv.view(student);
				}else {
					sv.view("검색결과없음");
				}
				break;
			default:
				System.out.println("종료");
				flag = false;
				break;

			}

		}
	}
}
