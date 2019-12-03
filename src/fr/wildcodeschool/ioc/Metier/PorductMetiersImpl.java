package fr.wildcodeschool.ioc.Metier;

import fr.wildcodeschool.ioc.IMetier.IProductMetier;
import fr.wildcodeschool.ioc.dao.IProductDao;
import fr.wildcodeschool.ioc.entities.Product;

public class PorductMetiersImpl implements IProductMetier {

	private IProductDao dao;

	@Override
	public Boolean isAvailable(Integer id) {
		try {
			Product p = this.dao.findById(id);
			
			try {
				return p.getQuantity() > 0 ? true : false;
			} catch (NullPointerException e) {
				return false;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		return null;
	}

	public void setDao(IProductDao dao) {
		this.dao = dao;
	}

}
