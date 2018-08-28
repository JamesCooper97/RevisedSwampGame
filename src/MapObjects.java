
public abstract class MapObjects {
	private String name;
	private int[] position;
	
	public MapObjects(String name, int[] position) {
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int[] getPosition() {
		return this.position;
	}
	
	public void setPosition(int[] coord) {
		this.position = coord;
	}
}