package br.com.AnimalsAkinator.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.AnimalsAkinator.entidade.Animal;
import br.com.AnimalsAkinator.repository.AnimalRepository;

@Configuration
public class CargaConfig {

	@Autowired
	private AnimalRepository animalRepository;
	
	@Bean
	public void iniciarCarga() {
		List<Animal> animais = new ArrayList<Animal>();
		
		Animal tubarao =  new Animal();
		tubarao.setNome("Tubarão");
		tubarao.setCaracteristicas("vive na agua");
		animais.add(tubarao);
		
		Animal macaco =  new Animal();
		macaco.setNome("Macaco");
		macaco.setCaracteristicas("vive em arvores");
		animais.add(macaco);
		
		animalRepository.saveAll(animais);
	}
}
