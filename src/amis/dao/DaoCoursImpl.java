package amis.dao;

import java.util.List;
import org.hibernate.Session;
import amis.entity.Cours;

public class DaoCoursImpl implements DaoCours
{
	@Override
	public void inserer(Cours cours)
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		session.merge(cours) ;
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Cours cours)
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		session.remove(cours) ;
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void maj(Long idAModifier, Cours nouveau)
	{		
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		Cours c = session.find(Cours.class, idAModifier);
		c.copieCours(nouveau);
		
		session.refresh(c);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Cours trouverParId(Long coursId) 
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		Cours c = session.find(Cours.class, coursId);
		
		session.close();
		
		return c;
	}

	@Override
	public List<Cours> trouverTout()
	{		
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		List<Cours> listeC = session.createQuery("SELECT c FROM Cours c").getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return listeC;
	}
}