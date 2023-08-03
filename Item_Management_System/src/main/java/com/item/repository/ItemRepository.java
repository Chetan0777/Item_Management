package com.item.repository;

import com.item.entity.Item;

public interface ItemRepository {
    
	void addItem(Item item);
    Item getItemById(Integer id);
    
}

