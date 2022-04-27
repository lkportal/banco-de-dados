package model.DAO;

import java.util.List;

import modal.entities.Vendedores;

public interface VendedoresDao {

	void insert(Vendedores obj);

	void update(Vendedores obj);

	void deletbyID(Integer id);

	Vendedores findId(Integer id);

	List<Vendedores> findAll();
}
