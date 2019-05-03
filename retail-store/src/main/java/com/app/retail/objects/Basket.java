/**
 Basket.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.objects;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tusharagarwal
 *
 */
public class Basket {

	private Map<Product, Integer> itemsMap = new HashMap<Product, Integer>();

	public Map<Product, Integer> getProducts() {
		return itemsMap;
	}

	public void addToBasket(Product product, Integer quantity) {

		itemsMap.put(product, quantity);
	}

	public void removeFromBasket(Product product) {
		itemsMap.remove(product);
	}

}
