package com.spring.demo;

import java.util.List;

import javax.persistence.Query;

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
        
    	
    	System.out.println("Main method is called for Hibernate");
    //	Employee emp = new Employee();
    	Employee emp1 = new Employee();
    	EmployeeDetails edetail = new EmployeeDetails();
    	
    	emp1.setEid(6);
    	emp1.setEname("Dhananjay -16");
    	emp1.setEsalary(6800.90);
    	edetail.setEaddress("4906 Tolland Street");
    	edetail.setEmpdetailid(5);
    	emp1.setEmpdetails(edetail);
    	
    	Configuration  config = new Configuration().configure().addAnnotatedClass(Employee.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tr = session.beginTransaction();
    	
    	//session.save(edetail);
    	//session.save(emp1);
    	//emp = session.get(Employee.class, 3);
    	
    	Query q = session.createQuery("from Employee where esalary>2000.0  ");
    	List<Employee> employee = q.getResultList();
    	
    	System.out.println(employee);
    		
    	tr.commit();
    	
    	
    	//System.out.println(emp.toString());
    	
    	
    	
    }
}
