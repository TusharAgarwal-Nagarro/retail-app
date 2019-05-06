/**
 User.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.bo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author tusharagarwal
 *
 */
public class User {

	private String name;

	private Date joiningDate;

	private Basket basket;

	private UserType userType;

	public User(String name, Date joiningDate, UserType userType) {

		this.setName(name);
		this.setJoiningDate(joiningDate);
		this.setUserType(userType);
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

		double discount = 0.0;
		switch (this.userType) {

		case EMPLOYEE:
		case AFFILIATE:
			discount = userType.getDiscount();
			break;
		case CUSTOMER:

			Calendar cal = Calendar.getInstance();
			cal.setTime(this.getJoiningDate());
			double diffInyrs = TimeUnit.DAYS.convert(new Date().getTime() - this.getJoiningDate().getTime(),
					TimeUnit.MILLISECONDS) / 365d;
			if (diffInyrs >= 2)
				discount = 0.05;
			break;
		default:
			discount = 0.0;

		}
		return discount;

	}

	/**
	 * @param userType
	 *            the userType to set
	 */
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
