package teste;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Bradesco", "Platinum");
		
		PlanoDeSaudeDAO dao = new PlanoDeSaudeDAO();
		dao.gravar(plano1);
		dao.gravar(plano2);
		
		System.out.println(dao.listarTodos());
		
		
	}

}
