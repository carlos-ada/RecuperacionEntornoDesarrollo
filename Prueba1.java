package Pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Prueba1 extends Prueba0{

	/**
	 * CAJA NEGRA
	 */

	@DisplayName(value = "Con Valor Vacio")
	@Test
	//En esta prueba si no ponemos ningun caracter nos devolveria false
	void test1funcion1() {
		assertEquals(null, Funciones.funcion1(""));
	}

	@DisplayName(value = "Con Limite inferior")
	@Test
	void test2funcion1() { //Esta prueba consiste en poner una oracion que llegue al numero de vocales segun mi edad que es 20.
		assertEquals(true, Funciones.funcion1("Me llamo Carlos y quiero aprobar todo porfavor, gracias"));
	}

	@DisplayName(value = "Con Limite inferior -1")
	@Test
	void test3funcion1() {//Esta prueba consiste en poner una oracion que llege a un numero menos de vocal segun mi edad que es 20, osea que llegue a 19.
		assertEquals(false, Funciones.funcion1("Me llamo Carlos Villar y quiero aprobar todo porfavor"));
	}

	@DisplayName(value = "Con Equivalentes de grupo positivo")
	@Test
	//Esta prueba seria de grupo positivo ya que supera en el total de vocales a mi edad.
	void test4funcion1() {
		assertEquals(true, Funciones.funcion1("Hola que tal me llamo Carlos Manuel Villar Méndez y soy de Sevilla Este y estudio en ADA ITS"));
	}



	/**
	 * CAJA BLANCA
	 */

	@DisplayName(value = "Con Cobertura de condiciones TRUE")
	@Test
	//En esta prueba la condicion sera que el valor de mi edad que son 20, sea igual al numero de vocales
	void test5funcion1() {
		assertEquals(true, Funciones.funcion1("Soy Carlos Manuel, vivo en sevilla este y soy del Real Betis "));
	}

	@DisplayName(value = "Con Cobertura de condiciones FALSE")
	@Test
	//En esta prueba la condicion sera que el valor de mi edad que son 20, sea mayor al numero de vocales que hay en la frase
	void test6funcion1() {
		assertEquals(false, Funciones.funcion1("Juego de tronos es la ostia"));
	}

	@DisplayName(value = "Con Cobertura de decisiones TRUE")
	@Test
	//Esta prueba consiste en que la condicion del valor de mi edad que son 20 sea true, para eso las vocales tienen que superar mi edad
	void test7funcion1() {
		assertEquals(true, Funciones.funcion1("Que todo esto de la cuarentena termine ya para poder volver a clase, porque esto de la teleclases no me gustan nada"));
	}

	@DisplayName(value = "Con Cobertura de decisiones FALSE")
	@Test
	//Esta prueba consiste en que la condicion del valor de mi edad que son 20 sea false, para eso las vocales no pueden que superar mi edad
	void test8funcion1() {
		assertEquals(false, Funciones.funcion1("Que todo esto de la cuarentena termine ya"));
	}

}