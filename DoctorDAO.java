package study;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DoctorDAO 
{
	
	public void insert(int id, String name, String spec)
	{
		
		Session session=getSession();
		session.beginTransaction();
		
		DoctorPOJO obj=new DoctorPOJO(id,name, spec);
		
		session.save(obj);
		
		session.getTransaction().commit();
		
	}
	
	public void update(int id, String name) 
	{
		Session session=getSession();
		session.beginTransaction();
		
		DoctorPOJO obj=session.find(DoctorPOJO.class, id);
		obj.setDcoName(name);
		
		session.getTransaction().commit();
		
	}
	
	public void delete(int id) 
	{
		Session session=getSession();
		session.beginTransaction();
		
		DoctorPOJO obj=session.find(DoctorPOJO.class,id);
		session.delete(obj);
		
		session.getTransaction().commit();
		
		
	}
	
	
	
	public static Session getSession()
	{
		//READING the hibernate.cfg.xml  from the classpath 
		StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
		// Create MetadataSources
		MetadataSources sources = new MetadataSources(registry);
		// Create Metadata
		Metadata metadata = sources.getMetadataBuilder().build();
		// Create SessionFactory
		SessionFactory sessionFactory= metadata.getSessionFactoryBuilder().build();

		Session session = sessionFactory.openSession(); // start a transaction

		return session;
	}

	



	
}
