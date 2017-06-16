package com.duckgames.core;

public class Rubber extends Duck {

	@Override
	public String show() {
		return "Showing Rubber Duck";
	}

	public void chiii() {
		System.out.println(this.getClass().getName() + ": Chiii !!");
	}

}
