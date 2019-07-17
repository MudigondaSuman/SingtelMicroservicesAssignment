Singtel Assignment:
=================
Used Spring Boot and Microservices for the RESTFul API Implementation.


Model Design:
============
Animal is the main interface which defines the contract for the implementation classes
Bird and Fish are the abstract classes which implements Animal and has default behaviour.
Chicken and Duck extends the features of Bird
Rooster uses association of Bird instead of inheritance
Parrot implementation: sings the same with the animal with whom it stays and is maintanable with other animals too.
Shark, Dolphin and clownfish extends Fish and has its own features


Junit(AnimalTest.java) Test Results:
===================================

animalSoundTest: Test what cat says, and asserts to "Meow"
Animal animal = new Cat();
assertEquals(animal.sing(), "Meow");



animalParrotWithCat: Test what parrot says with different animals like Cat,Dog and Rooster
Parrot parrotWithCat = new Parrot();
Parrot parrotWithDog = new Parrot();
Parrot parrotWithRooster = new Parrot();
Cat cat = new Cat();
Dog dog = new Dog();
Rooster rooster = new Rooster();
assertEquals(parrotWithCat.sing(cat), "Meow");
assertEquals(parrotWithDog.sing(dog), "Woof woof");
assertEquals(parrotWithRooster.sing(rooster), "Cock-a-doodle-doo");


animalCount: Test to get the count of animals who sing, walk, fly and swim
Fly Count: 3
Walk Count: 6
Swim Count: 5
Sing Count: 5


RESTful API for querying these animals:
======================================

Run 'SingtelMicroservicesAssignmentApplication' class as a spring boot application.
Once the deployment is successful, query what animal says using below URL:

http://localhost:8080/animal/Cat
Response: 
Cat says : Meow

http://localhost:8080/animal/Dog
Response:
Dog says : Woof woof