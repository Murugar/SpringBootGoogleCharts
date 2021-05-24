package com.iqmsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iqmsoft.model.Item;
import com.iqmsoft.service.ItemService;

@Controller
public class GraphController {

    @Autowired
    private ItemService service;
	
	@RequestMapping({ "/" })
	public String index() {
		return "index";
	}
	
	@RequestMapping("/histo")
	public String index2() {
		return "histo";
	}
	
	@RequestMapping("/data")
	@ResponseBody
	public List<Item> data() {
		return service.getProducts();
	}

}
