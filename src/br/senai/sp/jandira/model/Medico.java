package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

	private String nomeMedico;
	private String sexo;
	private String dataConsulta;
	private Especialidade[] especialidade;
	private String crm;

	
	// SET & GET = nome do medico
	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}
	public String getNomeMedico() {
		return this.nomeMedico;
	}

	//SET & GET = Data Consulta
	public String getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	
	//SET & GET = Especialidade
	public Especialidade[] getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}

	
	// SET & GET = Sexo Medico
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	// SET & GET = CRM
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getCrm() {
		return this.crm;
	}
		
}

