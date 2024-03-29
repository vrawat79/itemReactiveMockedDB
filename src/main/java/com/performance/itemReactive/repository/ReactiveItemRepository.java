package com.performance.itemReactive.repository;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.performance.itemReactiveMockedDb.domain.Item;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ReactiveItemRepository {

//	@Value("${mockedDBServicehost}")
	@Value("54.186.12.241")
	String mockedDbServiceHost;

	String url;
	WebClient webClient;

//	public ReactiveItemRepository() {
//		// TODO Auto-generated constructor stub
//		this.url = "http://" + mockedDbServiceHost + ":8080/items";
//		this.webClient = WebClient.builder().baseUrl(url).build();       
//	}

	@PostConstruct
	private void postConstruct() {
		System.out.println("url: " + url);
		this.url = "http://" + mockedDbServiceHost + ":8080/items";
		this.webClient = WebClient.builder().baseUrl(url).build();
		System.out.println("url: " + url);
	}

	public Flux<Item> findByCategory(String category) {
		if(category.equalsIgnoreCase("catalogue")) {
			return webClient.get().uri("/stream/" + category).exchange().flatMapMany(response -> response.bodyToFlux(Item.class));
		}
		return webClient.get().uri("/" + category).exchange().flatMapMany(response -> response.bodyToFlux(Item.class));
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
