package com.duckgame.coreevolution;

public class DuckBuilder {

	public static Duck build(DuckConfiguration duckConfiguration) {
		Duck duck = new Duck();

		duck.setType(duckConfiguration.getType());
		duck.setSwimmer(duckConfiguration.isSwimmer());
		duck.setFlyer(duckConfiguration.isFlyer());
		duck.setSoundBehavior(duckConfiguration.getSoundBehavior());
		
		return duck;
	}

}
