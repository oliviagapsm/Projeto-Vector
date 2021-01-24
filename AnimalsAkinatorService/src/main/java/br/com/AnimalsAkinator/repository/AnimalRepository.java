package br.com.AnimalsAkinator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.AnimalsAkinator.entidade.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>{

}
