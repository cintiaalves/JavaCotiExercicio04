package principal;

import entities.Empresa;
import factories.ConnectionFactory;
import repositories.EmpresaRepository;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			ConnectionFactory factory = new ConnectionFactory();
			EmpresaRepository empresaRepository = new EmpresaRepository(factory.getConnection());
			
			//------------------------------------------------------------------------------------//
			
			Empresa empresa = new Empresa(null, "Salão Catarrento Ltda", "1651561-41616");
			
			empresaRepository.create(empresa);
			
			System.out.println("Empresa cadastrada com sucesso");
		}

		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		
	}

}
