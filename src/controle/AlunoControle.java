package controle;

import java.util.ArrayList;

import modelo.Aluno;

public class AlunoControle {

	private static ArrayList<Aluno> tabelaAlunos;
	private static AlunoControle instancia;

	public static AlunoControle getInstancia() {

		if (instancia == null) {
			instancia = new AlunoControle();
			tabelaAlunos = new ArrayList<>();
		}

		return instancia;
	}

	private AlunoControle() {

	}

	// INSERT
	public boolean inserir(Aluno a) {
		if (a != null) {
			tabelaAlunos.add(a);
			return true;
		}
		return false;
	}

	// UPDATE
	public boolean alterar(Aluno alunoAlterar, long matricula) {

		for (Aluno aluno : tabelaAlunos) {

			if (aluno.getMatricula() == matricula) {
				aluno.setNome(alunoAlterar.getNome());
				
				// colocar os sets
				return true;
			}
		}
		return false;
	}

	// DELETE
	public boolean deletar(Aluno a, long matricula) {

		for (Aluno aluno : tabelaAlunos) {
			if (aluno.getMatricula() == matricula) {
				tabelaAlunos.remove(aluno);
				return true;
			}

		}
		return false;
	}

	// SELECT ALL
	public ArrayList<Aluno> listaAlunos() {
		return tabelaAlunos;
	}

}
