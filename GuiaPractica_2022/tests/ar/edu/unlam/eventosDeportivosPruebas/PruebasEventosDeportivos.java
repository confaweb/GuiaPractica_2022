package ar.edu.unlam.eventosDeportivosPruebas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import ar.edu.unlam.eventosDeportivos.Club;
import ar.edu.unlam.eventosDeportivos.enums.DisciplinaPreferida;
import ar.edu.unlam.eventosDeportivos.enums.Distancia;
import ar.edu.unlam.eventosDeportivos.enums.EstiloBicy;
import ar.edu.unlam.eventosDeportivos.enums.EstiloNatacion;
import ar.edu.unlam.eventosDeportivos.personas.Ciclista;
import ar.edu.unlam.eventosDeportivos.personas.Corredor;
import ar.edu.unlam.eventosDeportivos.personas.Nadador;
import ar.edu.unlam.eventosDeportivos.personas.OrdenarSocioPorNombre;
import ar.edu.unlam.eventosDeportivos.personas.Socio;
import ar.edu.unlam.eventosDeportivos.personas.TriAtleta;

public class PruebasEventosDeportivos {
	List <Socio>listaSocios;

	@Test //#1
	public void queSePuedaCrearUnNadaddor() {
		//ENTRADA
		Nadador nuevo;
		Integer socioNumero=1001;
		String nombre="Julian";
		EstiloNatacion estilonadoPreferido=EstiloNatacion.CROLL;
		//PREPARACION
		nuevo = new Nadador(socioNumero,nombre,estilonadoPreferido);
		//VALIDACION
		assertEquals(EstiloNatacion.CROLL,nuevo.getEstiloNadoPreferido());
		assertEquals(socioNumero,nuevo.getSocioNumero());
	}
	@Test //#2
	public void queSePuedaCrearUnCorredor() {
		//ENTRADA
		Corredor nuevo;
		Integer socioNumero=1002;
		String nombre="Roman";
		Distancia distanciaPreferida=Distancia.CINCO_KM;
		//PREPARACION
		nuevo = new Corredor(socioNumero,nombre,distanciaPreferida);
		//VALIDACION
		assertEquals(Distancia.CINCO_KM,nuevo.getDistanciaPreferida());
		assertEquals(socioNumero,nuevo.getSocioNumero());
	}
	@Test //#3
	public void queSePuedaCrearUnCiclista() {
		//ENTRADA
		Ciclista nuevo;
		Integer socioNumero=1003;
		String nombre="Maria";
		EstiloBicy estiloBicy=EstiloBicy.MONTAIN;
		//PREPARACION
		nuevo = new Ciclista(socioNumero,nombre,estiloBicy);
		//VALIDACION
		assertEquals(socioNumero,nuevo.getSocioNumero());
		assertEquals(EstiloBicy.MONTAIN,nuevo.getEstiloBicy());
	}
	@Test //#4
	public void queSePuedaCrearUnTriAtleta() {
		//ENTRADA
		TriAtleta nuevo;
		Integer socioNumero=1004;
		String nombre="Juliana";
		DisciplinaPreferida disciplina=DisciplinaPreferida.DUATLON;
		//PREPARACION
		nuevo = new TriAtleta(socioNumero,nombre,disciplina);
		//VALIDACION
		assertEquals(DisciplinaPreferida.DUATLON,nuevo.getDisciplinaPreferida());
		assertEquals(socioNumero,nuevo.getSocioNumero());
	}
	@Test //#5
	public void queSePuedaCrearUnListadoSocioos() {
		//ENTRADA
		TriAtleta tri1,tri2;
		Ciclista ciclista1,ciclista2;
		Corredor corredor1,corredor2;
		Nadador nadador1,nadador2;
		Club chicago;
		
		Integer socioNumeroTri1=1004,socioNumeroTri2=1005,socioNumeroCicl1=1006,socioNumeroCicl2=1007,
				socioNumeroCorredor1=1008,socioNumeroCorredor2=1009,socioNumeroNadador1=1010,socioNumeroNadador2=1011;
		String nombreTri1="Juliana",nombreTri2="Sebastian",nombreCicl1="Facundo",nombreCicl2="Rosa",
				nombreCorredo1="Sandra",nombreCorredor2="Franco",nombreNadador1="Carla",nombreNadador2="Raul",
				nombreClub="CANCH";
		DisciplinaPreferida disciplinaTri1=DisciplinaPreferida.DUATLON;
		EstiloBicy estiloBicy=EstiloBicy.MONTAIN;
		Distancia distanciaPreferida=Distancia.CINCO_KM;
		EstiloNatacion estilonadoPreferido=EstiloNatacion.CROLL;
		

		
		//PREPARACION
		tri1 = new TriAtleta(socioNumeroTri1,nombreTri1,disciplinaTri1);
		tri2 = new TriAtleta(socioNumeroTri1,nombreTri1,disciplinaTri1);
		ciclista1 = new Ciclista(socioNumeroCicl1,nombreCicl1,estiloBicy);
		ciclista2 = new Ciclista(socioNumeroCicl2,nombreCicl2,estiloBicy);
		corredor1 = new Corredor(socioNumeroCorredor1,nombreCorredo1,distanciaPreferida);
		corredor2 = new Corredor(socioNumeroCorredor2,nombreCorredor2,distanciaPreferida);
		nadador1 = new Nadador(socioNumeroNadador1,nombreNadador1,estilonadoPreferido);
		nadador2 = new Nadador(socioNumeroNadador2,nombreNadador2,estilonadoPreferido);
		chicago =new Club(nombreClub);
		
		chicago.agregarSocio(tri1);
		chicago.agregarSocio(tri2);
		chicago.agregarSocio(ciclista1);
		chicago.agregarSocio(ciclista2);
		chicago.agregarSocio(corredor1);
		chicago.agregarSocio(corredor2);
		chicago.agregarSocio(nadador1);
		chicago.agregarSocio(nadador2);		
		
		//VALIDACION
		assertEquals(7,chicago.getListadoSocios().size());
		
	}
	@Test //#6
	public void queSePuedaVerificarUnListadoSociosOrdenadosPorSuOrdenNaturalNumeroDeSocio() {
		//ENTRADA
		TriAtleta tri1,tri2;
		Ciclista ciclista1,ciclista2;
		Corredor corredor1,corredor2;
		Nadador nadador1,nadador2;
		Club chicago;
		
		Integer socioNumeroTri1=1004,socioNumeroTri2=1005,socioNumeroCicl1=1006,socioNumeroCicl2=1007,
				socioNumeroCorredor1=1008,socioNumeroCorredor2=1009,socioNumeroNadador1=1010,socioNumeroNadador2=1011;
		String nombreTri1="Juliana",nombreTri2="Sebastian",nombreCicl1="Facundo",nombreCicl2="Rosa",
				nombreCorredo1="Sandra",nombreCorredor2="Franco",nombreNadador1="Carla",nombreNadador2="Raul",
				nombreClub="CANCH";
		DisciplinaPreferida disciplinaTri1=DisciplinaPreferida.DUATLON;
		EstiloBicy estiloBicy=EstiloBicy.MONTAIN;
		Distancia distanciaPreferida=Distancia.CINCO_KM;
		EstiloNatacion estilonadoPreferido=EstiloNatacion.CROLL;
		
		//PREPARACION
		tri1 = new TriAtleta(socioNumeroTri1,nombreTri1,disciplinaTri1);
		tri2 = new TriAtleta(socioNumeroTri2,nombreTri2,disciplinaTri1);
		ciclista1 = new Ciclista(socioNumeroCicl1,nombreCicl1,estiloBicy);
		ciclista2 = new Ciclista(socioNumeroCicl2,nombreCicl2,estiloBicy);
		corredor1 = new Corredor(socioNumeroCorredor1,nombreCorredo1,distanciaPreferida);
		corredor2 = new Corredor(socioNumeroCorredor2,nombreCorredor2,distanciaPreferida);
		nadador1 = new Nadador(socioNumeroNadador1,nombreNadador1,estilonadoPreferido);
		nadador2 = new Nadador(socioNumeroNadador2,nombreNadador2,estilonadoPreferido);
		chicago =new Club(nombreClub);
		listaSocios=new ArrayList <Socio>();
		chicago.agregarSocio(tri1);
		chicago.agregarSocio(tri2);
		chicago.agregarSocio(ciclista1);
		chicago.agregarSocio(ciclista2);
		chicago.agregarSocio(corredor1);
		chicago.agregarSocio(corredor2);
		chicago.agregarSocio(nadador1);
		chicago.agregarSocio(nadador2);
		
		cambiarSetAList(chicago.getListadoSocios());
		
		//VALIDACION
		assertEquals(tri1,listaSocios.get(0));
		assertEquals(corredor1,listaSocios.get(4));
		assertEquals(nadador2,listaSocios.get(7));
		
	}
	private void cambiarSetAList(Set<Socio> listadoSocios) {
		listaSocios.addAll(listadoSocios);
		
	}
	@Test //#6
	public void queSePuedaVerificarUnListadoSociosOrdenadosPorNombreDeSocio() {
		//ENTRADA
		TriAtleta tri1,tri2;
		Ciclista ciclista1,ciclista2;
		Corredor corredor1,corredor2;
		Nadador nadador1,nadador2;
		Club chicago;
		
		Integer socioNumeroTri1=1004,socioNumeroTri2=1005,socioNumeroCicl1=1006,socioNumeroCicl2=1007,
				socioNumeroCorredor1=1008,socioNumeroCorredor2=1009,socioNumeroNadador1=1010,socioNumeroNadador2=1011;
		String nombreTri1="Juliana",nombreTri2="Sebastian",nombreCicl1="Facundo",nombreCicl2="Rosa",
				nombreCorredo1="Sandra",nombreCorredor2="Franco",nombreNadador1="Carla",nombreNadador2="Raul",
				nombreClub="CANCH";
		DisciplinaPreferida disciplinaTri1=DisciplinaPreferida.DUATLON;
		EstiloBicy estiloBicy=EstiloBicy.MONTAIN;
		Distancia distanciaPreferida=Distancia.CINCO_KM;
		EstiloNatacion estilonadoPreferido=EstiloNatacion.CROLL;
		Set <Socio> ordenadoPorNombre;
		//PREPARACION
		tri1 = new TriAtleta(socioNumeroTri1,nombreTri1,disciplinaTri1);
		tri2 = new TriAtleta(socioNumeroTri2,nombreTri2,disciplinaTri1);
		ciclista1 = new Ciclista(socioNumeroCicl1,nombreCicl1,estiloBicy);
		ciclista2 = new Ciclista(socioNumeroCicl2,nombreCicl2,estiloBicy);
		corredor1 = new Corredor(socioNumeroCorredor1,nombreCorredo1,distanciaPreferida);
		corredor2 = new Corredor(socioNumeroCorredor2,nombreCorredor2,distanciaPreferida);
		nadador1 = new Nadador(socioNumeroNadador1,nombreNadador1,estilonadoPreferido);
		nadador2 = new Nadador(socioNumeroNadador2,nombreNadador2,estilonadoPreferido);
		chicago =new Club(nombreClub);
		listaSocios=new ArrayList <Socio>();
		ordenadoPorNombre=new TreeSet<>(new OrdenarSocioPorNombre());
														//Alfabeticamente ordenados
		chicago.agregarSocio(tri1);//"Juliana"	 		| "Carla"
		chicago.agregarSocio(tri2);//"Sebastian"		| "Facundo"
		chicago.agregarSocio(ciclista1);//"Facundo"		| "Franco"
		chicago.agregarSocio(ciclista2);//"Rosa"		| "Juliana"
		chicago.agregarSocio(corredor1);//"Sandra"		| "Raul"
		chicago.agregarSocio(corredor2);//"Franco"		| "Rosa"
		chicago.agregarSocio(nadador1);//"Carla"		| "Sandra"
		chicago.agregarSocio(nadador2);//"Raul"			| "Sebastian"
		
		ordenadoPorNombre.addAll(chicago.getListadoSocios());
		cambiarSetAList(ordenadoPorNombre);
		
		//VALIDACION
		assertEquals(nadador1,listaSocios.get(0));
		assertEquals(nadador2,listaSocios.get(4));
		assertEquals(tri2,listaSocios.get(7));
		
	}


}
