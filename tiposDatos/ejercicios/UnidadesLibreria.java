public class UnidadesLibreria {
	
	//constantes
	static final double LIBRAS_A_KILOGRAMO = 0.453592;
	static final double PIES_A_METROS      = 0.3048;
	static final double YARDA_A_METROS     = 0.9144;
	static final double MILLAS_A_METROS    = 1609.34;
	static final double ACRES_A_HECTAREAS  = 0.404686;
	static final double ONZAS_A_MILILITROS = 29.5735;
	static final double GALONES_AMERICANOS_A_LITROS   = 3.78541; 
	
	//métodos de conversión
	
	//De libras a kilogramos.
	public static double convertirLibrasAKilogramo (double libras) {
		double kilogramos = libras * LIBRAS_A_KILOGRAMO;
		return kilogramos;
		//kilogramos++; no se alcanza, ERROR compilación
	}
	
	//De pies a metros.
	public static float convertirPiesAMetros (double pies) {
		return (float) (pies * PIES_A_METROS);
	}
	
	//De yardas a metros
	public static void 	convertirYardasAMetros (double yardas) {
		System.out.println(yardas + " yardas son " + (yardas * YARDA_A_METROS) + " m");
	}
	//De millas a metros
	public static int convertirMillasAMetro (double millas) {
		return (int) (millas * MILLAS_A_METROS);
	}
	//De acres a hectareas.
	public static long convertirAcresAHectareas (double acres) {
		return (long) acres * (long) ACRES_A_HECTAREAS; //otra posibilidad de casting, esta es peor doble casting
	}
	
	//De onzas a mililitros.
	public static float convertirOnzasAMililitros( long onzas ) {
		return onzas * (float) ONZAS_A_MILILITROS;
	}
	
	//De galones a litros.
	public static long convertirGalonesAmericanosALitros ( int litros ) {
		return litros * (long) GALONES_AMERICANOS_A_LITROS;
	}
	
		
}

