package es.iessoterohernandez.daw.endes.shoppingcart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.shoppingcart.Product;
import es.iessoterohernandez.daw.endes.shoppingcart.ProductNotFoundException;
import es.iessoterohernandez.daw.endes.shoppingcart.ShoppingCart;

class ShopinCartTest {
	
	static Product p1;
	static Product p2;
    static ShoppingCart s1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 p1 = new Product("Portatil",800);
         p2 = new Product("Ventilador", 39.99);
        s1 = new ShoppingCart();
        s1.addItem(p1);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		p1=null;
		p2=null;
	}

	

	@Test
	public void testAddItem() {
		s1.addItem(p2);
        double Total=p1.getPrice()+p2.getPrice();
        assertEquals(Total,s1.getBalance(),0.001);
        assertEquals(2,s1.getItemCount());
	}

	@Test
	public void testRemoveItem() throws ProductNotFoundException {
		s1.removeItem(p1);
        assertEquals(0,s1.getItemCount());
	}

	@Test
	public void testGetItemCount() {
		s1.addItem(p1);
        assertEquals(1,s1.getItemCount());
	}

	@Test
	public void testEmpty() {
		s1.empty();
        assertEquals(0,s1.getItemCount());
	}

}
