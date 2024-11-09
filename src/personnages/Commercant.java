package personnages;

public class Commercant extends Humain {
	

	public Commercant(String nom, int argent) {
		super(nom,"Thé", argent);
	}
	
	
	 public int seFaireExtorquer() {
	        int argentExtorque = getArgent(); 
	        perdreArgent(argentExtorque);     
	        System.out.println(parler() + "Le monde est vraiment trop injuste...");
	        return argentExtorque;
	    }

	    public void recevoir(int argent) {
	        gagnerArgent(argent);  
	        System.out.println(parler() + "Merci infiniment pour ces " + argent + " sous !");
	    }
	    
	    
	    
		@Override
		public String parler() {
			return ("(Le Commerçant " + getNom() + ") - ");
		}

}
