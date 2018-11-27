package Athena;

import java.util.Scanner;

public class Athena {
	
	//SCANNERS
	Scanner kb = new Scanner(System.in);
	
	//VARIABLES
	private String cpass = "CKP";
	private String personalIdentifier = "You: ";

	
	public Athena() {
		boolean init = false;
		while(init == false) {
			talk("Hello.");
			talk("Enter your password below:");
			String pass = kb.nextLine();
			if(pass.equals(cpass)) {
				init = true;
				athenaDialog ad = new athenaDialog(personalIdentifier);
			}
			else {
				athenaError le1 = new athenaError("le1");
				talk(le1.getErrorDescription());
			}
		}
	}
	private void talk(String x) {
		System.out.println("Athena: " + x);
		if(upNext(x)) {
			System.out.println(personalIdentifier + ": ");
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
}
