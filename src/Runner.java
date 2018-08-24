import java.util.Scanner;

public class Runner {
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
		
		int xStartPosition = 1;
		int yStartPosition = 1;
		int xTreasurePosition = 8;
		int yTreasurePosition = 8;
		int [][] swamp;
		swamp = swampGenerator(xStartPosition,yStartPosition,xTreasurePosition,yTreasurePosition);
		movementChoice(swamp);
	}
	
	public static int[][] swampGenerator(int sX, int sY, int tX, int tY) {
		int[][] swamp = new int[9][9];
		swamp[sY][sX] = 1;
		swamp[tY][tX] = 9;
		System.out.println(swamp.length);
		for (int i = 0 ; i < swamp.length ; i++) {
			for (int j = 0 ; j < swamp[i].length ; j++) {
				System.out.print(swamp[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		return swamp;
	}

	public static int[][] newSwamp(int[][] swamp, String direction) {
		for (int i = 0 ; i < 9 ; i++) {
			for (int j = 0 ; j < 9 ; j++) {
				if (swamp[i][j]==1) {
					swamp[i][j] = 0;
					if (direction.equals("North")) {
						swamp[((((i-1)%(swamp.length)) + (swamp.length)) % (swamp.length))][j]++;
						return swamp;
					}
					if (direction.equals("South")) {
						swamp[((((i+1)%(swamp.length)) + (swamp.length)) % (swamp.length))][j]++;
						return swamp;
					}
					if (direction.equals("East")) {
						swamp[i][((((j+1)%(swamp.length)) + (swamp.length)) % (swamp.length))]++;
						return swamp;
					}
					if (direction.equals("West")) {
						swamp[i][((((j-1)%(swamp.length)) + (swamp.length)) % (swamp.length))]++;
						return swamp;
					}
				}
			}
		}
		return swamp;
	}
	
	public static void movementChoice(int[][] swamp) {
		boolean a = true;
		String direction;
		double distance = distance(swamp);
		Scanner movementChoice = new Scanner(System.in);
		System.out.println("You can feel an object " + distance + " away from you");
		while (a) 
		{
			System.out.println("You look at your watch and decide to go:");
			
			direction = movementChoice.nextLine();
	
			swamp = newSwamp(swamp,direction);
			
			for (int i = 0 ; i < swamp.length ; i++) {
				for (int j = 0 ; j < swamp[i].length ; j++) {
					System.out.print(swamp[i][j]);
				}
				System.out.println();
			}
			distance = distance(swamp);
			if (distance==0)
				break;
			System.out.println("The object is now " + distance + " away from you");
		}
		System.out.println("You Found the Treasure and Can now pay for your freedom");
	}
	
	public static double distance(int[][] swamp) {
		int currentX = 0;
		int currentY = 0;
		int treasureX = 0;
		int treasureY = 0;
		double distance;
		for (int i = 0 ; i < swamp.length ; i++) {
			for (int j = 0 ; j < swamp[i].length ; j++) {
				if (swamp[i][j]==1) {
					currentX = j;
					currentY = i;
				}
				if (swamp[i][j]==9) {
					treasureX = j;
					treasureY = i;
				}
			}
		}
		distance = Math.sqrt(((currentX - treasureX)*(currentX - treasureX)) + ((currentY - treasureY)*(currentY - treasureY)));
		System.out.println(distance);
		return distance;
	
	}
}
