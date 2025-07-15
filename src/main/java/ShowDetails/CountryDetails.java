package ShowDetails;

import java.util.List;
import App.HibernateUtil;
import Entity1.CountryClass;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CountryDetails
{
    public void showCountry(CountryClass country) 
    {
        EntityTransaction tra = null;
        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) 
        {
            tra = entityManager.getTransaction();
            tra.begin(); 
            entityManager.persist(country);  

            tra.commit();  
            System.out.println("Country inserted successfully.");
        }
        catch (Exception e)
        {
            if (tra != null && tra.isActive()) tra.rollback();
            e.printStackTrace();
        }
    }

    
    public List<CountryClass> getAll() 
    {
        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager())
        {
            return entityManager.createQuery("from CountryClass", CountryClass.class).getResultList();
        }
    }

    
    public void updateCountry(int updateId, String new_country_capital) 
    {
        EntityTransaction tx = null;
        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) 
        {
            tx = entityManager.getTransaction();
            tx.begin();

            CountryClass country = entityManager.find(CountryClass.class, updateId);
            if (country != null) 
            {
                country.setCountry_capital(new_country_capital);
                entityManager.merge(country);
                System.out.println("Capital updated.");
            } else {
                System.out.println("Country not found.");
            }

            tx.commit();
        }
        catch (Exception e) 
        {
            if (tx != null && tx.isActive()) tx.rollback();
            e.printStackTrace();
        }
    }

    public void updatePopulation(int id, long newPopulation) {
        EntityTransaction tx = null;
        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
            tx = entityManager.getTransaction();
            tx.begin();

            CountryClass country = entityManager.find(CountryClass.class, id);
            if (country != null) {
                country.setPopul(newPopulation);
                entityManager.merge(country);
                System.out.println(" Population updated successfully.");
            } else {
                System.out.println(" Country not found.");
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            e.printStackTrace();
        }
    }

    public void delConuntry(int deleteId)
    {
        EntityTransaction tx = null;
        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) 
        {
            tx = entityManager.getTransaction();
            tx.begin();

            CountryClass country = entityManager.find(CountryClass.class, deleteId);
            if (country != null)
            {
                entityManager.remove(country);
                System.out.println(" Country removed.");
            } else {
                System.out.println(" Country not found.");
            }

            tx.commit();
        }
        catch (Exception e)
        {
            if (tx != null && tx.isActive()) tx.rollback();
            e.printStackTrace();
        }
    }
}
