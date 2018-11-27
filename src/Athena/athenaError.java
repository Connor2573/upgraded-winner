package Athena;

import java.util.HashMap;

public class athenaError {
	
	private String key;
	private HashMap<String, String> errors = new HashMap<String, String>();
	
	private String ler1 = "I apologize but that is not the correct password.";
	
	public athenaError(String key) {
		this.key = key.toUpperCase();
		errors.put("LE1", ler1);
	}
	
	String getErrorDescription() {
		String descrip = errors.get(key);
		return descrip;
	}
}
