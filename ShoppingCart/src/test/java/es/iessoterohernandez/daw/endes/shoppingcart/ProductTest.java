package es.iessoterohernandez.daw.endes.shoppingcart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.shoppingcart.Product;

class ProductTest {
	
	static Product p1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		p1 = new Product("Portatil",800);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		p1=null;
	}

	@Test
	public void testGetTitle() {
		assertEquals("Portatil",p1.getTitle());
	}

	@Test
	public void testGetPrice() {
		assertEquals(800.0,p1.getPrice(),0.1);
	}

	@Test
	public void testEqualsObject() {
		assertSame(p1, p1);
	}

}