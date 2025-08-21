package ar.edu.unlam.dominio;


	import static org.junit.Assert.assertEquals;

	import org.junit.Before;
	import org.junit.Test;

	public class GimnasioTest {

		private Gimnasio gimnasioEclipse;
		
		@Before
		public void inicializacion(){
			gimnasioEclipse = new Gimnasio();
		}
		
	@Test	
	public void dadoQueExisteUnGimnasioConNombreCuandoConsultoSuNombreObtengoEclipseGym() {
		
		// preparacion:
		//Gimnasio gimnasioEclipse = new Gimnasio();
		String nombreDelGimnasioEsperado = gimnasioEclipse.setNombre("Eclipse Gym");
		
		// ejecucion:
		String nombreDelGimnasioObtenido= gimnasioEclipse.getNombre();
		
		// verificacion:
		
		assertEquals(nombreDelGimnasioEsperado, nombreDelGimnasioObtenido);
	}
	@Test	
	public void dadoQueExisteUnGimnasioConNombreYCapacidadCuandoConsultoSuCapacidadObtengo50() {
		
		// preparacion:
		//Gimnasio gimnasioEclipse = new Gimnasio();
		
		
		// ejecucion:
		Integer nombreDelGimnasioObtenido= gimnasioEclipse.getCapacidad();
		
		// verificacion:
		Integer nombreDelGimnasioEsperado = 50;
		assertEquals(nombreDelGimnasioEsperado, nombreDelGimnasioObtenido);
	}

	@Test	
	public void dadoQueExisteUnGimnasioCuandoInstancioUnObjetoUsandoElContructorConSuNombreYConsultoElNombreObtengoEclipseGym() {
		
		// preparacion:
		Gimnasio gimnasioEclipse = new Gimnasio("Eclipse Gym2");
		//String nombreDelGimnasioEsperado = gimnasioEclipse.setNombre("Eclipse Gym");
		
		// ejecucion:
		String nombreDelGimnasioObtenido= gimnasioEclipse.getNombre();
		
		// verificacion:
		
		String nombreDelGimnasioEsperado = "Eclipse Gym2";
		assertEquals(nombreDelGimnasioEsperado, nombreDelGimnasioObtenido);
	}
}
