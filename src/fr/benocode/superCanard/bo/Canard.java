package fr.benocode.superCanard.bo;

public abstract class Canard {

	protected ComportementVol comportementVol;
	protected ComportementCancan comportementCancan;

	// Constructeurs
	public Canard() {

	}

	// Méthodes
	public abstract void afficher();

	public void effectuerVol() {
		comportementVol.voler();
	}

	public void effectuerCancan() {
		comportementCancan.cancaner();
	}

	public void nager() {
		System.out.println("Tous les canards flottent, même les leurres!");
	}

	// Getters & Setters
	public void setComportementVol(ComportementVol cv) {
		this.comportementVol = cv;
	}

	public void setComportementCancan(ComportementCancan cc) {
		this.comportementCancan = cc;
	}

}
