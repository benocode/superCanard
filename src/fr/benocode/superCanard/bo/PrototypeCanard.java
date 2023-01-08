package fr.benocode.superCanard.bo;

public class PrototypeCanard extends Canard {

	public PrototypeCanard() {
		comportementVol = new NePasVoler();
		comportementCancan = new Cancan();
	}

	@Override
	public void afficher() {
		System.out.println("Je suis un prototype de canard");
	}

}
