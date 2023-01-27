package com.dailycodebuffer.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/fallback")
public class GateWayControllers {

	@GetMapping("/productservice")
	public String productservice() {
		return "Product Service Is down!";
	}
	@GetMapping("/orderService")
	public String orderService() {
		return "order Service Is down!";
	}
	@GetMapping("/paymentService")
	public String paymentService() {
		return "payment Service Is down!";
	}
}
