package com.duckgames.core;

public abstract class LivingDuck extends Duck {

	public void quak() {
		System.out.println(this.getClass().getName() + ": Quak !!");
	}
	
	public void fly() {
		System.out.println(this.getClass().getName() + ": Flying !!");
	}

}
