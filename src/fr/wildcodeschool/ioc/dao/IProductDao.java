package fr.wildcodeschool.ioc.dao;

import java.util.List;

import fr.wildcodeschool.ioc.entities.Product;

public interface IProductDao {
	
	public List<Product> findAll();
	public Product findById(Integer id);

}
