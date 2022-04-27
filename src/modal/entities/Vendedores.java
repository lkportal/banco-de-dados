package modal.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Vendedores implements Serializable {
   
	

	private static final long serialVersionUID = 1L;
	private Integer id ;
	private String nome;
	private String email;
	private Date aniversario;
	private Double salario;
	
	private Departamento depart;
	
	
	
	public Vendedores() {
		
	}



	public Vendedores(Integer id, String nome, String email, Date aniversario, Double salario, Departamento depart) {
		
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
		this.salario = salario;
		this.depart = depart;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getAniversario() {
		return aniversario;
	}



	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}



	public Double getSalario() {
		return salario;
	}



	public void setSalario(Double salario) {
		this.salario = salario;
	}



	public Departamento getDepart() {
		return depart;
	}



	public void setDepart(Departamento depart) {
		this.depart = depart;
	}



	@Override
	public String toString() {
		return "Vendedores [id=" + id + ", nome=" + nome + ", email=" + email + ", aniversario=" + aniversario
				+ ", salario=" + salario + ", depart=" + depart + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendedores other = (Vendedores) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
