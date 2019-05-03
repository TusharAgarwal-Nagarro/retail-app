/**
 Customer.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.objects;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author tusharagarwal
 *
 */
public class Customer extends User {

	public Customer(String name, Date joiningDate) {

		super(name, joiningDate);
	}

	/**
	 * Overrides
	 *
	 * @see com.app.retail.objects.Interfaces.User#getUserDiscount() to get
	 *      discount on customer.
	 * @return
	 */
	@Override
	public double getUserDiscount() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(this.getJoiningDate());
		double diffInyrs = TimeUnit.DAYS.convert(new Date().getTime() - this.getJoiningDate().getTime(),
				TimeUnit.MILLISECONDS) / 365d;
		if (diffInyrs >= 2)
			return 0.05;
		else
			return 0;
	}

}
