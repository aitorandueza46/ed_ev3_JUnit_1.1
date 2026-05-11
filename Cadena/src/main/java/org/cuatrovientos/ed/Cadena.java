package org.cuatrovientos.ed;

public class Cadena {


	    public int longitud(String cadena) {
	        return cadena.length();
	    }

	    
	    public int vocales(String cadena) {
	        int contador = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            char c = cadena.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                contador++;
	            }
	        }
	        return contador;
	    }

	    
	    public String invertir(String cadena) {
	    	
	        return new StringBuilder(cadena).reverse().toString();
	    }

	    
	    public int contarLetra(String cadena, char caracter) {
	        int contador = 0;
	        for (int i = 0; i < cadena.length(); i++) {
	            if (cadena.charAt(i) == caracter) {
	                contador++;
	            }
	        }
	        return contador;
	    }
	}

