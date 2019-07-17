package com.singtel.assignment.animal.model;

public class Duck extends Bird {

	public Duck() {
		this("Quack, Quack", true, true, false); 
	}

	public Duck(String sound, boolean canWalk, boolean canSwim, boolean canFly) {
		super(sound, canWalk, canSwim, canFly);
	}

}
