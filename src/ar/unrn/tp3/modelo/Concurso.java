package ar.unrn.tp3.modelo;

import java.time.LocalDate;

public class Concurso {
	private int id;
	private String nombre;
	private LocalDate fechaIni;
	private LocalDate fechaFin;

	// idconcurso, nombre, fechaInicioInscripcion, fechaFinInscripcion
	public Concurso(int id, String nombre, LocalDate fechaIni, LocalDate fechaFin) {

		this.id = id;
		this.nombre = nombre;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;

	}

	public boolean disponible(LocalDate fecha) {

		if (fecha.equals(fechaIni))
			return true;
		if (fecha.isAfter(fechaIni) && fecha.isBefore(fechaFin))
			return true;

		return false;

	}

	public int ID() {
		return id;
	}

	public String toString() {
		return nombre + "  -  Inicio: " + fechaIni + "  -  Fin: " + fechaFin;

	}

}
