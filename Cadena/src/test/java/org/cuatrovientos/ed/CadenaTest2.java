package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadenaTest2 {
Cadena cad;
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLongitud() {
		String actual = "Estas";
		int expected = cad.longitud(actual);
		assertEquals(expected,actual);
		
	}
	@Test
	void testLongitudFail() {
		String actual = "Estas";
		int expected = 2;
		assertEquals(expected,actual);
		
	}
	@Test
	void testVocales() {
		String actual = "Estas";
		int expected =cad.vocales(actual);
		assertEquals(expected,actual);
	}
	@Test
	void testVocalesFail() {
		String actual = "Estas";
		int expected =1;
		assertEquals(expected,actual);
	}
	@Test
	void testInvertir() {
		String actual = "Estas";
		String expected =cad.invertir(actual);
		assertEquals(expected,actual);
	}

	@Test
	void testInvertirFail() {
		String actual = "Estas";
		String expected ="so";
		assertEquals(expected,actual);
	}

	@Test
	void testContarLetra() {
		char caracter ='a';
		String actual = "Estas";
		int expected =cad.contarLetra(actual, caracter);
		assertEquals(expected,actual);
	}
	@Test
	void testContarLetraFail() {
		char caracter ='a';
		String actual = "Estas";
		int expected =cad.contarLetra(actual, caracter);
		assertEquals(expected,actual);
	}

}
