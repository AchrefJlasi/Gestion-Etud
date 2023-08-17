package ma.enset.catalogue.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ma.enset.catalogue.dao.ICatalogueDAO;

import ma.enset.catalogue.entities.etudiant;

public class CatalogueMetierImpl implements ICatalogueMetier {
	private ICatalogueDAO dao;

	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addEtudiant(etudiant E) {
		// TODO Auto-generated method stub
		dao.addEtudiant(E);
		
	}

	@Override
	public List<etudiant> listEtudiant() {
		// TODO Auto-generated method stub
		return dao.listEtudiant();
	}

	@Override
	public void deleteEtudiant(Long idP) {
		// TODO Auto-generated method stub
		dao.deleteEtudiant(idP);
	}

	@Override
	public etudiant editEtudiant(Long idP) {
		// TODO Auto-generated method stub
		return dao.editEtudiant(idP);
	}

	@Override
	public void updateEtudiant(etudiant E) {
		// TODO Auto-generated method stub
		dao.updateEtudiant(E);
	}

	@Override
	public List<etudiant> chercherEtudiant(String motCle) {
		// TODO Auto-generated method stub
		return dao.chercherEtudiant(motCle);
	}
	

}