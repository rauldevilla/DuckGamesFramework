package com.duckgames.core;

public abstract class Duck {
	
	public void swim() {
		System.out.println(this.getClass().getName() + ": Swimming");
	}

	public abstract String show();
}
