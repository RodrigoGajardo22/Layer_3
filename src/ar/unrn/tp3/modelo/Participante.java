package ar.unrn.tp3.modelo;

public class Participante {
	private String tel;
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private int IDConcurso;

	// apellido, nombre, teléfono, email, idconcurso
	public Participante(String nombre, String apellido, String tel, String dni, String email, int IDConcurso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tel = tel;
		this.dni = dni;
		this.email = email;
		this.IDConcurso = IDConcurso;

	}

	public String mostrarDatos() {
		if (nombre != null)
			return apellido + "," + nombre + "," + tel + "," + email + "," + IDConcurso;
		return "No se encontraron datos.";
	}
}
