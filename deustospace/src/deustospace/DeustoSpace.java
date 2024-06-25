package deustospace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeMap;

/** Clase de agencia espacial, contenedora de datos
 */
public class DeustoSpace implements Serializable {
	private static final long serialVersionUID = 1L;
	private ArrayList<Mision> misiones;
	private ArrayList<Personal> personal;
	private ArrayList<Planeta> planetas;
	
	/** Crea un objeto de agencia espacial, contenedor de datos de misiones, personal y planetas. Se inicia con la lista de misiones, personal y planetas vacías
	 */
	public DeustoSpace() {
		super();
		this.misiones = new ArrayList<Mision>();
		this.personal = new ArrayList<Personal>();
		this.planetas = new ArrayList<Planeta>();
	}
	
	/** Crea un objeto de agencia espacial, contenedor de datos de misiones y personal.
	 * @param misiones	Misiones iniciales de la agencia
	 * @param personal	Personal inicial de la agencia
	 */
	public DeustoSpace(ArrayList<Mision> misiones, ArrayList<Personal> personal, ArrayList<Planeta> planetas) {
		super();
		this.misiones = new ArrayList<Mision>(misiones);
		this.personal = new ArrayList<Personal>(personal);
		this.planetas = new ArrayList<Planeta>(planetas);
	}

	public ArrayList<Mision> getMisiones() {
		return misiones;
	}

	public ArrayList<Personal> getPersonal() {
		return personal;
	}
	

	public ArrayList<Planeta> getPlanetas() {
		return planetas;
	}

	public void setPersonal(ArrayList<Personal> personal) {
		this.personal = personal;
	}

	public void setPlanetas(ArrayList<Planeta> planetas) {
		this.planetas = planetas;
	}

	@Override
	public String toString() {
		return "DeustoSpace [misiones=" + misiones + ", personal=" + personal + ", planetas=" + planetas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(misiones);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeustoSpace other = (DeustoSpace) obj;
		return Objects.equals(misiones, other.misiones);
	}
	
	/** Crea datos de prueba iniciales de la agencia: una serie de misiones y una lista de personal
	 */
	public void datosIniciales() {
		Mision m0 = new Mision("DS I", "Florida USA", "ISS", 2025, 3, 20);
		m0.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m1 = new Mision("DS II", "Florida USA", "ISS", 2025, 7, 21);
		m1.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m2 = new Mision("DS III", "Guayana Francesa", "Luna", 2026, 2, 12);
		m2.setNave(new Nave("Ariane 5","Arianespace", 178, 21000));
		Mision m3 = new Mision("DS IV", "Houston USA", "ISS", 2026, 3, 14);
		m3.setNave(new Nave("Falcon 9","SpaceX", 67, 22000));
		Mision m4 = new Mision("DS V", "Guayana Francesa", "Luna", 2027, 2, 12);
		m4.setNave(new Nave("Ariane 5","Arianespace", 178, 21000));
		Mision m5 = new Mision("DS VI", "Baikonur", "ISS", 2027, 3, 11);
		m5.setNave(new Nave("Soyuz", "Roscosmos", 38, 7020));
		personal.add(new Astronauta("Pablo Álvarez Fernández", "Spain", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Astronauta("Sara García Alonso", "Spain", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Astronauta("Andrea Patassa", "Italy", new ArrayList<Habilidad>(Arrays.asList(Habilidad.values()))));
		personal.add(new Tierra("Ana García", "Spain", 1));
		personal.add(new Tierra("Andrea Ors", "Italy", 1));
		personal.add(new Tierra("Laura Johnson", "UK", 1));
		personal.add(new Tierra("Andrea Johnson", "Spain", 1));
		personal.add(new Tierra("Mark Becker", "France", 1));
		personal.add(new Tierra("Ana García", "Spain", 2));
		personal.add(new Tierra("Andrea Ors", "Italy", 2));
		personal.add(new Tierra("Laura Johnson", "UK", 2));
		personal.add(new Tierra("John Becker", "Spain", 2));
		personal.add(new Tierra("Mark Bocelli", "Italy", 2));
		personal.add(new Tierra("Ana García", "Spain", 3));
		personal.add(new Tierra("Mark Ors", "Germany", 3));
		personal.add(new Tierra("John Johnson", "Spain", 3));
		personal.add(new Tierra("Laura Becker", "Germany", 3));
		personal.add(new Tierra("Andrea Bocelli", "Spain", 3));
		personal.add(new Tierra("Ana García", "Spain", 4));
		personal.add(new Tierra("Laura Ors", "UK", 4));
		personal.add(new Tierra("Mark Johnson", "Italy", 4));
		personal.add(new Tierra("Andrea Becker", "Spain", 4));
		personal.add(new Tierra("John Bocelli", "UK", 4));
		personal.add(new Tierra("Ana García", "Spain", 5));
		personal.add(new Tierra("Ana Ors", "Belgium", 5));
		personal.add(new Tierra("Ana Johnson", "UK", 5));
		personal.add(new Tierra("Ana Becker", "Germany", 5));
		personal.add(new Tierra("Ana Bocelli", "Italy", 5));
		
		m1.setPersonal(personal);
		m2.setPersonal(personal);
		m3.setPersonal(personal);
		m4.setPersonal(personal);
		m5.setPersonal(personal);
		misiones.add(m0);
		misiones.add(m1);
		misiones.add(m2);
		misiones.add(m3);
		misiones.add(m4);
		misiones.add(m5);
		
		ArrayList<String> col1 = new ArrayList<String>();
		col1.add("Gris");
		ArrayList<Compuesto> com1 = new ArrayList<Compuesto>();
		com1.add(Compuesto.ROCA);
		com1.add(Compuesto.METAL);
		Planeta p1 = new Planeta("Mercurio", col1, 0.33, 42226, 57.9, 167, false, com1);

		ArrayList<String> col2 = new ArrayList<String>();
		col2.add("Marrón");
		col2.add("Gris");
		ArrayList<Compuesto> com2 = new ArrayList<Compuesto>();
		com2.add(Compuesto.ROCA);
		com2.add(Compuesto.METAL);
		Planeta p2 = new Planeta("Venus", col2, 4.87, 2802, 108.2, 464, false, com2);

		ArrayList<String> col3 = new ArrayList<String>();
		col3.add("Azul");
		col3.add("Marrón");
		col3.add("Verde");
		col3.add("Blanco");
		ArrayList<Compuesto> com3 = new ArrayList<Compuesto>();
		com3.add(Compuesto.ROCA);
		com3.add(Compuesto.AGUA);
		com3.add(Compuesto.AIRE);
		Planeta p3 = new Planeta("Tierra", col3, 5.97, 24, 149.6, 15, false, com3);

		ArrayList<String> col4 = new ArrayList<String>();
		col4.add("Rojo");
		col4.add("Marrón");
		col4.add("Beige");
		ArrayList<Compuesto> com4 = new ArrayList<Compuesto>();
		com4.add(Compuesto.ROCA);
		com4.add(Compuesto.HIELO);
		Planeta p4 = new Planeta("Marte", col4, 0.642, 247, 228, -65, false, com4);

		ArrayList<String> col5 = new ArrayList<String>();
		col5.add("Marrón");
		col5.add("Naranja");
		col5.add("Beige");
		col5.add("Franjas de Nubes Blancas");
		ArrayList<Compuesto> com5 = new ArrayList<Compuesto>();
		com5.add(Compuesto.GAS);
		com5.add(Compuesto.LÍQUIDO);
		Planeta p5 = new Planeta("Júpiter", col5, 1898, 99, 778.5, -110, true, com5);

		ArrayList<String> col6 = new ArrayList<String>();
		col6.add("Dorado");
		col6.add("Marrón");
		col6.add("Azul-Gris");
		ArrayList<Compuesto> com6 = new ArrayList<Compuesto>();
		com6.add(Compuesto.GAS);
		com6.add(Compuesto.LÍQUIDO);
		Planeta p6 = new Planeta("Saturno", col6, 568, 107, 1.432, -140, true, com6);

		ArrayList<String> col7 = new ArrayList<String>();
		col7.add("Azul-Verde");
		ArrayList<Compuesto> com7 = new ArrayList<Compuesto>();
		com7.add(Compuesto.GAS);
		com7.add(Compuesto.HIELO);
		Planeta p7 = new Planeta("Urano", col7, 86.8, 172, 2.867, -195, true, com7);

		ArrayList<String> col8 = new ArrayList<String>();
		col8.add("Azul");
		ArrayList<Compuesto> com8 = new ArrayList<Compuesto>();
		com8.add(Compuesto.GAS);
		com8.add(Compuesto.HIELO);
		Planeta p8 = new Planeta("Neptuno", col8, 102, 161, 4.515, -200, true, com8);
		
		planetas.add(p1);
		planetas.add(p2);
		planetas.add(p3);
		planetas.add(p4);
		planetas.add(p5);
		planetas.add(p6);
		planetas.add(p7);
		planetas.add(p8);
	}

	// TAREA 1A: cargarMisionesCSV
	public void cargarMisionesCSV() {
		File f = new File("misiones.csv");
		
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(";");
				
				try {
					String nombre = campos[0];
					String lugar = campos[1];
					String destino = campos[2];
					int dia = Integer.parseInt(campos[3]);
					int mes = Integer.parseInt(campos[4]);
					int anyo = Integer.parseInt(campos[8]);
					
					// Crear nave
					String nombreNave = campos[6];
					String proveedor = campos[7];
					double coste = Double.parseDouble(campos[8]);
					double carga = Double.parseDouble(campos[9]);
					
					Nave nave = new Nave(nombreNave, proveedor, coste, carga);
					
					// m.nave = null;
					// m.personal = new ArrayList<Personal>();
					Mision m = new Mision(nombre, lugar, destino, anyo, mes, dia);
					m.setNave(nave);
					
					this.misiones.add(m);
				} catch (IndexOutOfBoundsException ex) {
					//System.err.println("Faltan datos");
				} catch (NumberFormatException ex) {
					//System.err.println("Un dato entero o real es erroneo");
				} catch (DateTimeException ex) {
					//System.err.println("Una fecha es erronea");
				} catch (Exception ex) {
					//System.err.println("Ha ocurrido un error desconocido");
				}				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el archivo especificado");
		}
	}

	// TAREA 1B: cargarPersonalCSV
	public void cargarPersonalCSV() {
		File f = new File("personal.csv");
		
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				String linea = sc.nextLine();
				String[] campos = linea.split(";");
				
				try {
					String tipo = campos[0];
					String nombre = campos[1];
					String pais = campos[2];
					String caracteristicas = campos[3];
					
					Personal p = null;
					
					if (tipo.equalsIgnoreCase("Astronauta")) {
						String[] listaHabilidades = caracteristicas.split(",");
						ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
						for (String caracteristica : listaHabilidades) {
							Habilidad habilidad = Habilidad.valueOf(caracteristica);
							habilidades.add(habilidad);
						}
						
						p = new Astronauta(nombre, pais, habilidades);
					} else if (tipo.equalsIgnoreCase("Personal de Tierra")) {
						int nivel = Integer.parseInt(caracteristicas);
						p = new Tierra(nombre, pais, nivel);
					}
					
					this.personal.add(p);
				} catch (IndexOutOfBoundsException ex) {
					//System.err.println("faltan datos");
				} catch (NumberFormatException ex) {
					//System.err.println("un dato entero o real es erroneo");
				}
				
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// TAREA 1C: asignarPersonal
	public void asignarPersonal() {
		HashSet<Astronauta> astronautasUnicos = new HashSet<Astronauta>();
		HashSet<Tierra> personalTierraUnicos = new HashSet<Tierra>();
		
		// Cada persona solo está una vez
		for (Personal persona : this.personal) {
			if (persona instanceof Astronauta) {
				astronautasUnicos.add((Astronauta) persona);
			} else {
				personalTierraUnicos.add((Tierra) persona);
			}
		}
		
		for (Mision mision : this.misiones) {
			ArrayList<Astronauta> astronautas = new ArrayList<Astronauta>(astronautasUnicos);
			ArrayList<Tierra> personalTierra = new ArrayList<Tierra>(personalTierraUnicos);
			
			boolean astronautaPiloto = false;
			for (int i = 0; i < 3; i++) { // 3 astronautas
				int random = (int) (Math.random()*astronautas.size());
				Astronauta a = astronautas.get(random);
				
				
				// Comprobamos el minimo de un astronauta puiloto
				if (a.getHabilidades().contains(Habilidad.PILOTAR)) {
					astronautaPiloto = true;
				} 
				
				if ((i == 2) && !astronautaPiloto) {
					while (!a.getHabilidades().contains(Habilidad.PILOTAR)) {
						random = (int) (Math.random()*astronautas.size());
						a = astronautas.get(random);
						
					}
					astronautaPiloto = true;
					//System.out.println("Recalcular");
				}
				
				mision.getPersonal().add(a);
				astronautas.remove(a);
				
				//System.out.println("Vuelta");
			}
			
			for (int j = 0; j < 25; j++) { // 25 personal de tierra
				int random = (int) (Math.random()*personalTierra.size());
				Tierra t = personalTierra.get(random);
				mision.getPersonal().add(t);
				personalTierra.remove(t);
				//System.out.println(personalTierra.size());
			}
		}
		
	}
	
	// TAREA 1D: cargarPlanetasCSV
	
	// TAREA 1E: asignarDestino
	
	// TAREA 1F: guardarPlanetasCSV
	
	// TAREA 3A: costesPorPais
	public void costesPorPais() {
		HashMap<String, Double> costePorPais = new HashMap<>();
		
		for (Mision mision : misiones) {
			String pais = mision.getLugar();
			
			// Calculo el coste del personal
			double costePersonal = 0;
			
			for (Personal persona : this.personal) {
				double coste = persona.getCoste();
				costePersonal += coste;
			}
			
			// Sumo valor totalMision
			if (!costePorPais.containsKey(pais)) {
				costePorPais.put(pais, costePersonal);
			} else {
				double valorAnterior = costePorPais.get(pais);
				costePorPais.put(pais, costePersonal+valorAnterior);
			}
			
			// Elijo el pais de la nave
			if (mision.getNave().getProveedor().equalsIgnoreCase("Arianespace")) {
				pais = "France";
			} else if (mision.getNave().getProveedor().equalsIgnoreCase("SpaceX")) {
				pais = "USA";
			} else {
				pais = "Russia";
			}
			
			// Sumo valor nave
			double precioNave = mision.getNave().getCoste();
			if (!costePorPais.containsKey(pais)) {
				costePorPais.put(pais, precioNave);
			} else {
				double valorAnterior = costePorPais.get(pais);
				costePorPais.put(pais, precioNave+valorAnterior);
			}			
		}
	}
	
	// TAREA 3B: destinosPorCoste
	public void destinosPorCoste() {
		TreeMap<String, ArrayList<Mision>> misionesPorDestino = new TreeMap<>();
		
		// Creo el mapa
		for (Mision mision : misiones) {
			String destino = mision.getDestino();
			if (!misionesPorDestino.containsKey(destino)) {
				misionesPorDestino.put(destino, new ArrayList<Mision>());
				
			}
			misionesPorDestino.get(destino).add(mision);
		}
		
		// Imprimo el mapa
		for (String clave : misionesPorDestino.keySet()) {
			System.out.println("Misiones a " + clave + "...");
			ArrayList<Mision> misiones = misionesPorDestino.get(clave);
			
			for (Mision mision : misiones) {
				System.out.println("\t -" + mision);
			}
			
		}
		
	}

	// TAREA 3C: misionesPorDestino
	
	// TAREA 3D: personalPorPais
}
