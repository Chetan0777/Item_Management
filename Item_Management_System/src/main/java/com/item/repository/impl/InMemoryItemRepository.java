package com.item.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.item.entity.Item;
import com.item.repository.ItemRepository;

@Repository
public class InMemoryItemRepository implements ItemRepository{

	List<Item> items = new ArrayList<>();
	
	@Override
	public void addItem(Item item) {
		
		items.add(item);
		
	}

	@Override
	public Item getItemById(Integer id) {
		
		return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
		
	}

}
