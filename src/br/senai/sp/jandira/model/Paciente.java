package br.senai.sp.jandira.model;

public class Paciente {

	private String nomePaciente;
	private String emailPaciente;
	private String rg;
	private String cpf;
	private String telefone;
	private Genero genero;
	
	private Endereco endereco;
	private PlanoDeSaude planoDeSaude;
	
	
	
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getNomePaciente() {
		return this.nomePaciente;
	}
	
	public void setEmailPaciente(String emailPaciente) {
		this.emailPaciente = emailPaciente;
	}
	public String getEmailPaciente() {
		return emailPaciente;
	}
	
	public void setPlanoDeSaude(PlanoDeSaude planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	public PlanoDeSaude getPlanoDeSaude() {
		return planoDeSaude;
	}
	
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	//SET & GET = Sexo Paciente
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	//SET & GET = Endereço
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public String getDadosPaciente() {
		return "Os dados do cliente são: " + " Nome: " + this.nomePaciente + " E-mail: " + this.emailPaciente + " Plano de Saúde: " + this.planoDeSaude;
	}
	
	
	
}
