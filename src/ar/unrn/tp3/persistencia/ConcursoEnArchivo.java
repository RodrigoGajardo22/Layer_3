package ar.unrn.tp3.persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ar.unrn.tp3.modelo.Concurso;
import ar.unrn.tp3.modelo.PersistenciaConcursos;

public class ConcursoEnArchivo implements PersistenciaConcursos {

	@Override
	public List<Concurso> concursos() {

		List<Concurso> listaDeConcursos = new ArrayList<>();

		File archivo = new File(
				"C:\\Users\\Usuario\\Documents\\2 - UNIVERSIDAD RODRI\\Orientacion a Objetos 2\\Persistencia\\Registro De Concursos.txt");
		Scanner scanner;

		try {
			scanner = new Scanner(archivo);

			while (scanner.hasNextLine()) {

				String[] datos = convertirEnArreglo(scanner.nextLine());
				Concurso concurso = convertirAConcurso(datos);
				if (concurso.disponible(LocalDate.now()))
					listaDeConcursos.add(concurso);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return listaDeConcursos;
	}

	private String[] convertirEnArreglo(String cadena) {

		String[] datos = cadena.split(",");

		return datos;
	}

	private Concurso convertirAConcurso(String[] datos) {

		int id = Integer.parseInt(datos[0]);
		String nombre = datos[1];
		LocalDate fechaIni = LocalDate.parse(datos[2]);
		LocalDate fechaFin = LocalDate.parse(datos[3]);

		return new Concurso(id, nombre, fechaIni, fechaFin);
	}

}
