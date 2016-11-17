package Respository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.TblUser;

public class UserDataRepository {
		
		public String foo() {
			EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Web.Data");
			EntityManager em = emf.createEntityManager();
			
			 Query q = em.createQuery("SELECT t FROM TblUser t");
             List<TblUser> userList = q.getResultList();
                     
             String data =null;
             
              for (TblUser user : userList) {
                     data += user.getName() + " , ";
                }
              
			return data;

		}
		
		public  List<TblUser> GetUser() {
			EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("Web.Data");
			EntityManager em = emf.createEntityManager();
			
			 Query q = em.createQuery("SELECT t FROM TblUser t");
             List<TblUser> userList = q.getResultList();
                     
            
              
			return userList;

		}
}
