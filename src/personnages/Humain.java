package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		
		
	}
	
	public void direBonjour()
	{
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson );
	}

	
	public void boire() {
		
		System.out.println("Mmmh, un bon verre de " + boisson + " GLOUPS ! ");
	}
	
	public void acheter(String bien, int prix) {
		if (argent < prix) {
			System.out.println(parler( )+ "J'ai " + argent + " sous en poche " + ", je n'ai pas assez d'argent pour acheter " + bien + " à " + prix + " sous");
		}
		else {
		perdreArgent(prix);
		System.out.println("J'ai " + argent + " sous en poche. Je vais pouvoir m'offir " + bien + " à " + prix + " sous"  );
		}
	}
	
	public String parler() {
		return ("L'Humain " + nom + " : ");
		
	}
	
	@SuppressWarnings("unused")
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	
	protected void perdreArgent(int gain) {
		argent -= gain;
	}
	
	protected int getArgent() {
		return argent;
	}
	
	public void afficherArgent() {
		System.out.println(nom + " Dispose de " + getArgent() + " €");
	}
	
	public String getNom() {
		return nom;
	}
}

