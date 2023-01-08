package fr.benocode.superCanard.app;

import fr.benocode.superCanard.bo.Canard;
import fr.benocode.superCanard.bo.Colvert;
import fr.benocode.superCanard.bo.PropulsionAReaction;
import fr.benocode.superCanard.bo.PrototypeCanard;

public class AppliTestCanard {

	public static void main(String[] args) {
		Canard colvert = new Colvert();
		colvert.effectuerCancan();
		colvert.effectuerVol();

		System.out.println("******************");

		Canard proto = new PrototypeCanard();
		proto.effectuerVol();
		proto.setComportementVol(new PropulsionAReaction());
		proto.effectuerVol();
	}

	// suite du livre page 57

}
