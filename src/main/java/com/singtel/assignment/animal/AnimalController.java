package com.singtel.assignment.animal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.assignment.animal.model.Animal;

@RestController
public class AnimalController {

	@GetMapping(value = "/animal/{animalName}")
	public String whatAnimalSays(@PathVariable("animalName") String animalName)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		String className = "com.singtel.assignment.animal.model."+animalName;
		Animal animal = (Animal) Class.forName(className).newInstance();
		String output = animalName + " says : " + animal.sing();
		return output;
	}
}
