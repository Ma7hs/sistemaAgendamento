package br.senai.sp.jandira;
import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;


public class ClinicaApp {

	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		
		especialidade.setNome("Cardiologia");
		System.out.println(especialidade.getEspecialidade());
		
		PlanoDeSaude planoSaude = new PlanoDeSaude();
		
		planoSaude.setOperadoraSaude("Bradesco");
		planoSaude.setTipoPlano("Platinum");
		System.out.println(planoSaude.getOperadoraPlanoSaude());
		System.out.println(planoSaude.getTipoPlano());
		
		PlanoDeSaude planoSaudeNovo = new PlanoDeSaude();
		planoSaudeNovo.setOperadoraSaude("Unimed");
		planoSaudeNovo.setTipoPlano("Bronze");
		
		JOptionPane.showMessageDialog(null, planoSaudeNovo.getDadosDoPlano());
		System.out.println(planoSaudeNovo.getDadosDoPlano());	
		
		Paciente paciente = new Paciente();
		paciente.setNomePaciente("Miguel Joaquim");
		paciente.setEmailPaciente("Miguel.Joaquim@gmail.com");
		paciente.setPlanoDeSaude(planoSaudeNovo);
		
		System.out.println(paciente.getDadosPaciente());
		
		
	}
}
