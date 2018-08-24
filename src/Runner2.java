import java.util.Scanner;

public class Runner2 {
	public static void main(String[] args) {
		//DO SOMETHING
		System.out.println("You wake up feeling cold, numb and weightless."
				+ "\nYou can't breathe, you open you eyes."
				+ "\nAs your vision comes into focus you notice the glimmer of water."
				+ "\nYou can see a dim glowing circle above you through the murky brown"
				+ "\nYou start to panic as the time gone by without breathing causes you to gag"
				+ "\nAs survival instinct you lurch forward and everything becomes clear"
				+ "\nYou look around over a flat plain with no distinctive features"
				+ "'\nWelcome to Boneyard!' A voice calls from above"
				+ "\n You must find the treasure and then you can pay for your freedom");
		int[] playerStartPosition = {0,0};
		int[] treasureStartPosition = {10,10};
		
		Player player1 = new Player("Geoffrey", playerStartPosition);
		Treasure treasure1 = new Treasure("Key of Asgard",treasureStartPosition);
		
	}
	
	public static void movementChoice(int[][] swamp) {
		boolean a = true;
		String direction;
		Scanner movementChoice = new Scanner(System.in);
		System.out.println("You can feel an object " + distance + " away from you");
		while (a) 
		{
			System.out.println("You look at your watch and decide to go:");
			
			direction = movementChoice.nextLine();
			
			System.out.println("The object is now " + distance + " away from you");
		}
		System.out.println("You Found the Treasure and Can now pay for your freedom");
	}
}
