/**
 UserType.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 06-May-2019

*/
package com.app.retail.bo;

/**
 * @author tusharagarwal
 *
 */
public enum UserType {

	EMPLOYEE(0.3), AFFILIATE(0.1), CUSTOMER(0.05);

	private double discount;

	UserType(double discount) {
		this.discount = discount;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

}
