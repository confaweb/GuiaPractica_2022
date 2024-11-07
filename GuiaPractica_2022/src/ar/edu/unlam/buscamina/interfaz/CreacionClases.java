package ar.edu.unlam.buscamina.interfaz;
/*
 1.	Buscaminas
El buscaminas es un famoso juego que nos permite desafiar nuestro azar e ingenio.
El objetivo del juego es descubrir todos los CASILLEROS que no contengan una mina.
Para esto, a medida que vamos descubriendo cada casillero, el juego nos brinda información acerca de la cantidad de minas que rodean un casillero determinado.
Se propone desarrollar la solución que nos permita imitar el funcionamiento de este juego.

*/
/*
 --Tablerlo con casilleros(matriz)
 -- Cada casillero puede contener : 
 		a) una mina
 		b)numero de minas linderas al casillero
 		c) vacio
 -- Caracteristicasx del tablero:
 			-Tamanio 
 			-Cantidad de minas acorde al tamanio
 			-Estado : descubierto-tapado
 			
 +++++TESTS++++++++++++
 
 -Crear clase tablero
 -Crear enum 'TamanioTablero'
 -Crear enums 'EstadoCasillero'
 
 -definirTamanio
 -Crear tablero con minas aleatorias y estado casillero :'Tapado'
 -Asignar numero en casillero
 -ComenzarJuego
 -DescubrirCasillero
 -MostrarTablero
 -DescubrirCasillero
 -GameOver si DescubrirCasillero contiene una mina 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CreacionClases {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
