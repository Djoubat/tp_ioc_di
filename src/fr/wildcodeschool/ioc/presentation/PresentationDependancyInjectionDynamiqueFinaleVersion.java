package fr.wildcodeschool.ioc.presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import fr.wildcodeschool.ioc.IMetier.IProductMetier;
import fr.wildcodeschool.ioc.Metier.PorductMetiersImpl;
import fr.wildcodeschool.ioc.dao.IProductDao;

public class PresentationDependancyInjectionDynamiqueFinaleVersion {

	public static void main(String[] args) {
		int id;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le id du porduit svp :");
		id = sc.nextInt();
		sc.close();

		// Solution : Injection de dépendance avec la programmation dynamique

		try {
//			System.out.println(System.getProperty("user.dir"));
			sc = new Scanner(new File(System.getProperty("user.dir") + "/config/config.txt"));
			String daoClassName = sc.next();
			String metierClassName = sc.next();

//			System.out.println(daoClassName);
//			System.out.println(metierClassName);

			// Creation de l'objet dao de type ProductDaoImpl dynamiquement
			Class<?> cPDao = Class.forName(daoClassName);
			IProductDao dao = (IProductDao) cPDao.getDeclaredConstructor().newInstance();
//			System.out.println(dao.findById(id));

			// Creation de l'objet pMetier de type PorductMetiersImpl dynamiquement
			Class<?> cPMetier = Class.forName(metierClassName);
			IProductMetier pMetier = (IProductMetier) cPMetier.getConstructor().newInstance();

			// appeller la fonction setDao de la classe PorductMetiersImpl dynamiquement
			Method m = cPMetier.getMethod("setDao", IProductDao.class);
			m.invoke(pMetier, dao);

			if (pMetier.isAvailable(id))
				System.out.println("le produit dont le id = " + id + " est disponible");
			else {
				System.out.println("le produit dont le id = " + id + " est indisponible");
			}

			System.out.println("Fin !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
