package com.singtel.assignment.animal.model;

public class Rooster implements Animal {
	
	private Bird bird = new Bird("Cock-a-doodle-doo", true, false, true);

	public String sing() {
		return bird.sing();
	}

	@Override
	public boolean walk() {
		return bird.walk();
	}

	@Override
	public boolean fly() {
		return bird.fly();
	}

	@Override
	public boolean swim() {
		return bird.swim();
	}
}
