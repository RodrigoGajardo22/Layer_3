package ar.unrn.tp3.modelo;

import java.util.List;

public interface RepositorioConcurso {

	public List<Concurso> todosLosConcursos();

	public boolean cargarParticipante(String nombre, String apellido, String tel, String dni, String email,
			int IDConcurso);

}
