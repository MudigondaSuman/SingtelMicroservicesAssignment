package com.singtel.assignment.animal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.assignment.animal.model.Animal;
import com.singtel.assignment.animal.model.Butterfly;
import com.singtel.assignment.animal.model.Cat;
import com.singtel.assignment.animal.model.Chicken;
import com.singtel.assignment.animal.model.Clownfish;
import com.singtel.assignment.animal.model.Dog;
import com.singtel.assignment.animal.model.Duck;
import com.singtel.assignment.animal.model.Fish;
import com.singtel.assignment.animal.model.Frog;
import com.singtel.assignment.animal.model.Parrot;
import com.singtel.assignment.animal.model.Rooster;
import com.singtel.assignment.animal.model.Shark;

public class AnimalTest {

	@Test
    public void animalSoundTest() {
        Animal animal = new Cat();
        assertEquals(animal.sing(), "Meow");
    }
	
	@Test
    public void animalParrotWithCat() {
        Parrot parrotWithCat = new Parrot();
        Parrot parrotWithDog = new Parrot();
        Parrot parrotWithRooster = new Parrot();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Rooster rooster = new Rooster();
        assertEquals(parrotWithCat.sing(cat), "Meow");
        assertEquals(parrotWithDog.sing(dog), "Woof woof");
        assertEquals(parrotWithRooster.sing(rooster), "Cock-a-doodle-doo");
    }
	
	@Test
    public void animalCount() {
		int flyCount = 0;
		int walkCount = 0;
		int swimCount = 0;
		int singCount = 0;
		Animal[] animals = new Animal[]{
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new Parrot(),
				 new Fish(),
				 new Shark(),
				 new Clownfish(),
				 new Frog(),
				 new Dog(),
				 new Butterfly(),
				 new Cat()
				};
		for(Animal animal: animals) {
			if(animal.fly()){
				flyCount++;
			}
			if(animal.walk()){
				walkCount++;
			}
			if(animal.swim()){
				swimCount++;
			}
			if(animal.sing() != null){
				singCount++;
			}
		}
		System.out.println("Fly Count: " + flyCount);
		System.out.println("Walk Count: " + walkCount);
		System.out.println("Swim Count: " + swimCount);
		System.out.println("Sing Count: " + singCount);
    }
}
