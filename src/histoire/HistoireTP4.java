package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("une Boisson",12);
//		prof.acheter("un jeu", 2);
//		prof.acheter("un Kimono", 50);
		
		Yakuza Yaku = new Yakuza("Yaku Le Noir","whisky", 30, "Ombre");
		Commercant marco = new Commercant("Marco",15);
		Yaku.direBonjour();
		Yaku.extorquer(marco);
	
		
	}
}

