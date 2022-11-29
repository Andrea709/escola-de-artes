package modelo;

public class Aluno {
	
	private String nome;
	private Integer telefone;
	private Long cpf;
	private String email;
	
	public Aluno() {}
	//public Aluno(String nome, email, Long cpf, Integer telefone) 
	
	
	//getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	
	public Long getCPF() {
		return cpf;
	}
	public void setCPF(Long cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
