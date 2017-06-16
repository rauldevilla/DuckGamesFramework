package com.duckgame.coreevolution;

public class DuckSimulator {

	private static void line() {
		System.out.println("----------------------");
	}
	
	public static void operateDuck(Duck duck) {
		duck.show();
		duck.swim();
		duck.fly();
		duck.doSound();
		line();
	}

}
