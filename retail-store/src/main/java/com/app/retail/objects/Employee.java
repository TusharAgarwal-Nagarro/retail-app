/**
 Employee.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.objects;

import java.util.Date;

/**
 * @author tusharagarwal
 *
 */
public class Employee extends User {

	public Employee(String name, Date joiningDate) {

		super(name, joiningDate);
	}

	/**
	 * Overrides
	 *
	 * @see com.app.retail.objects.Interfaces.User#getUserDiscount() to get
	 *      discount on employee
	 * @return
	 */
	@Override
	public double getUserDiscount() {
		return 0.3;
	}

}
