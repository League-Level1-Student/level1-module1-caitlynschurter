
public class TacoMaker2000 {
public static void main(String[] args) {
	Taco tacocat = new Taco();
	tacocat.setMeat("mouse");
	tacocat.setSauce("no sauce");
	System.out.println("This taco has " + tacocat.getMeat() + " and " + tacocat.getSauce());
}
}
