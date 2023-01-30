package amis.dao;

import java.util.List;
import org.hibernate.Session;
import amis.entity.Etudiant;

public class DaoEtudiantImpl implements DaoEtudiant
{	
	@Override
	public void inserer(Etudiant etudiant)
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		session.merge(etudiant) ;
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Etudiant etudiant)
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		session.remove(etudiant) ;
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void maj(Long idAModifier, Etudiant nouveau)
	{		
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		Etudiant e = session.find(Etudiant.class, idAModifier);
		e.copieEtudiant(nouveau);
		
		session.refresh(e);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Etudiant trouverParId(Long etudiantId) 
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		Etudiant e = session.find(Etudiant.class, etudiantId);
		
		session.close();
		
		return e;
	}

	@Override
	public List<Etudiant> trouverTout()
	{		
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		List<Etudiant> listeE = session.createQuery("SELECT e FROM Etudiant e").getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return listeE;
	}
}