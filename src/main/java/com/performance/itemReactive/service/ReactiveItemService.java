package com.performance.itemReactive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.performance.itemReactive.repository.ReactiveItemRepository;
import com.performance.itemReactiveMockedDb.domain.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ReactiveItemService implements ItemService {

	@Autowired
	private ReactiveItemRepository reactiveItemRepo;

	@Override
	public Flux<Item> findByCategory(String category) {
		// TODO Auto-generated method stub
		return reactiveItemRepo.findByCategory(category);
	}

//	@Override
//	public Flux<Item> createAllItems(Flux<Item> items) {
//		// TODO Auto-generated method stub
//		return reactiveItemRepo.saveAll(items);
//	}
//
//	@Override
//	public Mono<Item> createItem(Item item) {
//		// TODO Auto-generated method stub
//		return reactiveItemRepo.save(item);
//	}


}
