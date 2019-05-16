import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class dniTest {

	private dni usuario01;
	private dni usuario02;

	@Before
	public void before() {

		usuario01 = dni.getUsuario01();
		usuario02 = dni.getUsuario02();
	}
	
	
	@Test
	public void checkFormatoDni() {
		
		Assert.assertEquals(dni.validarDni(usuario01.getDni()), true);
	}
	
	@Test
	public void checkFormatoDniFalse() {
		
		usuario02.setDni("0000002000T");
		
		Assert.assertEquals(dni.validarDni(usuario02.getDni()), false);
	}
	
	@Test
	public void checkLetraControl() {
		
		Assert.assertEquals(dni.generarLetra(usuario01.getDni()), "G");
	}
	
	@Test
	public void checkLetraControlFalse() {
		
		usuario02.setDni("00002000T");
		
		Assert.assertEquals(dni.generarLetra(usuario02.getDni()), "T");
	}

}
