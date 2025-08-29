package ar.edu.unlam.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MontaCargaTest {
	
	@Test
	public void dadoQueExisteUnMontaCargasQueNoAceptaCargasDuplicadasCuandoAgregoUnaCargaDuplicadaObtengoUnResultadoFalso() {
		MontaCarga montaCarga = new MontaCarga(1000.0);
		Carga carga = new Carga(1L,100.0);
		//Carga carga2 = new Carga(1L,100.0);
		Carga carga3= new Carga(2L,200.0);
		
		boolean cargaAgregada = montaCarga.agregarCarga(carga);
		boolean SegundaCargaAgregada = montaCarga.agregarCarga(carga3);
		
		assertTrue(cargaAgregada);
		
		
	}
	
	@Test
	public void test() {
		Carga carga = new Carga(1L,100.0);
		
		Integer hashCarga = carga.hashCode();
		
		Carga carga2 = new Carga(1L,100.0);
		
		Integer hashCarga2 = carga2.hashCode();
		
		//assertEquals(carga,carga2);
		
		assertTrue(hashCarga.equals(hashCarga2));
	
	}
	
	@Test
	public void pruebaEquals() {
		Carga carga = new Carga(1L,100.0);
		Carga carga2 = new Carga(1L,100.0);
		
		//assertEquals(carga,carga2);
		
		assertTrue(carga.equals(carga2));
	}
	
	@Test
	public void dadoQueNoexisteUnaCargaAlCrearLaMismaSePuedeObtenerSuPeso() {
		
		Double peso = 100.0;
		Carga carga = new Carga(peso);
		
		Double pesoEsperado= 100.0;
		Double pesoObtenido = carga.getPeso();
		
		assertEquals(pesoEsperado,pesoObtenido);
	}
	@Test
	public void dadoQueExisteUnMontaCargaVerificarSiSePuedeSubirCarga() {
		Carga carga = new Carga(100.0);
		MontaCarga montaCarga = new MontaCarga(1000.0);
		
		montaCarga.cargar(carga);
		
		Integer cargaEsperada = 1;
		Integer cargaObtenida = montaCarga.obtenerCantidadDeCargas();
		
		assertEquals(cargaEsperada,cargaObtenida);
	}
	@Test
	public void dadoQueExisteUnMontaCargaYUnaCargaCuandoSuboLaCargaAlMismoVerificarElPesoCargado() {
		Carga carga = new Carga(100.0);
		Carga carga2 = new Carga(200.0);
		MontaCarga montaCarga = new MontaCarga(1000.0);
		
		montaCarga.cargar(carga);
		montaCarga.cargar(carga2);
		
		Double valorEsperado = 300.0;
		Double valorObtenido = montaCarga.obtenerPesoCargado();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void dadoQueExisteUnMontaCargaConVariasCargasAlVaciarloObtengoComoResultadoIgualACero() {
		Carga carga = new Carga(100.0);
		Carga carga2 = new Carga(200.0);
		MontaCarga montaCarga = new MontaCarga(1000.0);
		
		montaCarga.cargar(carga);
		montaCarga.cargar(carga2);
		
		montaCarga.borrarCargas();
		
		Integer valorEsperado = 0;
		Integer valorObtenido = montaCarga.obtenerCantidadDeCargas();
		
		assertEquals(valorEsperado,valorObtenido);
		
		Double valorEsperado2 = 0.0;
		Double valorObtenido2 = montaCarga.obtenerPesoCargado();
		
		assertEquals(valorEsperado2,valorObtenido2);
	}
	
	
}
