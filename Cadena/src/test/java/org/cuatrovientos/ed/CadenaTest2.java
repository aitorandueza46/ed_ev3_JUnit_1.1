package org.cuatrovientos.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CadenaTest2 {
	Cadena cad;
	
	
	 @Test 
	 void testLongitudFail() { 
		 String actual = "Cuatrovientos"; 
		 int  expected = 2;
	  assertEquals(expected, actual); 
	  }
	 
	 @Test
	 void testLongitud() {
		 String actual = "Cuatrovientos";
		 int expected = cad.longitud(actual);
		 assertEquals(expected, actual);
	 }
	 
	 void testVocalesFail() { 
		 String actual = "Cuatrovientos"; 
		 int  expected = 1;
	  assertEquals(expected, actual); 
	  }
	 
	 void testVocales() { 
		 String actual = "Cuatrovientos"; 
		 int  expected = 6;
	  assertEquals(expected, actual); 
	  }
	 
	 void testInvertirFail() { 
		 String actual = "Cuatrovientos"; 
		 int  expected = 2;
	  assertEquals(expected, actual); 
	  }
	 
	 
	 void testInvertir() { 
		 String actual = "Cuatrovientos"; 
		 int  expected = 13;
	  assertEquals(expected, actual); 
	  }
	 
	 
	 void testContarLetraFail() { 
		 String actual = "Cuatrovientos"; 
		 int  expected = 1;
	  assertEquals(expected, actual); 
	  }
	 
	 
	 void testContarLetra() { 
		 String actual = "Cuatrovientos"; 
		 int  expected = 6;
	  assertEquals(expected, actual); 
	  }

}