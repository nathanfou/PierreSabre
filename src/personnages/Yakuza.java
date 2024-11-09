package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public String getClan() {
		return clan;
	}
	
	

	
	@Override
	public String parler() {
		return ("(Le Yakuza " + getNom() + ") - ");
	}


		

	public void extorquer(Commercant victime) {
		gagnerArgent(victime.getArgent());
		reputation += 1;
		int argentAvant= victime.getArgent();
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler() + "Marco, si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		System.out.println(parler() + "J’ai piqué les " + argentAvant + " sous de" + victime.getNom() + "ce qui me fait " + getArgent() + " sous dans ma\r\n"
				+ "poche. Hi ! Hi ! ");
}
	
	
	
	public void perdre() {
		if (reputation > 0) {
		reputation -= 1;
		}
		System.out.println(parler() + "J'ai perdu mon duel et mes " + getArgent() + " sous, snif... J'ai déshonoré le clan de " + getClan() + ".");
		perdreArgent(getArgent());
		
	}
	
	public void gagner(int gain) {
		
		reputation += 1;
		gagnerArgent(gain);
		System.out.println(parler() + "Ce ronin pensait vraiment battre " + getNom() + 
				" du clan de " + getClan() + "?" + " Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
	public int getReputation() {
		return reputation;
	}
}
	
	
	
