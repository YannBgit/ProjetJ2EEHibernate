package amis.dao;

import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ConnectDB
{
	private static SessionFactory sessionFactory = null;
	
	public ConnectDB()
	{
		File configFile = new File("hibernate.cfg.xml");
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure(configFile)
				.build();
		
		sessionFactory = new MetadataSources(registry)
				.buildMetadata()
				.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			new ConnectDB();
		}
		
		return sessionFactory;
	}
}