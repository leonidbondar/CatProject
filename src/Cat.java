public class Cat extends Animal {

	Cat(String name) {
		super(name);
	}

	public String meow() {
		String meowText = "Cat " + this.name + " is saying meow"; // error in
																	// requirements,
																	// sayig is
																	// put
		return meowText;
	}

}
