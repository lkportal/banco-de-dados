package model.DAO;

import java.util.List;

import modal.entities.Departamento;

public interface DepartamanetoDao {
	void insert(Departamento obj);

	void update(Departamento obj);

	void deletbyID(Integer id);

	Departamento findId(Integer id);

	List<Departamento> findAll();
}
