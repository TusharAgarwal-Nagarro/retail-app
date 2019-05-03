/**
 Apparel.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.objects;

import com.app.retail.objects.Interfaces.ProductCategory;

/**
 * @author tusharagarwal
 *
 */
public class Apparel implements ProductCategory {

	/**
	 * Overrides
	 *
	 * @see com.app.retail.objects.Interfaces.ProductCategory#isUserDiscountAvailable()
	 *      to <purpose>
	 * @return
	 */
	public boolean isUserDiscountAvailable() {

		return true;
	}

	/**
	 * Overrides
	 *
	 * @see com.app.retail.objects.Interfaces.ProductCategory#getDiscountOnCategory()
	 *      to <purpose>
	 * @return
	 */
	public double getDiscountOnCategory() {

		return 0;
	}

}
