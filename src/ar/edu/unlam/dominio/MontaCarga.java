package ar.edu.unlam.dominio;

import java.util.ArrayList;
import java.util.HashSet;

public class MontaCarga {

	private Double pesoMaximoPermitido;
	
	private ArrayList<Carga> cargas = new ArrayList<>();

	private HashSet <Carga> cargasSinDuplicados;
	
	public MontaCarga(Double pesoMaximoPermitido) {
		this.pesoMaximoPermitido=pesoMaximoPermitido;
		this.cargasSinDuplicados= new HashSet<>();
	}
	
	public void cargar(Carga carga) {
		this.cargas.add(carga);
	}
	public Integer obtenerCantidadDeCargas() {
		return this.cargas.size();
	}
	public Double obtenerPesoCargado() {
		
		Double sumaTotal = 0.0;
		
		for (Carga carga : cargas) {
			sumaTotal+= carga.getPeso();
		}
		
		return sumaTotal;
	}

	public void borrarCargas() {
		this.cargas.clear();
		
	}

	public boolean agregarCarga(Carga carga) {
		// TODO Auto-generated method stub
		boolean agregado = this.cargasSinDuplicados.add(carga);
		
		return agregado;
	}
}
