package ar.unrn.tp3.modelo;

import java.util.List;

public class GestorConcurso implements RepositorioConcurso {

	private PersistenciaConcursos concursos;
	private PersistenciaParticipantes participantes;

	public GestorConcurso(PersistenciaConcursos concursos, PersistenciaParticipantes participantes) {
		this.concursos = concursos;
		this.participantes = participantes;

	}

	@Override
	public List<Concurso> todosLosConcursos() {

		return concursos.concursos();

	}

	@Override
	public boolean cargarParticipante(String nombre, String apellido, String tel, String dni, String email,
			int IDConcurso) {
		return participantes.cargarNuevoParticipante(new Participante(nombre, apellido, tel, dni, email, IDConcurso));
	}

}
