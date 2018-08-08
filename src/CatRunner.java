
public class CatRunner {
public static void main(String[] args) {
	Cat kitty = new Cat("mew");
	kitty.meow();
	kitty.printName();
	
	
	for(int i = kitty.gethunger() ; i>0 ; i--) {
		kitty.feedFish();
		}
	
	
	
	
	
}
}
