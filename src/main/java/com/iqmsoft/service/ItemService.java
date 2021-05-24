package com.iqmsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iqmsoft.model.Item;
import com.iqmsoft.repos.ItemRepository;


@Service
@Transactional
public class ItemService {

	@Autowired
    private ItemRepository repo;
	
    public List<Item> getProducts() {
        return repo.findAll();
    }

}
