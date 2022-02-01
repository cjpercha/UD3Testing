package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BadMoneyTest {
	
	static Account c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		c= new Account("Juan", 1, 99.9f);
	}
	
	//Igual que con Account
	@Test
	void testGetBalance() {
		assertEquals(47.5f, c.getBalance());
	}

	@Test
	void testDeposit() {
		assertEquals(true,c.deposit(100.50f));
		assertEquals(false,c.deposit(-42f));
	}

	@Test
	void testWithdraw() {
		assertEquals(false, c.withdraw(-10f, -8f));
		assertEquals(true, c.withdraw(10f, 8f));
	}

	@Test
	void testAddInterest() {
		c.addInterest();
		assertEquals(99.9f + (99.9f * 0.045f), c.getBalance());
	}

	@Test
	void testGetAccountNumber() {
		assertEquals(00000000001, c.getAccountNumber());
	}


}
