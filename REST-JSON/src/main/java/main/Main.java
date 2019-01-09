package main;

import entity.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.eclipse.persistence.jaxb.compiler.Generator;


/**
 *
 * @author andre
 */
public class Main
{

    public static void main(String[] args)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        

        Person p1 =  new Person("Mike1", "Samson1", 43);
        Person p2 =  new Person("Mike2", "Samson2", 43);
        Person p3 =  new Person("Mike3", "Samson3", 43);
        Person p4 =  new Person("Mike4", "Samson4", 43);
        Person p5 =  new Person("Mike5", "Samson5", 43);
        Person p6 =  new Person("Mike6", "Samson6", 43);
        Person p7 =  new Person("Mike7", "Samson7", 43);
        Person p8 =  new Person("Mike8", "Samson8", 43);
        Person p9 =  new Person("Mike9", "Samson9", 43);
        Person p10 = new Person("Mike10", "Samson10", 43);
        Person p11 = new Person("Mike11", "Samson11", 43);
        Person p12 = new Person("Mike12", "Samson12", 43);
        Person p13 = new Person("Mike13", "Samson13", 43);
        Person p14 = new Person("Mike14", "Samson14", 43);
        Person p15 = new Person("Mike15", "Samson15", 43);
        Person p16 = new Person("Mike16", "Samson16", 43);
        Person p17 = new Person("Mike17", "Samson17", 43);
        Person p18 = new Person("Mike18", "Samson18", 43);
        Person p19 = new Person("Mike19", "Samson19", 43);
        Person p20 = new Person("Mike20", "Samson20", 43);
        Person p21 = new Person("Mike21", "Samson21", 43);
        Person p22 = new Person("Mike22", "Samson22", 43);
        Person p23 = new Person("Mike23", "Samson23", 43);
        Person p24 = new Person("Mike24", "Samson24", 43);
        Person p25 = new Person("Mike25", "Samson25", 43);
        Person p26 = new Person("Mike26", "Samson26", 43);
        Person p27 = new Person("Mike27", "Samson27", 43);
        Person p28 = new Person("Mike28", "Samson28", 43);
        Person p29 = new Person("Mike29", "Samson29", 43);
        Person p30 = new Person("Mike30", "Samson30", 43);
        
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);
        em.persist(p6);
        em.persist(p7);
        em.persist(p8);
        em.persist(p9);
        em.persist(p10);
        em.persist(p11);
        em.persist(p12);
        em.persist(p13);
        em.persist(p14);
        em.persist(p15);
        em.persist(p16);
        em.persist(p17);
        em.persist(p18);
        em.persist(p19);
        em.persist(p21);
        em.persist(p22);
        em.persist(p23);
        em.persist(p24);
        em.persist(p25);
        em.persist(p26);
        em.persist(p27);
        em.persist(p28);
        em.persist(p29);
        em.persist(p30);
        em.persist(p20);
        
        
        em.getTransaction().commit();
        em.close();
        

    }

}
