package myfacade;


import entity.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.TypedQuery;

/**
 *
 * @author andre
 */
public class MyFacade
{

    EntityManagerFactory emf;

    public MyFacade(EntityManagerFactory emf)
    {
        this.emf = emf;
    }

    private EntityManager getEntityManager()
    {
        return emf.createEntityManager();
    }

    public List<Person> getAllPersonsFromAmount(int amount)
    {
        EntityManager em = getEntityManager();

        List<Person> persons = null;
        try
        {
            em.getTransaction().begin();
            TypedQuery<Person> qt = em.createQuery("select p from Person p", Person.class);
            persons = qt.setMaxResults(amount).getResultList();

            em.getTransaction().commit();
            return persons;
        } finally
        {
            em.close();
        }
    }


}
