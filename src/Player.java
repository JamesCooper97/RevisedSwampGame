
public class Player extends MapObject {
	private double distance;
	
	public Player(String name, int[] position, double distance) {
		
		super(name,position);
		
		this.distance = 0.0;
	}
	
	public double getPlayerDistance() {
		return this.distance;
	}
	
	public void setPlayerDistance() {
		double distance = 0;
		int dx = player[0]-treasure[0];
		int dy = player[1]-treasure[1];
		distance = Math.hypot(dx, dy);
		this.distance = distance;
	}
}
