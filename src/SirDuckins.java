
public class SirDuckins {
	
int numberOfFriends = 0;
String favoriteFood = "";
String name = "";


public void quak() {
	System.out.println(this.name + " screams Quak!!!!!!!!!!");
	
}

public void wadle() {
	System.out.println(this.name + " tries to steal ur crackers      *shuffle shuffle*  *almost looses balance*");
	
}

public SirDuckins(int numberOfFriends, String favoriteFood, String name) {
	this.numberOfFriends = numberOfFriends;
	this.favoriteFood = favoriteFood;
	this.name = name;
	System.out.println(this.name + " was created from thin air and has come to enjoy ur crackers!");
	
}

}
