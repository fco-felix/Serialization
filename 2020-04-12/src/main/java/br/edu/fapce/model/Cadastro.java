package br.edu.fapce.model;

public class Cadastro implements java.io.Serializable {
	private static final long serialVersionUID = 6529685098267757690L;
	
	private String nome;
	private String cpf;
	private String nascimento;
	private String mae;
	
	public Cadastro(String nome, String cpf, String nascimento, String mae) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.mae = mae;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public String getMae() {
		return mae;
	}

}
