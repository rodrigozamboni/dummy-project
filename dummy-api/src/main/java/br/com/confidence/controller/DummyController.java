package br.com.confidence.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	public DummyController() {
	}

	@GetMapping("/teste")
	public String teste() {
		return "SUCESSO";
	}

}
