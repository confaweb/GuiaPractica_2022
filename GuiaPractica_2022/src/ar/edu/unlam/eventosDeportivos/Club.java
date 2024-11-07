package ar.edu.unlam.eventosDeportivos;

import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.eventosDeportivos.personas.Socio;

public class Club {

	private String nombre;
	Set<Socio> listadoSocios;

	public Club(String nombre) {
		this.setNombre(nombre);
		this.listadoSocios = new TreeSet<Socio>();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the listadoSocios
	 */
	public Set<Socio> getListadoSocios() {
		return listadoSocios;
	}

	/**
	 * @param listadoSocios the listadoSocios to set
	 */
	public void setListadoSocios(Set<Socio> listadoSocios) {
		this.listadoSocios = listadoSocios;
	}

	public Boolean agregarSocio(Socio socio) {
		Boolean socioAgregado = listadoSocios.add(socio);
		return socioAgregado;

	}

}
