package br.com.campanhas.config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.campanhas.domain.campanha;

	public class util {
		
		private EntityManagerFactory factory;
		
		private static util instance;

		private util() {
			this.factory = Persistence.createEntityManagerFactory("util");
		}

		public static synchronized util getInstance() {
			if (instance == null) {
				instance = new util();
				instance.new PopulatingDatabase(instance.factory).loadScriptSQL();
			}
			return instance;
		}
		
		public EntityManager getEntityManager() {
	        EntityManager entityManager = factory.createEntityManager();
	        return entityManager;
	    }
		
		class PopulatingDatabase {	
			
			private EntityManagerFactory factory;		
		
			public PopulatingDatabase(EntityManagerFactory factory) {
				this.factory = factory;
			}

			public void loadScriptSQL() {
				
				List<campanha> campanhas = new ArrayList<>();
				campanhas.add(new campanha("10% SPFC",123,new Date(),new Date()));
				campanhas.add(new campanha("10% PALMEIRAS",1234,new Date(),new Date()));
				campanhas.add(new campanha("10% SANTOS",12345,new Date(),new Date()));
				campanhas.add(new campanha("10% CORINTHIANS",123456,new Date(),new Date()));
				campanhas.add(new campanha("10% PORTUGUESA",1234567,new Date(),new Date()));

				campanhas.forEach(c -> setDefaultEntity(campanhas));		
			}
			
			private void setDefaultEntity(List<campanha> campanhas) {
				EntityManager em = factory.createEntityManager();
				em.getTransaction().begin();
				em.persist(campanhas);
				em.getTransaction().commit();
				em.close();		
			}  
		}
	}