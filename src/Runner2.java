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
				+ "\n You must find the treasure and then, only then, you may pay for your freedom");
		int[] playerStartPosition = {0,0};
		int[] treasureStartPosition = {1,0};
		
		Player player1 = new Player("Geoffrey", playerStartPosition);
		Treasure treasure1 = new Treasure("Key of Asgard",treasureStartPosition);
		World world1 = new World();
		
		world1.addToWorld(player1);
		world1.addToWorld(treasure1);

		boolean a = true;
		String direction;
		double distance;
		Scanner movementChoice = new Scanner(System.in);
		System.out.println("You can feel a presence around you");
		while (a) 
		{
			System.out.println("You look at your watch and decide to go: ");
			
			direction = movementChoice.nextLine();
			
			world1.positionCalculator(direction,player1);
				
			distance = world1.distanceCalculator(player1);
			
			if (distance == 99999)
				break;
			
			System.out.println(player1.getPosition()[0] + " , " + player1.getPosition()[1]);
			
			
			System.out.println("The object is now " + distance + " away from you");
		}
		System.out.println("You Wake back in your room, it was just a dream. You walk lazily downstairs. The house is quiet"
				+ "\nno noise. You look at your watch. You then notice the pictures on the side. They are you all just you, you stare at the absence of your family. Your "
				+ "\neyes widen and you let your spoon fall out your mouth as you remember the crys and screams, sounded distinctly like your mother calling " + player1.getName() + " " + player1.getName());
	}
}
