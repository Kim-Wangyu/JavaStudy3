package com.google.s2.constructor;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		// 변수 선언 = new 생성자호출
		Car car = new Car();
//		car.brand="k7";
//		car.company="Kia";
//		car.cc=2000;
		car.info();

		Car car2 =new Car("k5");
		
		car2.info();
		
		Car car3 =new Car("k3","White");
		car3.info();
		
		Car car4 = new Car("k5","Yellow",2000);
		car4.info();
		
		Car car5 = new Car ("k9","Red",5000);
		
		
		
	}

}
