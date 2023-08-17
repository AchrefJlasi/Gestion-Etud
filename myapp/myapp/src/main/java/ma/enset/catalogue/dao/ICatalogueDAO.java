package ma.enset.catalogue.dao;

import java.util.List;


import ma.enset.catalogue.entities.etudiant;

public interface ICatalogueDAO {
	public void addEtudiant(etudiant E);
	public List<etudiant> listEtudiant();
	public void deleteEtudiant(Long idP);
	public etudiant editEtudiant(Long idP);
	public void updateEtudiant(etudiant E);
	public List<etudiant> chercherEtudiant(String motCle);
}
