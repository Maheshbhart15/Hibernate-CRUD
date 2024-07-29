package com.Hibernate;

import com.Hibernate.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.spi.Configurable;

import java.util.Map;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        System.out.printf("Enter the course Description ,course_name , prize  ");
        Scanner sc = new Scanner(System.in);

        Course course =Course.builder().
                description(sc.next()).
                name(sc.next()).
                price(sc.next()).
                build();
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session=sessionFactory.openSession();

        Transaction trs=session.beginTransaction();
        session.save(course);

        trs.commit();
        session.close();



    }
}
