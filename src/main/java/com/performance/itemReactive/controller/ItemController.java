package com.performance.itemReactive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.performance.itemReactive.service.ItemService;
import com.performance.itemReactiveMockedDb.domain.Item;

import reactor.core.publisher.Flux;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;

	@GetMapping(path = "/items/{category}", produces="application/stream+json")
	public Flux<Item> getItemsbyCategory(@PathVariable String category) {

		return itemService.findByCategory(category);
	}

//	@PostMapping(path = "/items")
//	public Flux<Item> createBulkItems(@RequestBody Flux<Item> itemFlux) {
//
//		return itemService.createAllItems(itemFlux);
//	}
	
	@GetMapping(path = "/health")
	public String getHealth() {

		return "UP";
	}

}
