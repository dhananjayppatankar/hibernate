package com.spring.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Main method is called for Hibernate");

		Configuration config = new Configuration().configure().addAnnotatedClass(Questions.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		
//		Questions q1 = new Questions();
//		q1.setQid(1);
//		q1.setMarks(10);
//		q1.setQuestion("Which will legally declare, construct, and initialize an array?\r\n" + 
//				"A. 	int [] myList = {\"1\", \"2\", \"3\"}\r\n" + 
//				"B. 	int [] myList = (5, 8, 2);\r\n" + 
//				"C. 	int myList [] [] = {4,9,7,0};\r\n" + 
//				"D. 	int myList [] = {4, 3, 7};");
//		
//		session.save(q1);
		
		
		Questions q = session.get(Questions.class, 1);
		System.out.println(q);
		
		
		
		
		
		tr.commit();

	}
}

// Employee emp = new Employee();
// Employee emp1 = new Employee();
// EmployeeDetails edetail = new EmployeeDetails();

// emp1.setEid(6);
// emp1.setEname("Dhananjay -16");
// emp1.setEsalary(6800.90);
// edetail.setEaddress("4906 Tolland Street");
// edetail.setEmpdetailid(5);
// emp1.setEmpdetails(edetail);
// session.save(student1);
// session.save(laptop1);
// session.save(laptop2);
// session.save(student1);
// session.save(edetail);
// session.save(emp1);
// emp = session.get(Employee.class, 3);

// Query q = session.createQuery("from Employee");
// List<Employee> employee = q.getResultList();
//
// for (Employee employee2 : employee) {
// System.out.println( employee2.getEmpdetails());
// }
//
//
//
// System.out.println(employee);
// Student student1 = new Student();
// Laptop laptop1 = new Laptop();
// laptop1.setLid(1);
// laptop1.setLmodel("Dell");
// Laptop laptop2 = new Laptop();
// laptop2.setLid(4);
// laptop2.setLmodel("Dell4");
//
// student1.setSid(1);
// student1.setSname("Dhananjay Patankar Prakash 1");
// student1.setLaptop(laptop2);
// List<Integer> lids = Arrays.asList(1,2,3);
//
// Query q = session.createQuery("from Laptop where lid in :lids");
// q.setParameter("lids", lids);
// List<Laptop> laps = q.getResultList();
// for(Laptop lap : laps) {
// System.out.println(lap);
// }
