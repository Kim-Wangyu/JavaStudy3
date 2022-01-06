package com.google.s2.constructor;

public class Engine {

	String name;
	String fuel;

	{
		// 초기화 블럭
		this.name = "v6";
		this.fuel = "Gas";
	}

	public void info() {
		System.out.println(this.name);
		System.out.println(this.fuel);

	}
}
