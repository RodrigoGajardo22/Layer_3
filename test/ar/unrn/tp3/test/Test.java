package ar.unrn.tp3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.unrn.tp3.modelo.Concurso;
import ar.unrn.tp3.modelo.GestorConcurso;
import ar.unrn.tp3.persistencia.ConcursosEnMemoria;
import ar.unrn.tp3.persistencia.ParticipanteEnMemoria;

class Test {

	@org.junit.jupiter.api.Test
	void test() {
		ConcursosEnMemoria concursos = new ConcursosEnMemoria();
		ParticipanteEnMemoria participantes = new ParticipanteEnMemoria();
		GestorConcurso gestor = new GestorConcurso(concursos, participantes);

		// idconcurso, nombre, fechaInicioInscripcion, fechaFinInscripcion
		Concurso c1 = new Concurso(1, "Concurso 1", LocalDate.now().minusDays(1), LocalDate.now().plusDays(10));
		Concurso c2 = new Concurso(2, "Concurso 2", LocalDate.now().plusDays(5), LocalDate.now().plusDays(15));
		Concurso c3 = new Concurso(3, "Concurso 3", LocalDate.now().minusDays(10), LocalDate.now().plusDays(10));

		concursos.add(c3);
		concursos.add(c2);
		concursos.add(c1);

		List<Concurso> disponibles = new ArrayList<>();
		disponibles.add(c3);
		disponibles.add(c1);

		// concursos.concursos();

		assertTrue(gestor.cargarParticipante("Rodrigo", "Gajardo", "154119", "36849859", "email", 1));
		assertEquals(concursos.concursos(), disponibles);

	}

}
