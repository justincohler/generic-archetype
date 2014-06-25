package core.dao.api;

public abstract class DaoFactory {  
	  
    /** 
     * Factory method for instantiation of concrete factories. 
     * @param <T>
     */  
    public static <T> DaoFactory instance(Class<T> factory) {  
        try {  
            return (DaoFactory)factory.newInstance();  
        } catch (Exception ex) {  
            throw new RuntimeException("Couldn't create DAOFactory: " + factory);  
        }  
    }  
  
    // Add abstracted Dao interfaces here  
    public abstract ItemDao getItemDao();  
}  