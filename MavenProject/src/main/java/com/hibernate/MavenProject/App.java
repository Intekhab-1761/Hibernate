package com.hibernate.MavenProject;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static Session session;

	public static void main(String[] args) {
		try {
			
			System.out.println("Project started");
			Configuration cfg = new Configuration();
			cfg.configure("cfg.xml");

			SessionFactory factory = cfg.buildSessionFactory();
			
			Students st=new Students(2,"John","CSE");
			session= factory.openSession();
			Transaction tx= session.beginTransaction();
			session.save(st);
			tx.commit();
			
			} catch (HibernateException e) {
			System.out.println(e);
		}finally {
			session.close();
		}
	}
}