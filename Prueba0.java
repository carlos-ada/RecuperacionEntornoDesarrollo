package Pruebas;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


class Prueba0 {

	static Funciones prueba = null;
	static int pruebasRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
	    System.out.println("Preparando las Pruebas...");
	    prueba = new Funciones();
	}

	@BeforeEach
	private void preparaPruebaEjecutar() {
	    pruebasRealizadas++;
	    System.out.println("\nEjecutando prueba " + pruebasRealizadas);
	}

	@AfterEach
	private void terminadaPrueba() {
	    System.out.println("Prueba " + pruebasRealizadas + " ejecutado con exito");
	}

	@AfterAll
	static void terminarPruebas() {
	    System.out.println("\nSe ha terminado de ejecutar todas las pruebas");
	    prueba = null;
	}
}
