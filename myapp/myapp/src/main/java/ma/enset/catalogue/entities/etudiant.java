package ma.enset.catalogue.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class etudiant implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEtudiant;
	@NotEmpty
	@Size(min=3,max=60)
    private String prenomEtudiant; private String nomEtudiant;  private String classeEtudiant;
    private String numEtudiant;


	public int getIdEtudiant() {
		return idEtudiant;
	}


	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}


	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}


	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}


	public etudiant(int idEtudiant, String prenomEtudiant, String nomEtudiant, String classeEtudiant,String numEtudiant) {
		super();
		this.idEtudiant = idEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.classeEtudiant = classeEtudiant;
		 this.numEtudiant = numEtudiant;
	}
	public etudiant() {
		super();
		this.idEtudiant = idEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.classeEtudiant = classeEtudiant;
		 this.numEtudiant = numEtudiant;
	}
	


	public String getNomEtudiant() {
		return nomEtudiant;
	}


	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}


	public String getClasseEtudiant() {
		return classeEtudiant;
	}


	public void setClasseEtudiant(String classeEtudiant) {
		this.classeEtudiant = classeEtudiant;
	}


	public String getNumEtudiant() {
		return numEtudiant;
	}


	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}
    
  
}