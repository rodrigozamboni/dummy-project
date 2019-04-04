package br.com.confidence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyApplication {

	public static void main(String[] args) {
		System.out.println("TESTE");
		SpringApplication.run(DummyApplication.class, args);
	}
}
