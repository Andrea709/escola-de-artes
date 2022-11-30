package controle;

import java.util.ArrayList;

import modelo.Aluno;

public class AlunoControle {
	
	private ArrayList<Aluno> tabelaAlunos; //pra que serve?
	
	public AlunoControle() {
		this.tabelaAlunos = new ArrayList<>(); //pra que serve tbm jesus
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
	public boolean alterar(Aluno a, Long cpfAluno) {

		for (Aluno aluno : tabelaAlunos) {

			if (aluno.getCPF() == cpfAluno) {
				aluno.setNome(a.getNome());
				return true;
			}
		}
	return false;
	}
	
	//DELETE
	public boolean deletar(Aluno a, Long cpfAluno, Integer telefoneAluno, String emailAluno) {

		for (Aluno aluno : tabelaAlunos) {
			if (aluno.getCPF() == cpfAluno) {
				tabelaAlunos.remove(aluno);
				return true;
			}
			if (aluno.getEmail() == emailAluno) {
				tabelaAlunos.remove(aluno);
			}
		}
		return false;
	}
	
	
	// SELECT ALL
		public ArrayList<Aluno> listaAlunos() {
			return this.tabelaAlunos;
		}
	
}
