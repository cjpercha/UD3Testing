package es.iessoterohernandez.daw.endes.boletin;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.boletin.Subscripcion;

class SubscripcionTest {
	
	static Subscripcion s1;
	static Subscripcion s2;
	static Subscripcion s3;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s1=new Subscripcion(10,0);
		s2= new Subscripcion(0,1);
		s3= new Subscripcion(10,1);
		
	}

	@Test
	void testPrecioPorMes() {
		assertEquals(0.0,s1.precioPorMes());
		assertEquals(0.0,s2.precioPorMes());
		assertEquals(10.0,s3.precioPorMes());
	}

	

}
