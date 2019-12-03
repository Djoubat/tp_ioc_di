package fr.wildcodeschool.ioc.presentation;

import fr.wildcodeschool.ioc.Metier.PorductMetiersImpl;

public class PresentationNull {

	public static void main(String[] args) {
		PorductMetiersImpl produMetiers = new PorductMetiersImpl();
		int id = 1;
		// NullPointerException : l'attribut dao de la classe PorductMetiersImpl n'est pas
		// initialiser donc il est null => on appelle la méthode findById() sur un objet null !!

		if (produMetiers.isAvailable(id))
			System.out.println("le produit dont le id = " + id + " est disponible");

	}

}
