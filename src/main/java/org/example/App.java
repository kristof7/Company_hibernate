package org.example;

import org.example.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App
{
    public static void main( String[] args )
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CompanyUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        entityManager.find();
//        entityManager.persist();


        Employee employee = new Employee();
        employee.setEmployeeAge(28);
        employee.setEmployeeName("Steve");

        entityManager.getTransaction().begin();

        entityManager.persist(employee);

        entityManager.getTransaction().commit();

        entityManagerFactory.close();

    }
}
