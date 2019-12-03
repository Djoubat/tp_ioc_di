package fr.wildcodeschool.ioc.mock;

import java.util.ArrayList;
import java.util.List;

import fr.wildcodeschool.ioc.entities.Product;

public class ProductsMock {

	
	private List<Product> productList = new ArrayList<Product>();

	public ProductsMock() {
		productList.add(new Product(1, "DELL 10", "Laptop", 10));
		productList.add(new Product(2, "DELL 20", "imprimante", 0));
		productList.add(new Product(3, "DELL 30", "TV", 5));
		productList.add(new Product(4, "IBM x40", "Laptop", 10));
		productList.add(new Product(5, "Sony GR207", "Laptop", 20));
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
	
}
