package controle;

import java.util.ArrayList;

import modelo.Curso;

public class CursoControle {

	private static ArrayList<Curso> tabelaCursos;
	private static CursoControle instancia;

	public static CursoControle getInstancia() {

		if (instancia == null) {
			instancia = new CursoControle();
			tabelaCursos = new ArrayList<>();
		}

		return instancia;
	}

	private CursoControle() {

	}

	// INSERT
	public boolean inserir(Curso c) {
		if (c != null) {
			tabelaCursos.add(c);
			return true;
		}
		return false;
	}

	// UPDATE
	public boolean alterar(Curso cursoAlterar, long id) {

		for (Curso curso : tabelaCursos) {

			if (curso.getId() == id) {
				curso.setNome(cursoAlterar.getNome());

				// colocar os sets
				return true;
			}
		}
		return false;
	}
	
	// DELETE
		public boolean deletar(Curso c, long id) {

			for (Curso curso : tabelaCursos) {
				if (curso.getId() == id) {
					tabelaCursos.remove(curso);
					return true;
				}

			}
			return false;
		}
		
		// SELECT ALL
		public ArrayList<Curso> listaCursos() {
			return tabelaCursos;
		}

}
