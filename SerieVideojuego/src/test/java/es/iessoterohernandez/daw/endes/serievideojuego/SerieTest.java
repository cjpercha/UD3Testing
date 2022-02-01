package es.iessoterohernandez.daw.endes.serievideojuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterohernandez.daw.endes.serievideojuego.Serie;

class SerieTest {
	
	static Serie s1;
    static Serie s2;
    static Serie s3;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s1 = new Serie("The Simpsons", 33, "Comedia", "20th Century Fox");
        s2 = new Serie("Castle", 8, "Misterio", "ABC Studios");
        s3 = new Serie("Dragon Ball", 1, "Accion", "Toei Animation");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		s1=null;
		s2=null;
		s3=null;
	}

	

	@Test
	public void testSetTitulo() {
		s1.setTitulo("The Simpsons");
        assertEquals("The Simpsons", s1.getTitulo());
	}

	@Test
	public void testSetnumeroTemporadas() {
		s2.setnumeroTemporadas(33);
        assertEquals(33, s1.getnumeroTemporadas());
	}

	@Test
	public void testSetGenero() {
		s1.setGenero("Comedia");
        assertEquals("Comedia", s1.getGenero());
	}

	@Test
	public void testSetcreador() {
		s1.setCreador("Fox");
        assertEquals("Fox", s1.getCreador());
	}

	@Test
	public void testEntregar() {
		s1.entregar();
        assertEquals(true, s1.isEntregado());
	}

	@Test
	public void testDevolver() {
		s1.devolver();
        assertEquals(false, s1.isEntregado());
	}

	@Test
    public void testIsEntregado() {
        s1.devolver();
        assertEquals(false, s1.isEntregado());
    }
	@Test
	public void testCompareTo() {
		assertEquals(Serie.MENOR, s2.compareTo(s1));
        assertEquals(Serie.MAYOR, s2.compareTo(s3));
        assertEquals(Serie.IGUAL, s1.compareTo(s1));
	}

	@Test
	public void testToString() {
		assertEquals("Informacion de la Serie: \n"
                + "\tTitulo: " + s1.getTitulo() + "\n"
                + "\tNumero de temporadas: " + s1.getnumeroTemporadas() + "\n"
                + "\tGenero: " + s1.getGenero() + "\n"
                + "\tCreador: " + s1.getCreador(), s1.toString());
	}

	@Test
	public void testEqualsSerie() {
		assertEquals(false, s1.equals(s2));
        assertEquals(true, s1.equals(s1));
	}

}
