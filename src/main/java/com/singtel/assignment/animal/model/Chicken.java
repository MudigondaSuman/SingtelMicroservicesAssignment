package com.singtel.assignment.animal.model;

public class Chicken extends Bird {

	public Chicken() {
		this("Cluck, cluck", true, false, false); 
	}

	public Chicken(String sound, boolean canWalk, boolean canSwim, boolean canFly) {
		super(sound, canWalk, canSwim, canFly);
	}

}
