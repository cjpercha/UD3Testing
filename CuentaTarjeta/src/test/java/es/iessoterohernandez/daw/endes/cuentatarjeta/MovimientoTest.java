package es.iessoterohernandez.daw.endes.cuentatarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.cuentatarjeta.Movimiento;

class MovimientoTest {

	Movimiento m;

	@BeforeEach
	void setUp() throws Exception {
		m = new Movimiento();
	}

	@Test
	void testGetImporte() {
		m.setImporte(100);
		assertEquals(100,m.getImporte());
	}

	@Test
	void testGetConcepto() {
		m.setConcepto("Ingreso");
		assertEquals("Ingreso",m.getConcepto());
	}

	

	@Test
	void testGetFecha() {
		Date d = new Date();
		m.setFecha(d);
		assertEquals(d,m.getFecha());
	}

	
}
