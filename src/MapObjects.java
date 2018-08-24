
public abstract class MapObject {
	private String name;
	private int[] position;
	
	public MapObject(String name, int[] position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getPosition() {
		return this.position;
	}
	
	public void setPosition(String direction) {
		if (direction.equals("North")) {
			this.position = 
		}
		
		this.position = position;
	}
}
