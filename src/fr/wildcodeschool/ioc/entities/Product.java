package fr.wildcodeschool.ioc.entities;

public class Product {
	
	public Integer id;
	public String name, description;
	public Integer quantity;
	
	
	
	public Product(Integer id, String name, String description, Integer quantity) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", quantity=" + quantity + "]";
	}
	

}
