/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

		/* Do the following things without changing the Cat class */

		// Create a CatRunner class with a main method that creates a Cat object.

        // 1. Make the Cat meow
		
		// 2. Get the Cat to print it's name

		// 3. Kill (feed) the Cat!  -_-,



public class Cat {

	private String name;
	private int hunger = 10;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void feedFish() {
		hunger--;
		if (hunger > 0)
			System.out.println("My hunger level is still at  " + hunger + "! I wants more fishies!");
		else if (hunger < 0)
			System.out.println("Admit it, you're not dat hungy");
		else
			System.out.println("FULL CAT! :)");
	}

	public int gethunger() {
		return this.hunger;
	}
	

}


