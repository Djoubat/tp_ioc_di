package fr.wildcodeschool.ioc.mock;

import java.util.ArrayList;
import java.util.List;

import fr.wildcodeschool.ioc.entities.Product;

public class ProductsMock2 {

	
	private List<Product> productList = new ArrayList<Product>();

	public ProductsMock2() {
		productList.add(new Product(1, "ASUS X450", "Laptop", 0));
		productList.add(new Product(2, "LENOVO T450", "imprimante", 1));
		productList.add(new Product(3, "SONY 30", "TV", 5));
		productList.add(new Product(4, "DELL x40", "Laptop", 10));
		productList.add(new Product(5, "HP GR207", "Laptop", 20));
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	
	
	
}
