package ar.edu.unlam.eventosDeportivos.personas;

import ar.edu.unlam.eventosDeportivos.enums.EstiloBicy;
import ar.edu.unlam.eventosDeportivos.interfaces.AndarEnBicy;

public class Ciclista extends Socio implements AndarEnBicy {

	private EstiloBicy estiloBicy;

	public Ciclista(Integer socioNumero, String nombre, EstiloBicy estiloBicy) {
		super(socioNumero, nombre);
		this.setEstiloBicy(estiloBicy);
	}

	/**
	 * @return the estiloBicy
	 */
	public EstiloBicy getEstiloBicy() {
		return estiloBicy;
	}

	/**
	 * @param estiloBicy the estiloBicy to set
	 */
	public void setEstiloBicy(EstiloBicy estiloBicy) {
		this.estiloBicy = estiloBicy;
	}

}
