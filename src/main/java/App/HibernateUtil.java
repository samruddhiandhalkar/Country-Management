package App;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil
{

			private static final EntityManagerFactory entityManagerFactory;
			static
			{
				try 
				{
					entityManagerFactory=Persistence.createEntityManagerFactory("Country_Mag");
				}
				catch(Throwable e) 
				{ 
					throw new ExceptionInInitializerError(e);
				}
			}

			public static EntityManagerFactory getEntityManagerFactory()
			{
				return entityManagerFactory;
			}
			public static void shutDown() 
			{
				if(entityManagerFactory!=null && entityManagerFactory.isOpen()) 
				{
					entityManagerFactory.close();
				}
			}
	}


