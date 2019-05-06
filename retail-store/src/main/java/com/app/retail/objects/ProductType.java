/**
 ProductType.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 06-May-2019

*/
package com.app.retail.objects;

/**
 * @author tusharagarwal
 *
 */
public enum ProductType {

	GROCERY(false, 0.0), APPAREL(true, 0.0);

	private boolean userDiscountFlag;
	private double productTypeDiscount;

	ProductType(boolean userDiscountFlag, double productTypeDiscount) {
		this.userDiscountFlag = userDiscountFlag;
		this.productTypeDiscount = productTypeDiscount;

	}

	/**
	 * @return the userDiscountFlag
	 */
	public boolean isUserDiscountFlag() {
		return userDiscountFlag;
	}

	/**
	 * @return the productTypeDiscount
	 */
	public double getProductTypeDiscount() {
		return productTypeDiscount;
	}

}
