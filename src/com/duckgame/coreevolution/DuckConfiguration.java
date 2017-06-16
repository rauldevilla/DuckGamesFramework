package com.duckgame.coreevolution;

public class DuckConfiguration {

	private boolean swimmer;
	private boolean flyer;
	private SoundBehavior soundBehavior;
	
	private String type;
	
	public boolean isSwimmer() {
		return swimmer;
	}

	public void setSwimmer(boolean swimmer) {
		this.swimmer = swimmer;
	}
	
	public boolean isFlyer() {
		return flyer;
	}

	public void setFlyer(boolean flyer) {
		this.flyer = flyer;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SoundBehavior getSoundBehavior() {
		return soundBehavior;
	}

	public void setSoundBehavior(SoundBehavior soundBehavior) {
		this.soundBehavior = soundBehavior;
	}
}
