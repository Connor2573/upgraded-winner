package Athena;

public class AthenaUser {
	
	private String name;
	private int accessLevel;
	
	public AthenaUser(String name, int al) {
		this.name = name;
		this.accessLevel = al;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAccessLevel() {
		return accessLevel;
	}
}
