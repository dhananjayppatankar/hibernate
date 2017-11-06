package com.spring.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App2 {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please select the Java Test out of the following");
		System.out.println("1. 50 Marks........ ");
		System.out.println("2. 75 Marks........ ");
		System.out.println("3. 100 Marks........ ");
		int choice = scan.nextInt();
		scan.nextLine();
		String que = App2.getQuestions(choice);
		System.out.println(que);

	}

	public static String getQuestions(int choice) {

		int count = 0;

		Configuration config = new Configuration().configure().addAnnotatedClass(Questions.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();

		if (choice == 1) {
			System.out.println("*********************************************************************");
			System.out.println("Java Test Questions  --------   50 Marks --------------");
			System.out.println(" ********************************************************************");
			while (count < 50) {
				// Get random id with questions from 1 to 9
				int id = (int) (Math.floor((Math.random() * 9)) + 1);
				// Get marks with associated with these ids.
				Questions q = session.get(Questions.class, id);
				System.out.println();
				System.out.println();
				
				System.out.println(q.getQuestion());
				System.out.println("Marks : " + q.getMarks());
				count = count + q.getMarks();
				
			}

		} else if (choice == 2) {
			System.out.println("*********************************************************************");
			System.out.println("Java Test Questions  --------   75 Marks --------------");
			System.out.println(" ********************************************************************");
			while (count < 75) {
				// Get random id with questions from 1 to 9
				int id = (int) (Math.floor((Math.random() * 9)) + 1);
				// Get marks with associated with these ids.
				Questions q = session.get(Questions.class, id);
				System.out.println();
				System.out.println();
				
				System.out.println(q.getQuestion());
				System.out.println("Marks : " + q.getMarks());
				count = count + q.getMarks();
				
			}

		} else {
			System.out.println("*********************************************************************");
			System.out.println("Java Test Questions  --------   100 Marks --------------");
			System.out.println(" ********************************************************************");
			while (count < 100) {
				// Get random id with questions from 1 to 9
				int id = (int) (Math.floor((Math.random() * 9)) + 1);
				// Get marks with associated with these ids.
				Questions q = session.get(Questions.class, id);
				System.out.println();
				System.out.println();
				
				System.out.println(q.getQuestion());
				System.out.println("Marks : " + q.getMarks());
				count = count + q.getMarks();
				
			}

		}

		tr.commit();

		return "";
	}

}
