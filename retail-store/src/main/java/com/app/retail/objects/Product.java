/**
 Product.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.objects;

import com.app.retail.objects.Interfaces.ProductCategory;

/**
 * @author tusharagarwal
 *
 */
public class Product {

	private String name;
	private double price;
	private ProductCategory productCategory;

	/**
	 * @param name
	 * @param price
	 * @param productCategory
	 */
	public Product(String name, double price, ProductCategory productCategory) {
		super();
		this.name = name;
		this.price = price;
		this.productCategory = productCategory;
	}

	/**
	 *
	 */
	public Product() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the productCategory
	 */
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory
	 *            the productCategory to set
	 */
	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

}
