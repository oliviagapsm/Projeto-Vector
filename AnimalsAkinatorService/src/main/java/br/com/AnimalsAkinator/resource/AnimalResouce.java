package br.com.AnimalsAkinator.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.AnimalsAkinator.AnimalsAkinatorApplication;
import br.com.AnimalsAkinator.entidade.Animal;
import br.com.AnimalsAkinator.service.AnimalService;

@RestController
@RequestMapping(value = "/animal")
public class AnimalResouce {

	@Autowired
	private AnimalService animalService;
	
	@GetMapping(value = "/buscar-todos")
	public ResponseEntity<List<Animal>> buscarTodos(){
		return ResponseEntity.ok().body(animalService.buscarTodos());
		
	}
	
	@PostMapping(value = "/inserir-animal")
	public ResponseEntity<Void> inserir(@Valid @RequestBody Animal animal){
		animalService.inserir(animal);
		return ResponseEntity.ok(null);
	}
}
