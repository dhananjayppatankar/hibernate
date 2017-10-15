package com.spring.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	
    	System.out.println("Main method is called for Hubernate");
    	Employee emp = new Employee();
    	Employee emp1 = new Employee();
    	
//    	emp1.setEid(3);
//    	emp1.setEname("Dhananjay -2");
//    	emp1.setEsalary(1100.90);
    	
    	Configuration  config = new Configuration().configure().addAnnotatedClass(Employee.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tr = session.beginTransaction();
    	
    	//session.save(emp1);
    	emp = session.get(Employee.class, 3);
    
    	tr.commit();
    	
    	System.out.println(emp.toString());
    	
    	
    	
    }
}
