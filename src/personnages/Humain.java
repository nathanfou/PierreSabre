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
		
		System.out.println("Mmmh, un bon verre de " + boisson + "GLOUPS ! ");
	}
	
	public void acheter(String bien, int prix) {
		if (argent < prix) {
			System.out.println(parler( )+ " n'a pas assez d'argent pour acheter le bien " + bien);
		}
		else {
		perdreArgent(prix);
		System.out.println(parler() + " à acheté le bien " + bien + " pour une valeur de " + prix + " €" );
		}
	}
	
	private String parler() {
		return ("L'Humain " + nom + " : ");
		
	}
	
	private void gagnerArgent(int gain) {
		argent += gain;
	}
	
	private void perdreArgent(int gain) {
		argent -= gain;
	}
	
	private int getArgent() {
		return argent;
	}
	
	public void afficherArgent() {
		System.out.println(nom + " Dispose de " + getArgent() + " €");
	}
}

