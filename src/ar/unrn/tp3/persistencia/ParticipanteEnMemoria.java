package ar.unrn.tp3.persistencia;

import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.PersistenciaParticipantes;

public class ParticipanteEnMemoria implements PersistenciaParticipantes {

	@Override
	public boolean cargarNuevoParticipante(Participante p) {

		return true;
	}

}
