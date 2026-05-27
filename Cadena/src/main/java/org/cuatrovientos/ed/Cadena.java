package org.cuatrovientos.ed;

public class Cadena {

	
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		char caracter;
		int con = 0;
		for (int i = 0; i < cadena.length(); i++) {
			 caracter = cadena.charAt(i);
			if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
				con ++;
			}
		}
		return con;
	}
	public String invertir(String cadena) {
		StringBuilder inver = new StringBuilder(cadena);
		return inver.reverse().toString();
	}
	public int contarLetra(String cadena, char caracter) {
		int cont = 0;
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == caracter) {
				cont ++;
			}
		}
		return cont;
	}
	
}