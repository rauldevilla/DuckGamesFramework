package com.duckgames.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.duckgame.coreevolution.ChiiSoundBehavior;
import com.duckgame.coreevolution.Duck;
import com.duckgame.coreevolution.DuckBuilder;
import com.duckgame.coreevolution.DuckConfiguration;
import com.duckgame.coreevolution.DuckSimulator;
import com.duckgame.coreevolution.QuakSoundBehavior;

public class TestDuckEvolution {
	
	private DuckConfiguration getMallardConfiguration() {
		DuckConfiguration configuration = new DuckConfiguration();
		configuration.setType("Mallard");
		configuration.setSwimmer(true);
		configuration.setFlyer(true);
		configuration.setSoundBehavior(new QuakSoundBehavior());
		return configuration;
	}

	private DuckConfiguration getMandarinConfiguration() {
		DuckConfiguration configuration = new DuckConfiguration();
		configuration.setType("Mandarin");
		configuration.setSwimmer(true);
		configuration.setFlyer(true);
		configuration.setSoundBehavior(new QuakSoundBehavior());
		return configuration;
	}

	private DuckConfiguration getRubberConfiguration() {
		DuckConfiguration configuration = new DuckConfiguration();
		configuration.setType("Rubber");
		configuration.setSwimmer(true);
		configuration.setFlyer(false);
		configuration.setSoundBehavior(new ChiiSoundBehavior());
		return configuration;
	}

	private DuckConfiguration getLukeConfiguration() {
		DuckConfiguration configuration = new DuckConfiguration();
		configuration.setType("Luke");
		configuration.setSwimmer(true);
		configuration.setFlyer(false);
		return configuration;
	}

	@Test
	public void testMallard() {
		DuckConfiguration configuration = getMallardConfiguration();
		Duck duck = DuckBuilder.build(configuration);
		DuckSimulator.operateDuck(duck);
	}

	@Test
	public void testMandarin() {
		DuckConfiguration configuration = getMandarinConfiguration();
		Duck duck = DuckBuilder.build(configuration);
		DuckSimulator.operateDuck(duck);
	}

	@Test
	public void testRubber() {
		DuckConfiguration configuration = getRubberConfiguration();
		Duck duck = DuckBuilder.build(configuration);
		DuckSimulator.operateDuck(duck);
	}

	@Test
	public void testLuke() {
		DuckConfiguration configuration = getLukeConfiguration();
		Duck duck = DuckBuilder.build(configuration);
		DuckSimulator.operateDuck(duck);
	}
}
