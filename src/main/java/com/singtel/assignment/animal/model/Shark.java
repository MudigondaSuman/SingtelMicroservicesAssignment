package com.singtel.assignment.animal.model;

public class Shark extends Fish {

	public Shark(){
		this("Large", "Grey", false, true);
	}
	public Shark(String size, String colour, boolean makeJokes, boolean eatsOtherFish) {
		super(size, colour, makeJokes, eatsOtherFish);
	}

}
