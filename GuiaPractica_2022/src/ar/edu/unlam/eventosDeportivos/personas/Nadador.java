package ar.edu.unlam.eventosDeportivos.personas;

import ar.edu.unlam.eventosDeportivos.enums.EstiloNatacion;
import ar.edu.unlam.eventosDeportivos.interfaces.Nadar;

public class Nadador extends Socio implements Nadar{

	


	private EstiloNatacion estiloNadoPreferido;

	public Nadador(Integer socioNumero, String nombre, EstiloNatacion estiloNadoPreferido) {
		super(socioNumero, nombre);
		this.setEstiloNadoPreferido(estiloNadoPreferido);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the estiloNadoPreferido
	 */
	public EstiloNatacion getEstiloNadoPreferido() {
		return estiloNadoPreferido;
	}

	/**
	 * @param estiloNadoPreferido the estiloNadoPreferido to set
	 */
	public void setEstiloNadoPreferido(EstiloNatacion estiloNadoPreferido) {
		this.estiloNadoPreferido = estiloNadoPreferido;
	}

}
