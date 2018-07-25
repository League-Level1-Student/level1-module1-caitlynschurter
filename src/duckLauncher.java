
public class duckLauncher {
public static void main(String[] args) {
	SirDuckins pigeon = new SirDuckins(0,"Bread Crumbs","Pigeon");
	pigeon.quak();
	pigeon.wadle();
	
	
	SirDuckins chicken = new SirDuckins(754, "Oinions", "Chicken");
	chicken.quak();
	chicken.wadle();
	
	chicken.numberOfFriends = 862;
	System.out.println(chicken.numberOfFriends + " followers! Looks like chicken got really popular on InstaDucky!");
	
	pigeon.favoriteFood = "Bread Crumbs with Butter";
	System.out.println(pigeon.favoriteFood + " is now Pigeon's favorite food. Thanks diner down the street for the amazingness!");
}
}
