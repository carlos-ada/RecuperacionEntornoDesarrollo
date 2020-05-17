package Pruebas;

public class Funciones {
	public static Boolean funcion1(String cadena) {

		Boolean resp = null;
		int contador = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'A')
					|| (cadena.charAt(i) == 'E') || (cadena.charAt(i) == 'I') || (cadena.charAt(i) == 'O')
					|| (cadena.charAt(i) == 'U') || (cadena.charAt(i) == 'á')|| (cadena.charAt(i) == 'é')
					|| (cadena.charAt(i) == 'í')|| (cadena.charAt(i) == 'ó')|| (cadena.charAt(i) == 'ú')
					|| (cadena.charAt(i) == 'Á')|| (cadena.charAt(i) == 'É')|| (cadena.charAt(i) == 'Í')
					|| (cadena.charAt(i) == 'Ó')|| (cadena.charAt(i) == 'Ú')) {

				contador++;

				if (contador >= 20) {

					resp = true;

				} else {

					resp = false;
				}
			}
		}
		return resp;
	}

	public static String funcion2(String palabra, String palabra2) {

		int contVocales = 0;
		int contVocales2 = 0;
		int contConsonantes = 0;
		int contConsonantes2 = 0;
		int longitud = palabra.length();
		int longitud2 = palabra2.length();
		String result = null;

		for (int x = 0; x < longitud; x++) {
			if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'e') || (palabra.charAt(x) == 'o')
					|| (palabra.charAt(x) == 'i') || (palabra.charAt(x) == 'u') || (palabra.charAt(x) == 'A')
					|| (palabra.charAt(x) == 'E') || (palabra.charAt(x) == 'I') || (palabra.charAt(x) == 'O')
					|| (palabra.charAt(x) == 'U') || (palabra.charAt(x) == 'á') || (palabra.charAt(x) == 'é')
					|| (palabra.charAt(x) == 'í') || (palabra.charAt(x) == 'ó') || (palabra.charAt(x) == 'ú')
					|| (palabra.charAt(x) == 'Á') || (palabra.charAt(x) == 'É') || (palabra.charAt(x) == 'Í')
					|| (palabra.charAt(x) == 'Ó') || (palabra.charAt(x) == 'Ú') || (palabra.charAt(x) == ':')
					|| (palabra.charAt(x) == ';') || (palabra.charAt(x) == '.') || (palabra.charAt(x) == ',')
					|| (palabra.charAt(x) == '¿') || (palabra.charAt(x) == '?') || (palabra.charAt(x) == '!')
					|| (palabra.charAt(x) == '¡') || (palabra.charAt(x) == '-') || (palabra.charAt(x) == '_')) {
				contVocales++;
			}
			contConsonantes = longitud - contVocales;
		}
		for (int y = 0; y < longitud2; y++) {
			if ((palabra2.charAt(y) == 'a') || (palabra2.charAt(y) == 'e') || (palabra2.charAt(y) == 'o')
					|| (palabra2.charAt(y) == 'i') || (palabra2.charAt(y) == 'u') || (palabra2.charAt(y) == 'A')
					|| (palabra2.charAt(y) == 'E') || (palabra2.charAt(y) == 'I') || (palabra2.charAt(y) == 'O')
					|| (palabra2.charAt(y) == 'U') || (palabra2.charAt(y) == 'á') || (palabra2.charAt(y) == 'é')
					|| (palabra2.charAt(y) == 'í') || (palabra2.charAt(y) == 'ó') || (palabra2.charAt(y) == 'ú')
					|| (palabra2.charAt(y) == 'Á') || (palabra2.charAt(y) == 'É') || (palabra2.charAt(y) == 'Í')
					|| (palabra2.charAt(y) == 'Ó') || (palabra2.charAt(y) == 'Ú') || (palabra2.charAt(y) == ':')
					|| (palabra2.charAt(y) == ';') || (palabra2.charAt(y) == '.') || (palabra2.charAt(y) == ',')
					|| (palabra2.charAt(y) == '¿') || (palabra2.charAt(y) == '?') || (palabra2.charAt(y) == '!')
					|| (palabra2.charAt(y) == '¡') || (palabra2.charAt(y) == '-') || (palabra2.charAt(y) == '_')) {
				contVocales2++;
			}
			contConsonantes2 = longitud2 - contVocales2;
		}

		if (contConsonantes > contConsonantes2) {

			result = palabra;

		} else if (contConsonantes < contConsonantes2) {

			result = palabra2;

		} else if (contConsonantes == contConsonantes2) {

			result = null;
		}
		return result;

	}

	public static Integer funcion3(int[] listaNumeros) {

		int edad = 20;
		int mitadEdad = 10;
		int resp = 0;
		
		if(listaNumeros == null) {
			return null;
		}

		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] <= edad && listaNumeros[i] >= mitadEdad) {
				resp = resp + listaNumeros[i];
			}
		}
		return resp;
	}

	public static String funcion4(int[] notas) {

		int sumaNotas = 0;
		int mediaNotas = 0;
		String resp = null;
		
		if(notas == null) {
			return null;
		}

		for (int i = 0; i < notas.length; i++) {
			sumaNotas = sumaNotas + notas[i];
		}

		mediaNotas = sumaNotas / notas.length;

		if (mediaNotas < 5 && mediaNotas > 0) {
			resp = "Insuficiente";
		} else if (mediaNotas >= 5 && mediaNotas < 6) {
			resp = "Suficiente";
		} else if (mediaNotas >= 6 && mediaNotas < 7) {
			resp = "Bien";
		} else if (mediaNotas >= 7 && mediaNotas < 9) {
			resp = "Notable";
		} else if (mediaNotas >= 9 && mediaNotas == 10) {
			resp = "Sobresaliente";
		}

		return resp;
	}

	public static Integer funcion5(String simbolo, int num1, int num2) {

		int resp = 0;
		String suma = "+";
		String resta = "-";
		String vacio = "";
		String multiplicacion = "*";
		
		if (simbolo == suma) {
			resp = num1 + num2;
		} else if (simbolo == resta) {
			resp = num1 - num2;
		} else if (simbolo == multiplicacion) {
			resp = num1 * num2;
		} else if(simbolo == vacio) {
			return null; 
		}else {
			resp = 0;
		}
		return resp;
	}
}
