package com.item.service;

import com.item.entity.Item;
import com.item.exception.ItemNotFoundException;

public interface ItemService {
    
	void addItem(Item item);
    Item getItemById(Integer id) throws ItemNotFoundException;
    
}

