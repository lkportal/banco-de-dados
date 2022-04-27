package modal.entities;

import java.io.Serializable;
import java.util.Objects;

public class Departamento implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nome;

	public Departamento() {

	}

	public Departamento(Integer iD, String nome) {

		ID = iD;
		this.nome = nome;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Departamento [ID=" + ID + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(ID, other.ID);
	}

}
