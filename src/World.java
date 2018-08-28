import java.util.ArrayList;

public class World {
	
	private ArrayList<Object> treasureList = new ArrayList<Object>();
	int treasures = treasureList.size();
	
	public void addToWorld(Object object) {
		if (object instanceof Treasure) {
			treasureList.add(object);
		}
	}
	
	public double distanceCalculator(Player player) {
		double dx;
		double dy;
		double distanceToTreasure = 0;
		double closestTreasure = 10000d;
		int[] playerPosition = player.getPosition();
		
		for (Object j : treasureList) {
			int[] treasurePosition = ((Treasure)j).getPosition();
			
			dx = playerPosition[0] - treasurePosition[0];
			dy = playerPosition[1] - treasurePosition[1];
			distanceToTreasure = Math.hypot(dx,dy);
			
			if (distanceToTreasure < closestTreasure) {
				closestTreasure = distanceToTreasure;
			}
			
			if (playerPosition[0] == treasurePosition[0] && playerPosition[1] == treasurePosition[1]) {
				treasureList.remove(j);
				System.out.println("You have found a treasure, you take it to a lone tree where you hope to open it"
						+ "\nthe treasure suddenly dissintegrates through your fingures, but before you are"
						+ "\nable to panic the booming voice from above calls");
				if (treasureList.isEmpty()) {
					System.out.print(" 'You have brought me great fortune and bought yourself back into the real world'"
							+ "\nYour vision starts too fade as you see " + treasures + " dark figures appear around you."
							+ "\nYour ears fill with the sound of screaming and just as they start to fade the voice says"
							+ "\nthankyou for their souls hahaha.");
					return 99999d;
				}
				else {
					System.out.print("'To pay you way out I will need more', You Scolder and punch the tree, 'HOW MANY MORE'"
							+ "\nThe voice remains silent and all you can hear is the quiet slopping of the murky water against"
							+ "\nyour legs.");
				}
			}
		}
	
		return closestTreasure;
	}
	
	public void positionCalculator(String direction, Player player) {
		if (direction.equals("North")) {
			int[] newPosition = {player.getPosition()[0],player.getPosition()[1]+1};
			player.setPosition(newPosition);
		}
		if (direction.equals("South")) {
			int[] newPosition = {player.getPosition()[0],player.getPosition()[1]-1};
			player.setPosition(newPosition);
		}
		if (direction.equals("East")) {
			int[] newPosition = {player.getPosition()[0]+1,player.getPosition()[1]};
			player.setPosition(newPosition);
		}
		if (direction.equals("West")) {
			int[] newPosition = {player.getPosition()[0]-1,player.getPosition()[1]};
			player.setPosition(newPosition);
		}
	}
}
