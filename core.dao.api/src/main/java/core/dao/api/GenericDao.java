package core.dao.api;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, ID extends Serializable> {

	public List<T> findAll();

	public List<T> findByExample(T exampleInstance, String[] excludeProperty);

	public T find(Long id);
	
	public void save(T entity);
	
	public void update(T entity);

	public void delete(T entity);

}