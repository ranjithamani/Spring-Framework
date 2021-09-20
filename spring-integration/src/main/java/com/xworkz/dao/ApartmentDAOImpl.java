package com.xworkz.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.apartment.ApartmentEntity;

@Component
public class ApartmentDAOImpl implements ApartmentDAO {

	@Autowired
	private SessionFactory factory;

	public ApartmentDAOImpl(SessionFactory sessionFactory) {
		this.factory = sessionFactory;
		System.out.println(this.getClass().getSimpleName() + "bean created");
	}

	@Override
	public void save(ApartmentEntity entity) {

		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			session.save(entity);
			session.flush();
			session.clear();

			trans.commit();
		}

	}
}
