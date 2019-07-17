package com.singtel.assignment.animal.model;

public class Fish implements Animal {

	private String size;
	private String colour;
	private boolean makeJokes;
	private boolean eatsOtherFish;
	private String sound;
	private boolean canWalk;
	private boolean canSwim;
	private boolean canFly;
	
	public Fish() {
		this("Large", "Grey", true , true);
	}

	public Fish(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super();
		this.size = size;
		this.colour = colour;
		this.makeJokes = makeJokes;
		this.eatsOtherFish = eatsOtherFish;
		this.sound = null;
		this.canWalk = false;
		this.canSwim = true;
		this.canFly = false;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isMakeJokes() {
		return makeJokes;
	}

	public void setMakeJokes(boolean makeJokes) {
		this.makeJokes = makeJokes;
	}

	public boolean isEatsOtherFish() {
		return eatsOtherFish;
	}

	public void setEatsOtherFish(boolean eatsOtherFish) {
		this.eatsOtherFish = eatsOtherFish;
	}

}
