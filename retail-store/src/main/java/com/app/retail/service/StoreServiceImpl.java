/**
 StoreServiceImpl.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.service;

import java.util.Map.Entry;

import com.app.retail.bo.Product;
import com.app.retail.bo.User;

/**
 * @author tusharagarwal
 *
 */

public class StoreServiceImpl implements StoreService {

	/**
	 * Overrides
	 *
	 * @see com.app.retail.service.StoreService#calculateBill(com.app.retail.bo.User)
	 *      to <purpose>
	 * @param user
	 * @return
	 */
	public double calculateBill(User user) {

		double amount = 0;
		for (Entry<Product, Integer> productEntry : user.getBasket().getProducts().entrySet()) {

			Product product = productEntry.getKey();
			if (product.getProductType().isUserDiscountFlag()) {
				amount += product.getPrice() * (1 - user.getUserDiscount())
						* (1 - product.getProductType().getProductTypeDiscount());
			} else
				amount += product.getPrice() * (1 - product.getProductType().getProductTypeDiscount());
		}
		if (amount >= 100.0)
			amount = amount - (int) (amount / 100) * 5;
		return amount;
	}

}
