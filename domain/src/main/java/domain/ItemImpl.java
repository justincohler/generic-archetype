package domain;

import domain.api.Item;

public class ItemImpl implements Item {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
