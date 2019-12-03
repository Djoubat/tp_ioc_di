package fr.wildcodeschool.ioc.doaimpl;

import java.util.List;

import fr.wildcodeschool.ioc.dao.IProductDao;
import fr.wildcodeschool.ioc.entities.Product;
import fr.wildcodeschool.ioc.mock.ProductsMock;

public class ProductDaoImpl implements IProductDao {
	
	ProductsMock productsMock = new ProductsMock();
	
	@Override
	public List<Product> findAll(){
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
