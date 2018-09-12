
public class SeaCreatureLauncher {
public static void main(String[] args) {
	
	SeaCreature Spongy = new SeaCreature("spongebob");
	String nameSpongy = Spongy.getName();
	System.out.println(nameSpongy);
	Spongy.eat();
	Spongy.laugh();
	
	
	SeaCreature Squidy = new SeaCreature("squidward");
	String nameSquidy = Squidy.getName();
	System.out.println(nameSquidy);
	Squidy.eat();
	Squidy.laugh();
	
	SeaCreature Patrick = new SeaCreature("patrick");
	String namePatrick = Patrick.getName();
	System.out.println(namePatrick);
	Patrick.eat();
	Patrick.laugh();
}
}
