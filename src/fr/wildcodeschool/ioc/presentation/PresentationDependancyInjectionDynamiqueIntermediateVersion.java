package fr.wildcodeschool.ioc.presentation;

import java.io.File;
import java.util.Scanner;

import fr.wildcodeschool.ioc.Metier.PorductMetiersImpl;
import fr.wildcodeschool.ioc.dao.IProductDao;

public class PresentationDependancyInjectionDynamiqueIntermediateVersion {

	static PorductMetiersImpl produMetiers = new PorductMetiersImpl(); // /!\ couplage fort !!

	public static void main(String[] args) {

		int id;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le id du porduit svp :");
		id = sc.nextInt();
		sc.close();

		// Solution : Injection de dépendances avec la programmation dynamique

		try {
//			System.out.println(System.getProperty("user.dir"));
			sc = new Scanner(new File(System.getProperty("user.dir") + "/config/config.txt"));
			String daoClassName = sc.next();
			sc.close();

//			System.out.println(daoClassName);
//			System.out.println(metierClassName);
			
			// Injection de dépendances et couplage faible
			Class<?> cPDao = Class.forName(daoClassName);
			IProductDao dao = (IProductDao) cPDao.getDeclaredConstructor().newInstance();
//			System.out.println(dao.findById(id));

			produMetiers.setDao(dao);

			if (produMetiers.isAvailable(id))
				System.out.println("le produit " + dao.findById(id) + " est disponible");
			else {
				System.out.println("le produit " + dao.findById(id) + " est indisponible");
			}

			System.out.println("Fin !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
