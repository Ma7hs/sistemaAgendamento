package teste;

import br.senai.sp.jandira.model.PlanoDeSaude;


public class ArrayList {

	public static void main(String[] args) {
	
		PlanoDeSaude planoSaude1 = new PlanoDeSaude(); //Método Construtor
		planoSaude1.setOperadoraSaude("Bradesco");
		planoSaude1.setTipoPlano("Bronze");
		
		PlanoDeSaude planoSaude2 = new PlanoDeSaude(); //Método Construtor
		planoSaude2.setOperadoraSaude("Amil");
		planoSaude2.setTipoPlano("Prata");
		
		PlanoDeSaude planoSaude3 = new PlanoDeSaude(); //Método Construtor
		planoSaude3.setOperadoraSaude("Unimed");
		planoSaude3.setTipoPlano("Platinum");
				

		PlanoDeSaude[] todosPlanos = {planoSaude1, planoSaude2, 
				new PlanoDeSaude("Porto Seguro", "Prata"), 
				new PlanoDeSaude("Unimed", "Platinum") };
		System.out.println(todosPlanos[3].getDadosDoPlano());
	
		
		
		//Criando lista de Planos de Saude em lista || ArrayList
		java.util.ArrayList<PlanoDeSaude> planosList = new java.util.ArrayList<>();
		planosList.add(planoSaude1);
		planosList.add(planoSaude2);
		planosList.add(planoSaude3);
		planosList.add(new PlanoDeSaude("Blue Med", "Exclusive"));
		planosList.add(new PlanoDeSaude("Ameplan", "Prata"));
		planosList.add(new PlanoDeSaude("Notredame", "Prata"));
		
		
		//Setar novo plano após ter criado já
		planosList.get(5).setOperadoraSaude("Bradesco");
		
		//Mostrando no terminal o resultado
		System.out.println(planosList.get(5).getDadosDoPlano());
		
		int nota1 = 10;
		Integer nota2 = 5;
		
		java.util.ArrayList<Double> precosList = new java.util.ArrayList<>();
		precosList.add(5.9);
		precosList.add(7.2);
		precosList.add(9.2);
		
		System.out.println(precosList.get(2));
		
	}

}
