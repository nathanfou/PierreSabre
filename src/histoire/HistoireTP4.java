package histoire;

import personnages.Humain;

public class HistoireTP4 {

	
	public static void main(String[] args) {
		Humain test = new Humain("Test","cola",34);
		test.direBonjour();
		test.acheter("crotte", 50);
		test.afficherArgent();
	}
}

