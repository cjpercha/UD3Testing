package es.iessoterohernandez.daw.endes.boletin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.boletin.Account;

class AccountTest {
	
	static Account c;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c= new Account("Juan", 1, 99f);
	}

	//No consigo que salga
	@Test
	void testGetBalance() {
		assertEquals(99f, c.getBalance());
	}
	
	@Test
	void testDeposit() {
		assertEquals(true,c.deposit(30f));
		assertEquals(false,c.deposit(-10f));
	}

	@Test
	void testWithdraw() {
		assertEquals(false, c.withdraw(-10f, -8f));
		assertEquals(true, c.withdraw(10f, 8f));
	}

	@Test
	void testAddInterest() {
		c.addInterest();
		assertEquals(99f + (99f * 0.045f), c.getBalance());
	}


	@Test
	void testGetAccountNumber() {
		assertEquals(1, c.getAccountNumber());
	}
	
}
