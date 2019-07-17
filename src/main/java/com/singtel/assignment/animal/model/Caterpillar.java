package com.singtel.assignment.animal.model;

public class Caterpillar implements Animal {

	private String sound;
	private boolean canWalk;
	private boolean canSwim;
	private boolean canFly;
	
	public Caterpillar(){
		this(null, true, false, false);
	}
			
	
	public Caterpillar(String sound, boolean canWalk, boolean canSwim, boolean canFly) {
		super();
		this.sound = sound;
		this.canWalk = canWalk;
		this.canSwim = canSwim;
		this.canFly = canFly;
	}

	@Override
	public boolean walk() {
		return this.canWalk;
	}

	@Override
	public boolean fly() {
		return this.canFly;
	}

	@Override
	public String sing() {
		return this.sound;
	}

	@Override
	public boolean swim() {
		return this.canSwim;
	}

}
