package ar.unrn.tp3.persistencia;

import java.io.File;
import java.io.FileWriter;

import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.PersistenciaParticipantes;

public class ParticipantesEnArchivo implements PersistenciaParticipantes {

	// cargar ruta por constructor
	@Override
	public boolean cargarNuevoParticipante(Participante p) {

		String dato = p.mostrarDatos();
		boolean carga = false;

		try {

			File archivo = new File(
					"C:\\Users\\Usuario\\Documents\\2 - UNIVERSIDAD RODRI\\Orientacion a Objetos 2\\Persistencia\\Inscriptos.txt");
			FileWriter escribir = new FileWriter(archivo, true);

			escribir.write(dato);
			escribir.write("\r\n");
			escribir.close();
			carga = true;

		} // Si existe un problema al escribir cae aqui
		catch (Exception e) {
			System.out.println("Error al escribir"); // tirar exception
		}

		return carga;

	}

}
