package core.dao.factory;

import org.hibernate.Session;

import core.dao.GenericHibernateDaoImpl;
import core.dao.ItemHibernateDaoImpl;
import core.dao.api.DaoFactory;
import core.dao.api.ItemDao;
import core.dao.util.HibernateUtil;

public class HibernateDaoFactory extends DaoFactory {  
	  
    public ItemDao getItemDao() {  
        return (ItemDao)instantiateDAO(ItemHibernateDaoImpl.class);  
    }  
  
  
    private GenericHibernateDaoImpl instantiateDAO(Class daoClass) {  
        try {  
            GenericHibernateDaoImpl dao = (GenericHibernateDaoImpl)daoClass.newInstance();  
            dao.setSession(getCurrentSession());  
            return dao;  
        } catch (Exception ex) {  
            throw new RuntimeException("Can not instantiate DAO: " + daoClass, ex);  
        }  
    }  
  
    // You could override this if you don't want HibernateUtil for lookup  
    protected Session getCurrentSession() {  
        return HibernateUtil.getSessionFactory().getCurrentSession();  
    }  
  
}  