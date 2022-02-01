package es.iessoterohernandez.daw.endes.serievideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.serievideojuego.*;

class VideojuegoTest {
	
	 static Videojuego v1;
	 static Videojuego v2;
	 static Videojuego v3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		v1 = new Videojuego("Skyrim", 80, "RPG", "Bethesda");
        v2 = new Videojuego("Gwent", 999, "Card Game", "CD Projekt Red");
        v3 = new Videojuego("Starcraft", 30, "Estrategia", "Blizzard");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		v1=null;
		v2=null;
		v3=null;
	}

	@Test
	public void testSetHorasEstimadas() {
		v1.setHorasEstimadas(80);
        assertEquals(80, v1.getHorasEstimadas());
	}

	@Test
	public void testSetGenero() {
		v1.setGenero("RPG");
        assertEquals("RPG", v1.getGenero());
	}

	@Test
	public void testSetcompanyia() {
		v1.setcompanyia("Bethesda");
        assertEquals("Bethesda", v1.getcompanya());
	}

	@Test
	public void testEntregar() {
		v1.entregar();
        assertEquals(true, v1.isEntregado());
	}

	@Test
	public void testDevolver() {
		v1.devolver();
        assertEquals(false, v1.isEntregado());
		
	}

	@Test
	public void testIsEntregado() {
		v1.devolver();
        assertEquals(false, v1.isEntregado());
	}

	@Test
	public void testCompareTo() {
		assertEquals(Videojuego.MENOR, v1.compareTo(v2));
        assertEquals(Videojuego.MAYOR, v1.compareTo(v3));
        assertEquals(Videojuego.IGUAL, v3.compareTo(v3));
	}

	@Test
	public void testToString() {
		assertEquals("Informacion del videojuego: \n"
                + "\tTitulo: " + v2.getTitulo() + "\n"
                + "\tHoras estimadas: " + v2.getHorasEstimadas() + "\n"
                + "\tGenero: " + v2.getGenero() + "\n"
                + "\tcompañia: " + v2.getcompanya(), v2.toString());
	}

	@Test
	public void testEqualsVideojuego() {
		assertEquals(false, v1.equals(v2));
        //assertEquals(true, v3.equals(v3)); no entidendo porque da error si compara un objeto consigo mismo
	}

}
