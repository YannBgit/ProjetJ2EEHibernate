package amis.dao;

import java.util.List;
import org.hibernate.Session;
import amis.entity.Niveau;

public class DaoNiveauImpl implements DaoNiveau
{
	@Override
	public void inserer(Niveau niveau)
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		session.merge(niveau) ;
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void supprimer(Niveau niveau)
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		session.remove(niveau) ;
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void maj(Long idAModifier, Niveau nouveau)
	{		
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		Niveau n = session.find(Niveau.class, idAModifier);
		n.copieNiveau(nouveau);
		
		session.refresh(n);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public Niveau trouverParId(Long niveauId) 
	{
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		Niveau n = session.find(Niveau.class, niveauId);
		
		session.close();
		
		return n;
	}

	@Override
	public List<Niveau> trouverTout()
	{		
		Session session = ConnectDB.getSessionFactory().openSession();
		session.beginTransaction();
		
		List<Niveau> listeN = session.createQuery("SELECT n FROM Niveau n").getResultList();
		
		session.getTransaction().commit();
		session.close();
		
		return listeN;
	}
}