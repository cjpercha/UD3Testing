package es.iessoterhernandez.daw.endes.persona;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.iessoterhernandez.daw.endes.persona.Persona;

class PersonaTest {

	Persona p;
	
	@BeforeEach
	void setUp() throws Exception {
		 p = new Persona();
	}
	
	@Test
	void testSetNombre() {
        p.setNombre("Juan");
        assertEquals("Juan", p.getNombre());
	}

	@Test
	void testSetEdad() {
        p.setEdad(25);
        assertEquals(25, p.getEdad());
	}

	@Test
	void testSetSexo() {
        p.setSexo('H');
        assertEquals('H', p.getSexo());
	}

	@Test
	void testSetPeso() {
        p.setPeso(73);
        assertEquals(73, p.getPeso());
	}

	@Test
	void testSetAltura() {
        p.setAltura(1.84);
        assertEquals(1.84, p.getAltura());
	}

	@Test
	void testCalcularIMC() {
        p = new Persona("Juan", 25, 'H', 60, 1.84);
        assertEquals(-1, p.calcularIMC());
        p = new Persona("Juan", 25, 'H', 120, 1.84);
        assertEquals(1, p.calcularIMC());
        p = new Persona("Juan", 25, 'H', 80, 1.84);
        assertEquals(0, p.calcularIMC());
	}

	@Test
	void testEsMayorDeEdad() {
        p = new Persona("Juan", 25, 'H', 73, 1.84);
        assertEquals(true, p.esMayorDeEdad());
        p = new Persona("Juan", 15, 'H', 73, 1.84);
        assertEquals(false, p.esMayorDeEdad());
	}

	@Test
	void testToString() {
		p = new Persona("Juan", 25, 'H', 73, 1.84);
		assertEquals(
				"Informacion de la persona:\n"
                + "Nombre: " + "Juan" + "\n"
                + "Sexo: " + "hombre" + "\n"
                + "Edad: " + 25 + " años\n"
                + "DNI: " + p.getDNI() + "\n"
                + "Peso: " + 73.0 + " kg\n"
                + "Altura: " + 1.84 + " metros\n", p.toString());
	}

}
