package com.duckgames.core;

public class DuckSimulator {

	private static void line() {
		System.out.println("---------------");
	}
	
	public static void operateLivingDuck(LivingDuck duck) {
		System.out.println(duck.show());
		duck.swim();
		duck.quak();
		duck.fly();
		line();
	}

	public static void operateRubberDuck(Rubber duck) {
		System.out.println(duck.show());
		duck.swim();
		duck.chiii();
		line();
	}

	public static void operateLureDuck(Lure duck) {
		System.out.println(duck.show());
		duck.swim();
		line();
	}

}
