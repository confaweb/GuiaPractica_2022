package ar.edu.unlam.eventosDeportivos.personas;

import ar.edu.unlam.eventosDeportivos.enums.DisciplinaPreferida;
import ar.edu.unlam.eventosDeportivos.interfaces.AndarEnBicy;
import ar.edu.unlam.eventosDeportivos.interfaces.Correr;
import ar.edu.unlam.eventosDeportivos.interfaces.Nadar;

public class TriAtleta extends Socio implements Nadar, Correr, AndarEnBicy {

	private DisciplinaPreferida disciplinaPreferida;

	public TriAtleta(Integer socioNumero, String nombre, DisciplinaPreferida disciplinaPreferida) {
		super(socioNumero, nombre);
		this.disciplinaPreferida = disciplinaPreferida;

	}

	/**
	 * @return the disciplinaPreferida
	 */
	public DisciplinaPreferida getDisciplinaPreferida() {
		return disciplinaPreferida;
	}

	/**
	 * @param disciplinaPreferida the disciplinaPreferida to set
	 */
	public void setDisciplinaPreferida(DisciplinaPreferida disciplinaPreferida) {
		this.disciplinaPreferida = disciplinaPreferida;

	}
}
