package ar.unrn.tp3.persistencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.unrn.tp3.modelo.Concurso;
import ar.unrn.tp3.modelo.PersistenciaConcursos;

public class ConcursosEnMemoria implements PersistenciaConcursos {

	private List<Concurso> lista;

	public ConcursosEnMemoria() {
		lista = new ArrayList<>();
	}

	@Override
	public List<Concurso> concursos() {
		List<Concurso> disponibles = new ArrayList<>();

		for (Concurso concurso : lista) {
			if (concurso.disponible(LocalDate.now()))
				disponibles.add(concurso);
		}

		return disponibles;
	}

	public void add(Concurso c) {
		lista.add(c);
	}

}
