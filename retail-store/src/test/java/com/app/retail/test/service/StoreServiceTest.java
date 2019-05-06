/**
 StoreServiceTest.java
 @author Tushar Agarwal <tushar.agarwal@nagarro.com>
 Created On 03-May-2019

*/
package com.app.retail.test.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.app.retail.bo.Basket;
import com.app.retail.bo.Product;
import com.app.retail.bo.ProductType;
import com.app.retail.bo.User;
import com.app.retail.bo.UserType;
import com.app.retail.service.StoreService;
import com.app.retail.service.StoreServiceImpl;

/**
 * @author tusharagarwal
 *
 */

public class StoreServiceTest {

	StoreService storeService;

	@Before
	public void setUp() {

		storeService = new StoreServiceImpl();
	}

	@Test
	public void testCalculateBill_Emloyee() {

		User user = new User("john", new Date(), UserType.EMPLOYEE);
		Basket basket = new Basket();
		user.setBasket(basket);
		Product p1 = new Product("milk", 20.0, ProductType.GROCERY);
		basket.addToBasket(p1, 1);
		Product p2 = new Product("shirt", 200.0, ProductType.APPAREL);
		basket.addToBasket(p2, 1);

		double amountToPay = storeService.calculateBill(user);

		Assert.assertEquals(155.0, amountToPay, 0.0);

	}

	@Test
	public void testCalculateBill_Affiliate() {

		User user = new User("bob", new Date(), UserType.AFFILIATE);
		Basket basket = new Basket();
		user.setBasket(basket);
		Product p1 = new Product("milk", 20.0, ProductType.GROCERY);
		basket.addToBasket(p1, 2);
		Product p2 = new Product();
		p2.setName("trouser");
		p2.setPrice(100.0);
		p2.setProductType(ProductType.APPAREL);
		basket.addToBasket(p2, 1);

		double amountToPay = storeService.calculateBill(user);

		Assert.assertEquals(105.0, amountToPay, 0.0);

	}

	@Test
	public void testCalculateBill_Customer() throws ParseException {

		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		User user = new User("john", sf.parse("01-01-2017"), UserType.CUSTOMER);
		Basket basket = new Basket();
		user.setBasket(basket);
		Product p1 = new Product("milk", 20.0, ProductType.GROCERY);
		basket.addToBasket(p1, 1);
		Product p2 = new Product("shirt", 200.0, ProductType.APPAREL);
		basket.addToBasket(p2, 1);

		double amountToPay = storeService.calculateBill(user);

		Assert.assertEquals(200.0, amountToPay, 0.0);

	}

	@Test
	public void testCalculateBill_Customer2() throws ParseException {

		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		User user = new User("john", sf.parse("01-01-2018"), UserType.CUSTOMER);
		Basket basket = new Basket();
		user.setBasket(basket);
		Product p1 = new Product("milk", 20.0, ProductType.GROCERY);
		basket.addToBasket(p1, 1);
		Product p2 = new Product("shirt", 200.0, ProductType.APPAREL);
		basket.addToBasket(p2, 1);
		basket.removeFromBasket(p1);

		double amountToPay = storeService.calculateBill(user);

		Assert.assertEquals(190.0, amountToPay, 0.0);

	}

}
