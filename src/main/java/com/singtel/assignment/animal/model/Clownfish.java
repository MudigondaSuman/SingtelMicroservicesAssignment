package com.singtel.assignment.animal.model;

public class Clownfish extends Fish {

	public Clownfish(){
		this("small", "orange", true, false);
	}
	public Clownfish(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super(size, colour, makeJokes, eatsOtherFish);
	}

}
