package interfaces;

import java.util.List;

import entities.Empresa;

public interface IEmpresaRepository {
	
	void create(Empresa empresa) throws Exception;
	void update(Empresa empresa) throws Exception;
	void delete(Empresa empresa) throws Exception;
	List<Empresa> findAll() throws Exception;

}
