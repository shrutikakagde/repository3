package com.example.ShoppingCart.dto;

public class ProductDetails {

     int id;
	
	String productName;   //Mobile
	
	int price;   // 60000
	
	String productType;   //  Phone
	
	String description;   //ram,gpu,cpu,
	
    int productId;  //34  
	
	String brandName;   // Mi
	
	String category;  //electronic
	
	float size;  //  
	
	String type;  //intel core i3
	
	

	public ProductDetails(int id, String productName, int price, String productType, String description, int productId,
			String name, String category, float size, String type, String brandName) {
		
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.productType = productType;
		this.description = description;
		this.productId = productId;
		this.brandName = brandName;
		this.category = category;
		this.size = size;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return brandName;
	}

	public void setName(String brandName) {
		this.brandName = brandName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
