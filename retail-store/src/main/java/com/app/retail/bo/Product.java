/**
 Product.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.bo;

/**
 * @author tusharagarwal
 *
 */
public class Product {

	private String name;
	private double price;
	private ProductType productType;

	/**
	 * @param name
	 * @param price
	 * @param productCategory
	 */
	public Product(String name, double price, ProductType productType) {
		super();
		this.name = name;
		this.price = price;
		this.productType = productType;
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
	 * @return the productType
	 */
	public ProductType getProductType() {
		return productType;
	}

	/**
	 * @param productType
	 *            the productType to set
	 */
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}
