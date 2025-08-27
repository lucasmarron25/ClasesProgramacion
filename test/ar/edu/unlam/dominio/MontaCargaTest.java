package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MontaCargaTest {

	
	@Test
	public void dadoQueNoexisteUnaCargaAlCrearLaMismaSePuedeObtenerSuPeso() {
		
		Double peso = 100.0;
		Carga carga = new Carga(peso);
		
		Double pesoEsperado= 100.0;
		Double pesoObtenido = carga.getPeso();
		
		assertEquals(pesoEsperado,pesoObtenido);
	}

	
}
