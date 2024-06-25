package deustospace;

import java.io.Serializable;
import java.util.ArrayList;

/** Clase que permite crear objetos planetas
 */
public class Planeta implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private ArrayList<String> colores;
	private double masa;
	private int duracionDia;
	private double distanciaAlSol;
	private int temperatura;
	private boolean	anillos;
	private ArrayList<Compuesto> compuestos;
	
	/** Crea un planeta
	 * @param nombre			Nombre
	 * @param colores			Lista de Strings
	 * @param masa				Masa
	 * @param duracionDia		Duración del Día (horas)
	 * @param distanciaAlSol	Distancia del Sol (10^6 km)
	 * @param temperatura		Temperatura Media (°C)
	 * @param anillos			¿Tiene anillos?
	 * @param compuestos		Lista de Compuestos
	 */
	public Planeta(String nombre, ArrayList<String> colores, double masa, int duracionDia, double distanciaAlSol,
			int temperatura, boolean anillos, ArrayList<Compuesto> compuestos) {
		super();
		this.nombre = nombre;
		this.colores = new ArrayList<String>(colores);
		this.masa = masa;
		this.duracionDia = duracionDia;
		this.distanciaAlSol = distanciaAlSol;
		this.temperatura = temperatura;
		this.anillos = anillos;
		this.compuestos = new ArrayList<Compuesto>(compuestos);
	}
	
	public Planeta(String nombre, double masa, int duracionDia, double distanciaAlSol,
			int temperatura, boolean anillos) {
		super();
		this.nombre = nombre;
		this.colores = new ArrayList<String>();
		this.masa = masa;
		this.duracionDia = duracionDia;
		this.distanciaAlSol = distanciaAlSol;
		this.temperatura = temperatura;
		this.anillos = anillos;
		this.compuestos = new ArrayList<Compuesto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getColores() {
		return colores;
	}

	public void setColores(ArrayList<String> colores) {
		this.colores = colores;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public int getDuracionDia() {
		return duracionDia;
	}

	public void setDuracionDia(int duracionDia) {
		this.duracionDia = duracionDia;
	}

	public double getDistanciaAlSol() {
		return distanciaAlSol;
	}

	public void setDistanciaAlSol(double distanciaAlSol) {
		this.distanciaAlSol = distanciaAlSol;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public boolean isAnillos() {
		return anillos;
	}

	public void setAnillos(boolean anillos) {
		this.anillos = anillos;
	}

	public ArrayList<Compuesto> getCompuestos() {
		return compuestos;
	}

	public void setCompuestos(ArrayList<Compuesto> compuestos) {
		this.compuestos = compuestos;
	}

	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", colores=" + colores + ", masa=" + masa + ", duracionDia=" + duracionDia
				+ ", distanciaAlSol=" + distanciaAlSol + ", temperatura=" + temperatura + ", anillos=" + anillos
				+ ", compuestos=" + compuestos + "]";
	}
	
	public void provocarError() {
		System.out.println(0/0);
	}
	
	// TAREA 2E: esAlcanzable()
	
	// TAREA 2E: getCosteAdicional()
}
