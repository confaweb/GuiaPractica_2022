package ar.edu.unlam.eventosDeportivos.personas;

import java.util.Objects;

public abstract class Socio implements Comparable <Socio>{
	private Integer socioNumero;
	private String nombre;

	public Socio(Integer socioNumero, String nombre) {
		this.socioNumero=socioNumero;
		this.nombre=nombre;
	}

	/**
	 * @return the socioNumero
	 */
	public Integer getSocioNumero() {
		return socioNumero;
	}

	/**
	 * @param socioNumero the socioNumero to set
	 */
	public void setSocioNumero(Integer socioNumero) {
		this.socioNumero = socioNumero;
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

	@Override
	public int hashCode() {
		return Objects.hash(socioNumero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		return Objects.equals(socioNumero, other.socioNumero);
	}

	@Override
	public int compareTo(Socio socio) {
		// TODO Auto-generated method stub
		return this.getSocioNumero().compareTo(socio.getSocioNumero()) ;
	}
}
