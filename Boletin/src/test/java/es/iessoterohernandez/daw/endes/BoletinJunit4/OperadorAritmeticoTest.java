package es.iessoterohernandez.daw.endes.BoletinJunit4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperadorAritmeticoTest {
	
	static int x;
	static int y;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		x=8;
		y=2;
	}

	@Test
	void testSuma() {
		assertEquals(10,OperadorAritmetico.suma(8, 2));
	}

	@Test
	void testDivision() throws Exception {
		assertEquals(4,OperadorAritmetico.division(8, 2));
	}

}
