package es.iessoterohernandez.daw.endes.cuentatarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	Debito m;
	Date d = new Date();

	@BeforeEach
	void setUp() throws Exception {
		m = new Debito("123321", "Juan", d);
	}
	
	@Test
	void testIngresar() {
		try {
		m.ingresar(100.0);
		assertEquals(100.0,m.getSaldo());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	@Test
	void testRetirar() {
		try {
		m.ingresar(100.0);
		m.retirar(100.0);
		assertEquals(0.0,m.getSaldo());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	@Test
	void testpagoEnEstablecimiento() {
		try {
		m.ingresar(100.0);
		m.pagoEnEstablecimiento("Restaurante", 100.0);
		assertEquals(0.0,m.getSaldo());
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	

}
