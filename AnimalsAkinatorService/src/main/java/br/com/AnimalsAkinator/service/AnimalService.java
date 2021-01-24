package br.com.AnimalsAkinator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.AnimalsAkinator.entidade.Animal;
import br.com.AnimalsAkinator.repository.AnimalRepository;

@Service
public class AnimalService {

	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> buscarTodos(){
		return animalRepository.findAll();
	}
	
	public void inserir(Animal animal) {
		animalRepository.save(animal);
	}
}
