package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Empresa;
import interfaces.IEmpresaRepository;

public class EmpresaRepository implements IEmpresaRepository {

	private Connection connection;

	public EmpresaRepository(Connection connection) {
		this.connection = connection;
	}
	
	//---------------------------------------------------------------------------------------//
	
	@Override
	public void create(Empresa empresa) throws Exception {
		String query = "insert into empresa values(null, ?, ?)";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, empresa.getRazaoSocial());
		statement.setString(2, empresa.getCnpj());
		statement.execute();
		statement.close();

	}

	@Override
	public void update(Empresa empresa) throws Exception {
		String query = "update empresa set razaosocial = ?, cnpj = ? where idempresa = ? ";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setString(1, empresa.getRazaoSocial());
		statement.setString(2, empresa.getCnpj());
		statement.setInt(3, empresa.getIdEmpresa());
		statement.execute();
		statement.close();

	}

	@Override
	public void delete(Empresa empresa) throws Exception {
		String query = "delete from empresa where idempresa = ?";

		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, empresa.getIdEmpresa());
		statement.execute();
		statement.close();

	}

	@Override
	public List<Empresa> findAll() throws Exception {
		String query = "select * from empresa";

		PreparedStatement statement = connection.prepareStatement(query);
		ResultSet result = statement.executeQuery();

		List<Empresa> lista = new ArrayList<Empresa>();
		while (result.next()) {
			Empresa empresa = new Empresa();
			empresa.setIdEmpresa(result.getInt("idempresa"));
			empresa.setRazaoSocial(result.getString("razaosocial"));
			empresa.setCnpj(result.getString("cnpj"));

			lista.add(empresa);

		}

		return lista;
	}

}
