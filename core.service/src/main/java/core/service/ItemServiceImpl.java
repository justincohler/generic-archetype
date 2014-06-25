package core.service;

import core.dao.api.ItemDao;
import core.service.api.ItemService;
import domain.api.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;

	public Item find(Long id) {
		return itemDao.find(id);
	}
	
	// Injector
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
}
