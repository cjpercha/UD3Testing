package es.iessoterohernandez.daw.endes.cuentatarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoTest {

	Credito c;
	Date d = new Date();

	@BeforeEach
	void setUp() throws Exception {
		c = new Credito("123321","Juan", d, 10000.0);
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
		c.ingresar(100.0);
		c.retirar(100.0);
		assertEquals(0.0,c.getSaldo());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	@Test
	void testpagoEnEstablecimiento() {
		try {
		c.ingresar(100.0);
		c.pagoEnEstablecimiento("Restaurante", 100.0);
		assertEquals(0.0,c.getSaldo());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	//Este no lo tengo claro
	@Test
	void testgetCreditoDisponible() {
		try {
		c.retirar(100.0);
		assertEquals(9900.0,c.getCreditoDisponible());
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
