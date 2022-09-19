package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JLabel;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Genero;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class ClinicaApp {

	public static void main(String[] args) {

		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		System.out.println(especialidade.getEspecialidade());

		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua Elton Silva");
		endereco.setNumero("905");
		endereco.setCidade("Jandira");
		endereco.setBairro("Centro");
		endereco.setEstado(Estados.SAO_PAULO);
		endereco.setComplemento("Instituição de Ensino");
		endereco.setPontoDeReferencia("Localizado próximo a prefeitura");
		endereco.setCep("06600-025");
		
		
		PlanoDeSaude planoSaude = new PlanoDeSaude();
		planoSaude.setOperadoraSaude("Bradesco");
		planoSaude.setTipoPlano("Platinum");
		System.out.println(planoSaude.getOperadoraPlanoSaude());
		System.out.println(planoSaude.getTipoPlano());
		System.out.println(planoSaude.getDadosDoPlano());
		
		
		Paciente paciente = new Paciente();
		paciente.setNomePaciente("Patrícia Dos Santos");
		paciente.setEmailPaciente("Miguel.Joaquim@gmail.com");
		paciente.setCpf("528.161.498-38");
		paciente.setRg("56.155.675-X");
		paciente.setTelefone("11972690379");
		paciente.setGenero(Genero.FEMININO);
		paciente.setEndereco(endereco);
		paciente.setPlanoDeSaude(planoSaude);

		Medico medico = new Medico();
		medico.setNomeMedico("Garcia Pinheiro");
		medico.setCrm("4563-9");
		medico.setSexo("Masculino");
	
		
		
		Medico medico2 = new Medico();
		medico.setNomeMedico("Marta Jesus");
		medico.setCrm("4263-6");
		medico.setSexo("Feminino");
	

		
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologia");
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Pediatria");
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Clínico Geral");
		Especialidade especialidade4 = new Especialidade();
		especialidade4.setNome("Otorrinolaringolosgista");
		Especialidade especialidade5 = new Especialidade();
		especialidade5.setNome("Nutricionista");
		
		//Criar lista de especialidade Medicos
		Especialidade [] especilidadesMedico = {especialidade1, especialidade3};
		medico.setEspecialidade(especilidadesMedico);
		
		Especialidade [] especilidadesMedico2 = {especialidade1, especialidade3};
		medico.setEspecialidade(especilidadesMedico2);
		
		
		Agenda agendaPatricia = new Agenda();
		agendaPatricia.setHoraConsulta(LocalTime.of(14, 14));
		agendaPatricia.setPaciente(paciente);
		agendaPatricia.setEspecialidade(especialidade3);
		agendaPatricia.setMedico(medico2);
		agendaPatricia.setDataConsulta(LocalDate.of(2022, 9, 22));
		agendaPatricia.setCompareceu(true);
		agendaPatricia.setObservacoes("Apresentou dores fortes nas costas nos ultimos 5 dias");
		
		System.out.println("Nome do paciente: " + agendaPatricia.getPaciente().getNomePaciente());
		System.out.println("Plano de saúde paciente: " +  agendaPatricia.getPaciente().getPlanoDeSaude().getDadosDoPlano());
		
		System.out.println("Nome do médico (a): " + agendaPatricia.getMedico().getNomeMedico());
		System.out.println("Especialidade médico: " + agendaPatricia.getMedico().getEspecialidade());
		
		System.out.println("Data da consulta: " + agendaPatricia.getDataConsulta());
		System.out.println("Horário da consulta: " + agendaPatricia.getHoraConsulta());

		
		
		
	}
}
