package com.niladri_pvt_ltd.basics.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.niladri_pvt_ltd.basics.dto.Person;

public class PersonDao {

	public void savePerson(Person person) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(person);
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			sessionFactory.close();
		}
	}
	public Person getPersonDetails(int id) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Person person = session.get(Person.class, id);
		return person;
	}
	public String updateDetails(int id,boolean status, String address) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Person person = session.get(Person.class, id);
		if(person!=null) {
			person.setStatus(status);
			person.setAddress(address);
			transaction.commit();
			return "update successfull";
		}
		else {
			return "update failed!";
		}
	}
	public void deletePerson(int id) {
		Person personDetails = getPersonDetails(id);
		if (personDetails!=null) {
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.delete(personDetails);
			transaction.commit();
		}
	}
	
}
