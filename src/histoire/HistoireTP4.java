package histoire;

import personnages.Commercant;
import personnages.Humain;

public class HistoireTP4 {

	
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("une Boisson",12);
//		prof.acheter("un jeu", 2);
//		prof.acheter("un Kimono", 50);
		
		Commercant marco = new Commercant("Marco",10);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

	}
}

