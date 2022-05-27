package ar.unrn.tp3.main;

import javax.swing.SwingUtilities;

import ar.unrn.tp3.modelo.GestorConcurso;
import ar.unrn.tp3.persistencia.ConcursoEnArchivo;
import ar.unrn.tp3.persistencia.ParticipantesEnArchivo;
import ar.unrn.tp3.ui.UI;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					new Main().start();
				} catch (Exception e) {
					// log exception...
					System.out.println(e);
				}
			}
		});
	}

	private void start() {

		GestorConcurso gestor = new GestorConcurso(new ConcursoEnArchivo(), new ParticipantesEnArchivo());
		new UI(gestor);
	}
}
