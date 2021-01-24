package br.com.AnimalsAkinator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.AnimalsAkinator.config.CargaConfig;

@SpringBootApplication
public class AnimalsAkinatorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(AnimalsAkinatorApplication.class, args);
	}

}
