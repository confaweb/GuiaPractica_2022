package ar.edu.unlam.eventosDeportivos.personas;

import java.util.Comparator;

public class OrdenarSocioPorNombre implements Comparator<Socio> {

	@Override
	public int compare(Socio o1, Socio o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
