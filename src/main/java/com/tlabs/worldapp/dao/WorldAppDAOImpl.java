package com.tlabs.worldapp.dao;

import java.util.List;
import java.util.stream.Collector;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tlabs.worldapp.entity.Country;
import com.tlabs.worldapp.util.CalculationUtil;

@Repository
@Transactional
public class WorldAppDAOImpl implements WorldAppDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Country> getAllCountries() {
		
		String hql = "FROM Country";
		
		//return (List<Article>) entityManager.createQuery(hql).getResultList();
		
		List<Country> list = entityManager.createQuery(hql).getResultList();
		
		return list;
	}
	
	

}
