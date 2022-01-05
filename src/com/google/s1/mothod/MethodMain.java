package com.google.s1.mothod;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Start");

System.out.println("뭐지");

System.out.println("깃허브에서작성");		

System.out.println("FINISH");

ReturnStudy rs = new ReturnStudy();

rs.test1();

int count =rs.test2();
System.out.println("Main"+count);

String name = rs.test3();
System.out.println(name);

double num=Math.random();

Scanner sc=rs.test4();
System.out.println("나이 입력하세요");
int age=sc.nextInt();

System.out.println("age"+age);
System.out.println("math.random"+num);

	}

}
