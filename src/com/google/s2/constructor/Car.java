package com.google.s2.constructor;

public class Car {

	String brand;
	String company;
	int cc;
	String color;
	public Car() {
		System.out.println("생성자 실행");
		this.company = "Kia";
		this.brand = "k9";
		this.color="black";
		this.cc = 2000;
	}// 생성자
	
	

	public Car(String brand) {
		this.company="Kia";
		this.brand=brand;  //이름 짓는데 시간이 오래걸림, 그래서 멤버변수에는 this를 꼭 붙이고 중복으로 만듬
		this.color="black";
		this.cc=5000;
	}
	
	public Car(String brand,String color) {//생성자 멤버변수의 갯수,혹은 타입이 같으면 안되기 때문에 이렇게함
		
		this.company="Kia";
		this.brand=brand; 
		this.color=color;
		this.cc=5000;
		
	}
	
	public Car(String brand,String color,int cc) {
		this.company="Kia";
		this.brand=brand; 
		this.color=color;
		this.cc=cc;
	}
	
	
	
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.color);
		System.out.println(this.cc);

	}
}