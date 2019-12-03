package fr.wildcodeschool.ioc.doaimpl;

import java.util.List;

import fr.wildcodeschool.ioc.dao.IProductDao;
import fr.wildcodeschool.ioc.entities.Product;
import fr.wildcodeschool.ioc.mock.ProductsMock2;

public class ProductDaoImpl2 implements IProductDao {
	
	ProductsMock2 productsMock = new ProductsMock2();

	@Override
	public List<Product> findAll() {
		return productsMock.getProductList();
	}

	@Override
	public Product findById(Integer id) {
		for (Product p : findAll()) {

			if (p.getId().equals(id))
				return p;

		}
		return null;
	}

}
