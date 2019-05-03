/**
 User.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.objects;

import java.util.Date;

/**
 * @author tusharagarwal
 *
 */
public class User {

	private String name;

	private Date joiningDate;

	private Basket basket;

	public User() {
	}

	public User(String name, Date joiningDate) {

		this.setName(name);
		this.setJoiningDate(joiningDate);
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
	 * @return the joiningDate
	 */
	public Date getJoiningDate() {
		return joiningDate;
	}

	/**
	 * @param joiningDate
	 *            the joiningDate to set
	 */
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	/**
	 * @return the basket
	 */
	public Basket getBasket() {
		return basket;
	}

	/**
	 * @param basket
	 *            the basket to set
	 */
	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public double getUserDiscount() {
		return 0;
	}
}
