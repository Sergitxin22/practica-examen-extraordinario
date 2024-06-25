package deustospace;

import static org.junit.jupiter.api.Assertions.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MisionTest {

	@Test
	void testConstructor() {
		Mision m1 = new Mision("mision1", "madrid", "marte", 2024, 2, 20);
		assertEquals("mision1", m1.getNombre());
		assertEquals("madrid", m1.getLugar());
		assertEquals("marte", m1.getDestino());
		LocalDate fecha = LocalDate.of(2024, 2, 20);
		assertEquals(fecha, m1.getFecha());
		
		// Con fecha incorrecta
		try {
			Mision m2 = new Mision("mision1", "madrid", "marte", 2024, -2, 20);
			fail("tendria que dar un error de tipo DateTimeException");
		} catch (DateTimeException e) {
			// Ok!
		}
	}
	
	@Test
	void testGetCosteTotal() {
		// Primer caso
		Mision m1 = new Mision("mision1", "madrid", "marte", 2024, 2, 20);
		Nave n1 = new Nave("nave1", "proveedor1", 0, 5);
		
		m1.setNave(n1);
		assertEquals(0, m1.getPersonal().size());
		assertEquals(0, m1.getNave().getCoste());
		
		// costeInicial + costePersonal + costeNave
		//     1.5	+       0	+     0	   = 1.5
		assertEquals(1.5, m1.getCosteTotal());
		
		// Segundo caso
		Mision m2 = new Mision("mision2", "madrid", "marte", 2024, 2, 20);
		Nave n2 = new Nave("nave2", "proveedor1", 5, 5);
		
		m2.setNave(n2);
		assertEquals(0, m2.getPersonal().size());
		assertEquals(5, m2.getNave().getCoste());
		
		// costeInicial + costePersonal + costeNave
		//     1.5	+       0	+     5	   = 6.5
		assertEquals(6.5, m2.getCosteTotal());
		
		// Tercer caso
		Mision m3 = new Mision("mision3", "madrid", "marte", 2024, 2, 20);
		Astronauta a1 = new Astronauta("sergio", "spain");
		
		m3.setNave(n2);
		ArrayList<Personal> p1 = new ArrayList<Personal>();
		p1.add(a1);
		m3.setPersonal(p1);
		assertEquals(1, m3.getPersonal().size());
		assertEquals(0, (((Astronauta) m3.getPersonal().get(0)).getHabilidades()).size());

		// costePersonal = 0.25*0
		// costeInicial + costePersonal + costeNave
		//     1.5	+       0 	+     5    = 6.5
		assertEquals(6.5, m3.getCosteTotal());
		
		// Cuarto caso
		Mision m4 = new Mision("mision4", "madrid", "marte", 2024, 2, 20);
		ArrayList<Habilidad> h1 = new ArrayList<>();
		
		h1.add(Habilidad.INGENIERIA);
		h1.add(Habilidad.INVESTIGACION);
		Astronauta a2 = new Astronauta("sergio", "spain");
		a2.setHabilidades(h1);
		m4.setNave(n2);
		ArrayList<Personal> p2 = new ArrayList<Personal>();
		p2.add(a2);
		m4.setPersonal(p2);
		assertEquals(1, m4.getPersonal().size());
		assertEquals(2, (((Astronauta) m4.getPersonal().get(0)).getHabilidades()).size());
		
		// costePersonal = 0.25*2*0.1
		// costeInicial + costePersonal + costeNave
		//     1.5	+     0.05	+     5	   = 6.55
		assertEquals(6.55, m4.getCosteTotal());
		
		// Quinto caso
		Mision m5 = new Mision("mision5", "madrid", "marte", 2024, 2, 20);
		m5.setNave(n2);
		
		Tierra t1 = new Tierra("sergio", "hola", 1);
		Tierra t2 = new Tierra("ser", "la", 2);
		p2.add(t1);
		p2.add(t2);
		m5.setPersonal(p2);
		assertEquals(3, m5.getPersonal().size());
		assertEquals(1, (((Tierra) m5.getPersonal().get(1)).getNivel()));
		assertEquals(2, (((Tierra) m5.getPersonal().get(2)).getNivel()));
		
		// costePersonal = (0.25*2*0.1) + (0.15*1) + (0.15*2)
		// costeInicial + costePersonal + costeNave
		//     1.5	+     0.5	+     5	   = 7
		assertEquals(7, m5.getCosteTotal());
	}

}
