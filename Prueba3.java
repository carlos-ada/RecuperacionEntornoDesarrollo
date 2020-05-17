package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Prueba3 extends Prueba0{
	
	/**
	 * CAJA NEGRA
	 */
	
	@DisplayName(value = "Con valor limite superior")
	@Test
	//En esta prueba pongo mi edad que es 20 y varios numeros que estan en el rango entre 20 y 10 y los sumamos y nos daria 74
	void test1funcion3() {
		assertEquals(74, Funciones.funcion3(new int[] {20,19,18,17}));
	}
		
	@DisplayName(value = "Con valor limite superior +1")
	@Test
	//En esta prueba pongo mi edad que es 20 y varios numeros que estan por encima de 20, nos devolveria mi edad
	void test2funcion3() {
		assertEquals(20, Funciones.funcion3(new int[] {20,21,22,23}));
	}
	@DisplayName(value = "Con valor limite inferior")
	@Test
	//En esta prueba pongo 10 que es el limite de la mitad de mi edad al estar dentro del rango se haria la suma que da 46
	void test3funcion3() {
		assertEquals(46, Funciones.funcion3(new int[] {10,11,12,13}));
	}
	
	@DisplayName(value = "Con valor Aleatorio")
	@Test
	//En esta prueba al solo poner ceros pues nos devolvera 0
	void test4funcion3() {
		assertEquals(0, Funciones.funcion3(new int[] {0,0,0,0}));
	}
	
	@DisplayName(value = "Con valor nulo")
	@Test
	//Al ser nula la lista de numeros que le damos nos devuelve null
	void test5funcion3() {
		assertEquals(null, Funciones.funcion3(null));
	}
	
	/**
	 * CAJA BLANCA
	 */	
	
	@DisplayName(value = "Con cobertura de condicion")
	@Test
	//En esta prueba la condicion es que el unico numero que entra en el rango de mi edad sea solo 12
	void test6funcion3() {
		assertEquals(12, Funciones.funcion3(new int[] {2,9,21,12,99}));
	}
	
	@DisplayName(value = "Con cobertura de condicion 2")
	@Test
	//En esta prueba la condicion es que los unicos numeros que entran en el rango son 12 y 15 entonces se suma y da un valor de 27
	void test7funcion3() {
		assertEquals(27, Funciones.funcion3(new int[] {1,9,12,15,21}));
	}
	
	@DisplayName(value = "Con cobertura de condicion 3")
	@Test
	//En esta prueba la condicion es poner numeros negativos los cuales no estan dentro del rango de mi edad, por lo tanto da 0
	void test8funcion3() {
		assertEquals(0, Funciones.funcion3(new int[] {-1,-99,-20,-10,-34}));
	}

	@DisplayName(value = "Con cobertura de decisiones")
	@Test
	//En esta prueba vamos a poner valores que estan por encima de 20 y debajo de 10
	void test9funcion3() {
		assertEquals(0, Funciones.funcion3(new int[] {21,9,40,8,7}));
	}
}
