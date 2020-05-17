package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Prueba4 extends Prueba0{
	
	/**
	 * CAJA NEGRA
	 */
	
	@DisplayName(value = "Con valor limite inferior (Suficiente)")
	@Test
	//En esta prueba nos devuelve Suficiente porque la media de 6 cincos es 5 que seria Suficente
	void test1funcion4() {
		assertEquals("Suficiente", Funciones.funcion4(new int[] {5,5,5,5,5,5}));
	}
	
	@DisplayName(value = "Con valor limite inferior -1 (Insuficiente)")
	@Test
	//En esta prueba nos devuelve Insuficiente porque inferior -1 en Insuficiente seria 4 entonces la media de 6 cuatros es 4 que seria Insuficiente
	void test2funcion4() {
		assertEquals("Insuficiente", Funciones.funcion4(new int[] {4,4,4,4,4,4}));
	}
	
	@DisplayName(value = "Con valor limite superior (Notable)")
	@Test
	//En esta prueba nos devuelve Notable porque la media de 6 sietes es 7 que seria Notable
	void test3funcion4() {
		assertEquals("Notable", Funciones.funcion4(new int[] {7,7,7,7,7,7}));
	}
	
	
	@DisplayName(value = "Con valor limite superior +1 (Sobresaliente)")
	@Test
	//En esta prueba nos devuelve Sobresaliente porque superior +1 en Sobresaliente seria 10 entonces la media de 6 dieces es 10 que seria Sobresaliente
	void test4funcion4() {
		assertEquals("Sobresaliente", Funciones.funcion4(new int[] {10,10,10,10,10,10}));
	}
	
	@DisplayName(value = "Con valor nulo")
	@Test
	void test5funcion4() {
		assertEquals(null, Funciones.funcion4(null));
	}
	
	
	/**
	 * CAJA BLANCA
	 */
	
	@DisplayName(value = "Con de cobertura de decision")
	@Test
	//En esta prueba hacemos la decision de hacer la media de las notas del 2º trimestre en el que nos deberia salir de media un Bien
	void test6funcion4() {
		assertEquals("Bien", Funciones.funcion4(new int[] {9,9,5,4,3}));
	}
	
	@DisplayName(value = "Con de cobertura de decision 2")
	@Test
	//En esta prueba hacemos la decision de hacer la media de las notas del 2º trimestre en el que en algunos he bajado nota pero otras he subido, deberia dar una media de Notable
	void test7funcion4() {
		assertEquals("Notable", Funciones.funcion4(new int[] {7,7,3,8,8,9}));
	}
	
	@DisplayName(value = "Con de cobertura de decision 3")
	@Test
	//En esta prueba hacemos la  decision de hacer la media de las notas del 2º trimestre en el que practicamente todo estaria suspenso, deberia devolver Insuficiente
	void test8funcion4() {
		assertEquals("Insuficiente", Funciones.funcion4(new int[] {3,3,6,3,5,1}));
	}
	
	@DisplayName(value = "Con de cobertura de decision 4")
	@Test
	//En esta prueba hacemos la decision de hacer la media de las notas en negativo, pero como no existe una nota negativa nos devuelve null
	void test9funcion4() {
		assertEquals(null, Funciones.funcion4(new int[] {-8,-5,-5,-7,-3,-2}));
	}

}
