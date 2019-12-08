package fr.wildcodeschool.ioc.presentation;

import java.util.Scanner;

import fr.wildcodeschool.ioc.Metier.PorductMetiersImpl;
import fr.wildcodeschool.ioc.doaimpl.ProductDaoImpl;

public class PresentationDependancyInjectionStatic {

	static PorductMetiersImpl produMetiers = new PorductMetiersImpl(); // /!\ couplage fort !!
	static ProductDaoImpl productDaoImpl = new ProductDaoImpl() ; // /!\ couplage fort !!
	
	public static void main(String[] args) {
		
		int id;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le id du porduit svp :");
		id = sc.nextInt();
		sc.close();
		
		// Injection d'un objet ProductDaoImpl pour pouvoir l'utiliser via le setter
		// => Injection des dépendences
		produMetiers.setDao(productDaoImpl);

		if (produMetiers.isAvailable(id))
			System.out.println("le produit " + productDaoImpl.findById(id) + " est disponible");
		else {
			System.out.println("le produit " + productDaoImpl.findById(id) + " est indisponible");
		}
		
		System.out.println("Fin !!");
//		 => jusque là nous avons tous simplement pousser le couplage fort 
//		vers la couche présentation 
//		on a couplage faible entre la classe ProductMetier et ProductDaoImpl
//		mais on a toujours un couplage fort entre la classe presentation 
//		et la classe PrductMetier
//		c'est une injection de dépendances statique

	}

}
