package Athena;

import java.util.HashMap;
import java.util.Optional;

public class athenaDialog {
	
	private String id;
	HashMap<String, AthenaUser> usrIDs = new HashMap<String, AthenaUser>(); 
	
	
	public athenaDialog(String id) {
		this.id = id;
	}
	
	private void greeting(AthenaUser au) {
		talk("Hello " + au.getName() + ".");

		talk("You have " + au.getAccessLevel() + " you must be a ");//LEFT OFF HERE
	}
	private void talk(String x) {
		System.out.println("Athena: " + x);
		if(upNext(x)) {
			System.out.println(id + ": ");
		}
	}
	private boolean upNext(String x) {
		boolean upNext;
		if(x.toUpperCase().indexOf(':') == x.length() -1) {
			upNext = true;
		}
		else
			upNext = false;
		return upNext;
	}
	
	
	private void generatingUsers() {
		AthenaUser Connor = new AthenaUser("Connor", 3);
		
		usrIDs.put("CKP", Connor);
	}
}
