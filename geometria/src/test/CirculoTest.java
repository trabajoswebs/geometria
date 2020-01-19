
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class CirculoTest {
	
	private Circulo_JMGR cr1, cr2, cr3;
	
	@Before
	public void inicioPruebas() {
		cr1 = new Circulo_JMGR(7, "circulo");
		cr2 = new Circulo_JMGR(0, "circulo");
		cr3 = new Circulo_JMGR(-3, "circulo");
	}
	
	@After
	public void finPrueba() {
		cr1 = null;
		cr2 = null;
		cr3 = null;
	}

	@Test
	public void testArea1() {
		double are1 = cr1.area();
		assertEquals(153.9384, are1, 1.0);
	}
	
	@Test
	public void testArea2() {		
		double are2 = cr2.area();	
		assertEquals(0.00, are2, 1.0);	
	}
	
	@Test
	public void testArea3() {		
		double are3 = cr3.area();		
		assertEquals(28.2744, are3, 1.0);
	}

	@Test
	public void testPerimetro1() {
		double per1 = cr1.perimetro();		
		assertEquals(43.9824, per1, 1.0);		
	}
	
	@Test
	public void testPerimetro2() {		
		double per2 = cr2.perimetro();		
		assertEquals(0.00, per2, 1.0);	
	}
	
	@Test
	public void testPerimetro3() {		
		double per3 = cr3.perimetro();		
		assertEquals(18.8496, per3, 1.0);
	}

}
