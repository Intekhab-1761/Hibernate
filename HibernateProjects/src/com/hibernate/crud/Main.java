package com.hibernate.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	private static Session session;
	public static void main(String[] args) {
try {
		Users user = new Users(1,"Intekhab","Qwerty");
		
		
		Configuration cfg = new Configuration();
		cfg.configure("cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(user);
		tx.commit();
		
		System.out.println("Transaction Completed");
}catch(HibernateException e){
	System.out.println(e);
}finally {
	session.close();
}	
	}
}
