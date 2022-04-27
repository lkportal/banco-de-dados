package application;

import java.util.Date;

import modal.entities.Departamento;
import modal.entities.Vendedores;

public class Programa {

	public static void main(String[] args) {
	
		
		Departamento dep = new Departamento(1,"Loja de roupas");
		Vendedores vend = new Vendedores(20,"maria","maria@gmail.com",new Date(),3000.00,dep);
		System.out.println(vend);

	}

}
