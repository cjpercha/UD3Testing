package es.iessoterohernandez.daw.endes.cuentatarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.cuentatarjeta.Cuenta;

class CuentaTest {
	
	Cuenta c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Cuenta("123321","Juan");
		
	}

	@Test
	void testIngresar() {
		try {
			c.ingresar(100.0);
			assertEquals(100.0,c.getSaldo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testRetirar() {
		try {
		c.retirar(100.0);
		assertEquals(0.0,c.getSaldo());
	} catch (Exception e) {
		e.printStackTrace();
	}
}

	@Test
	void testIngresarString() {
		try {
			c.ingresar("Ingreso", 200);
			assertEquals(200,c.getSaldo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testRetirarString() {
		try {
			c.retirar("Retirada", 200);
			assertEquals(0,c.getSaldo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void testGetSaldo() throws Exception {
		c.ingresar(100);
		assertNotEquals(200,c.getSaldo());
	}

	

}
