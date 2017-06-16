package com.duckgames.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.duckgames.core.DuckSimulator;
import com.duckgames.core.LivingDuck;
import com.duckgames.core.Lure;
import com.duckgames.core.Mallard;
import com.duckgames.core.Mandarin;
import com.duckgames.core.Rubber;

public class TestDucks {

	
	@Test
	public void testShowMandarin() {
		LivingDuck duck = new Mandarin();
		
		String drawing = duck.show();
		
		DuckSimulator.operateLivingDuck(duck);
		
		assertTrue(drawing.indexOf("Mandarin") >= 0);
	}

	@Test
	public void testShowMallard() {
		LivingDuck duck = new Mallard();
		
		String drawing = duck.show();

		DuckSimulator.operateLivingDuck(duck);

		assertTrue(drawing.indexOf("Mallard") >= 0);
	}


	@Test
	public void testShowRubber() {
		Rubber duck = new Rubber();
		
		String drawing = duck.show();

		DuckSimulator.operateRubberDuck(duck);

		assertTrue(drawing.indexOf("Rubber") >= 0);
	}

	@Test
	public void testShowLure() {
		Lure duck = new Lure();
		
		String drawing = duck.show();

		DuckSimulator.operateLureDuck(duck);

		assertTrue(drawing.indexOf("Lure") >= 0);
	}
}
