package fr.benocode.superCanard.bo;

public class Colvert extends Canard {

	// Constructeurs
	public Colvert() {
		comportementVol = new VolerAvecDesAiles();
		comportementCancan = new Cancan();
	}

	// Méthodes
	@Override
	public void afficher() {
		System.out.println("Je suis un vrai colvert");
	}

}
