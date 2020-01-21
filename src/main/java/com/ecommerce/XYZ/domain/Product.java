package com.ecommerce.XYZ.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String sku;
	
	@Column(nullable = false)
	private String type;
	
	@Column(nullable = false)
	private String brand;
	
	@Column(nullable = false)
	private String color;
	
	@Column(nullable = false)
	private int size;
	
	@Column(nullable = false)
	private double price;
	
	@Column(nullable = false)
	private int availibleItem;
	
	@Column(nullable = true)
	private String descrption;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAvailibleItem() {
		return availibleItem;
	}

	public void setAvailibleItem(int availibleItem) {
		this.availibleItem = availibleItem;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", sku=" + sku + ", type=" + type + ", brand=" + brand + ", color=" + color
				+ ", size=" + size + ", price=" + price + ", availibleItem=" + availibleItem + ", descrption="
				+ descrption + "]";
	}
	
	
	
	
	
}
