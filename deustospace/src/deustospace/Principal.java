package deustospace;

import java.util.Collections;

/** Clase principal de la aplicación
 */
public class Principal {

	public static void main(String[] args) {
		DeustoSpace ds = new DeustoSpace();

		// TAREA 1A: cargarMisionesCSV
		// TODO descomentar cuando esté programada
		ds.cargarMisionesCSV();
			
		// TAREA 1B: cargarPersonal
		// TODO descomentar cuando esté programada
		ds.cargarPersonalCSV();
		//System.out.println(ds.getPersonal());
		//ds.datosIniciales();
		
		// TAREA 1C: asignarPersonal
		// TODO descomentar cuando esté programado
		ds.asignarPersonal();

		//System.out.println(ds.getMisiones().get(0));
		//System.out.println(ds.getMisiones().get(0).getPersonal());
		
		// DESCOMENTA ESTA LLAMADA SI NO HAS SABIDO HACER LAS TAREAS 1A+1B+1C
		//ds.datosIniciales();
		//System.out.println(ds.getMisiones());
		
		// TAREA 2D: mostrar las misiones ordenadas por coste total
		// Con los datos iniciales debería mostrar primero la misión DS VI y luego II, IV, III y V 
		Collections.sort(ds.getMisiones());
		//System.out.println(ds.getMisiones());
		// TAREA 3A: costesPorPais
		// TODO descomentar cuando funcione
		// System.out.println(ds.costesPorPais());
		// Con los datos iniciales debería mostrar: {USA=134.0, Belgium=0.5, UK=1.6, Italy=1.5, France=178.1, Germany=1.1, Spain=3.0, Russia=38.0}
		// Con los datos del fichero debería mostrar: {USA=603.0, Switzerland=0.75, Spain=39.17500000000001, Russia=152.0, Austria=0.04999999999999999, Czech Republic=0.5, Sweden=0.07499999999999996, Belgium=8.75, UK=25.249999999999996, Poland=0.5, Italy=24.649999999999995, France=565.55, Germany=20.849999999999994}

		// TAREA 3B: paisMayorCoste
		ds.destinosPorCoste();
	}

}
