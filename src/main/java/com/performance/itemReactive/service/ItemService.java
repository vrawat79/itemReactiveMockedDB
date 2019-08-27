package com.performance.itemReactive.service;

import com.performance.itemReactiveMockedDb.domain.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ItemService {
	
	public Flux<Item> findByCategory(String category);
//	public Mono<Item> createItem(Item item);	
//	public Flux<Item> createAllItems(Flux<Item> items);

}
