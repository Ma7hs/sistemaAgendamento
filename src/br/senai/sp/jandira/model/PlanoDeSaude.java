package br.senai.sp.jandira.model;

public class PlanoDeSaude {

	private String operadoraPlanoSaude;
	private String tipoPlano;
	
	public void setOperadoraSaude (String operadoraPlanoSaude) {
		this.operadoraPlanoSaude = 	operadoraPlanoSaude;	
	}
	public String getOperadoraPlanoSaude() {	
		return this.operadoraPlanoSaude;
	}

	public void setTipoPlano (String tipoPlano) {
		this.tipoPlano = tipoPlano;
	}
	public String getTipoPlano() {
		return this.tipoPlano;
	}
	
	public String getDadosDoPlano() {
		return "Plano: " + this.operadoraPlanoSaude + "," + this.tipoPlano;
	}
	
	
}
