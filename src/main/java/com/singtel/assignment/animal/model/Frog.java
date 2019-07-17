package com.singtel.assignment.animal.model;

public class Frog extends Fish {

	public Frog(){
		this("Small", "Green", false, false);
	}
	public Frog(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super(size, colour, makeJokes, eatsOtherFish);
	}

}
