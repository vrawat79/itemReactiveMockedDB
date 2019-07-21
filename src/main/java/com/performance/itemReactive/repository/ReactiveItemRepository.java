package com.performance.itemReactive.repository;



import org.springframework.stereotype.Component;

import com.performance.itemReactive.domain.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ReactiveItemRepository {
	
	public Flux<Item> findByCategory(String category){
		
		
		return null;
	}

	public Flux<Item> saveAll(Flux<Item> items) {
		// TODO Auto-generated method stub
		return null;
	}

	public Mono<Item> save(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

}
