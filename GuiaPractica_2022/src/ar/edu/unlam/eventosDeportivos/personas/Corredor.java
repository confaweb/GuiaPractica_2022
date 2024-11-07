package ar.edu.unlam.eventosDeportivos.personas;

import ar.edu.unlam.eventosDeportivos.enums.Distancia;
import ar.edu.unlam.eventosDeportivos.interfaces.Correr;

public class Corredor extends Socio implements Correr{
private Distancia distanciaPreferida;

public Corredor(Integer socioNumero, String nombre, Distancia distanciaPreferida) {
		super(socioNumero, nombre);
		this.setDistanciaPreferida(distanciaPreferida);
	}

/**
 * @return the distanciaPreferida
 */
public Distancia getDistanciaPreferida() {
	return distanciaPreferida;
}

/**
 * @param distanciaPreferida the distanciaPreferida to set
 */
public void setDistanciaPreferida(Distancia distanciaPreferida) {
	this.distanciaPreferida = distanciaPreferida;
}



}
