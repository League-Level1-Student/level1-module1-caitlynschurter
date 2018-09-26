
public class PersonLauncher {
public static void main(String[] args) {
	Person Bob = new Person();
	Bob.setName("Bob");
	Bob.setSuperPower("invisibility");
	System.out.println("Hello. I am " + Bob.getName() + "! My super power is " + Bob.getSuperPower() + ".");
}
}
