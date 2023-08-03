package com.item.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.item.entity.Item;
import com.item.exception.ItemNotFoundException;
import com.item.repository.ItemRepository;
import com.item.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
    ItemRepository itemRepository;

    @Override
    public void addItem(Item item) {
        
        itemRepository.addItem(item);
        
    }


	@Override
	public Item getItemById(Integer id) throws ItemNotFoundException {
		
		Item item = itemRepository.getItemById(id);
        if (item == null) {
            throw new ItemNotFoundException("Item with ID " + id + " not found.");
        }
        return item;
		
	}
}
