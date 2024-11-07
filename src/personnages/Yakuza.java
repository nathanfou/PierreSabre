package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.setClan(clan);
	}
	
	public String getClan() {
		return clan;
	}
	
	public void setClan(String clan) {
		this.clan = clan;
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
	
	
}
	
	
	
