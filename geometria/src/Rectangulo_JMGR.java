
/**
 * Esta clase se encuentra los metodos para crear un rectangulo
 * @author Johan Manuel Gonzalez Rodriguez
 * @version 1.2
 */
public class Rectangulo_JMGR extends FiguraGeometrica_JMGR{
	private double l1;
	private double l2;
	
	
	
	/** Constructor de la clase
	 * @param tipoFigura String 
	 * @param lG double
	 * @param lP double
	 */
	public Rectangulo_JMGR(String tipoFigura, double lG, double lP) {		
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
	
	/**
	 * Metodo que sobreescribe el calculo de un area
	 * @return double devuelve el valor del area
	 */

	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Metodo que sobreescribe el calculo del perimetro
	 * @return double devuelve el valor del perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
