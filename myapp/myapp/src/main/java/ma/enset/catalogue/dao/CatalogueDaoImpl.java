package ma.enset.catalogue.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.enset.catalogue.entities.etudiant;

public class CatalogueDaoImpl implements ICatalogueDAO {
	@PersistenceContext
	private EntityManager entityManager;










	@Override
	public void addEtudiant(etudiant E) {
		// TODO Auto-generated method stub
		entityManager.persist(E);
		
	}

	@Override
	public List<etudiant> listEtudiant() {
		Query req=entityManager.createQuery("select E from etudiant e");
		return req.getResultList();
	
	}

	@Override
	public void deleteEtudiant(Long idP) {
		// TODO Auto-generated method stub
		etudiant e= entityManager.find(etudiant.class, idP);
		entityManager.remove(e);
		
	}

	@Override
	public etudiant editEtudiant(Long idP) {
		etudiant e =entityManager.find(etudiant.class, idP);
		return e;
	}

	@Override
	public void updateEtudiant(etudiant E) {
		entityManager.merge(E);
		
	}

	@Override
	public List<etudiant> chercherEtudiant(String motCle) {
		Query req=entityManager.createQuery("select E from etudiant E where E.nomProduit like :x");
		req.setParameter("x", "%"+motCle+"%");
		return req.getResultList();
	}
}