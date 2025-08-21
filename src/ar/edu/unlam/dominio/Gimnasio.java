package ar.edu.unlam.dominio;

public class Gimnasio {
	private String nombre;

	public Gimnasio() {
	}
	
	public Gimnasio(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return this.nombre;
	}


	public String setNombre(String string) {
		this.nombre = string;
		return this.nombre;
	}

	public Integer getCapacidad() {
		// TODO Auto-generated method stub
		return 50;
	}
}
