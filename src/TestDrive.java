public class TestDrive {
	public static void main(String[] args) {
		Cat cat = new Cat("Garfield"); // error in requirements, Garfield is a
										// personal name and you should write it
										// starting with a capital letter
		System.out.println(cat.getName());
		System.out.println(cat.meow());
	}
}
