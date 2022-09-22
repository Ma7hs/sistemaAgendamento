package br.senai.sp.jandira.model;

public class PlanoDeSaude {

	private String operadoraPlanoSaude;
	private String tipoPlano;
	
	//Construtor da classe || Construtor Default (object)
		// Sempre público
		// Não tem retorno
		// 
	
	//Criando Construtor da Classe
	public PlanoDeSaude (String operadoraPlanoSaude, String tipoPlano) {
		this.operadoraPlanoSaude = operadoraPlanoSaude;
		this.tipoPlano = tipoPlano;
	}
	
	//Criando outro método construtor VAZIO (void)
	public PlanoDeSaude() {
		
	}
	
	
	

	//Métodos de acesso a classe
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
		return "Operadora convênio: " + this.operadoraPlanoSaude + " | " + "Tipo do plano: " + this.tipoPlano;
	}
	
	
}
