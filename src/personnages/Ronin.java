package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		
		super(nom,boisson,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int dixPourcents = getArgent() / 10 ;
		perdreArgent(dixPourcents);
		beneficiaire.gagnerArgent(dixPourcents);
		System.out.println(parler() + beneficiaire.getNom() + " prends ces " + dixPourcents + " sous");
		System.out.println(beneficiaire.parler() + dixPourcents + " sous ! Je te remercie généreux donnateur " + getNom() + "." );
		
	}
	
	@Override
	public String parler() {
		return ("(Le Ronin " + getNom() + ") - ");
	}
	
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur *2;
		if(force >= adversaire.getReputation()) {
			System.out.println(parler() + "Je t'ai retrouvé vermine, tu vas payer pour ce que tu " + 
					"as fait à ce pauvre marchand!");
			gagnerArgent(adversaire.getArgent());
			System.out.println(parler() + "Je t’ai eu petit yakusa!");
			adversaire.perdre();
			honneur += 1;
		}
		else {
			System.out.println(parler() + "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur -= 1;
			
		}
	}
}
