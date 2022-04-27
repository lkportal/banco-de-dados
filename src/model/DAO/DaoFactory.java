package model.DAO;

import modal.JDBC.impl.VendedorJDBC;
import modal.entities.Vendedores;

public class DaoFactory {
	
	
	public static VendedoresDao createVendedores() {
		return new VendedorJDBC();
	}
}
