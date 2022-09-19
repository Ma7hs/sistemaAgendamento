package br.senai.sp.jandira.model;

public class Paciente {

	private String nomePaciente;
	private String emailPaciente;
	private PlanoDeSaude planoDeSaude;
	private String dadosPaciente;
	
	
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
	
	public String getDadosPaciente() {
		return "Os dados do cliente são: " + "Nome:" + this.nomePaciente + "Email: " + this.emailPaciente + "Plano de Saúde: " + this.planoDeSaude;
	}
	
}
