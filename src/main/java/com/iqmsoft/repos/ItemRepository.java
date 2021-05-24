package com.iqmsoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iqmsoft.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{

	
}
