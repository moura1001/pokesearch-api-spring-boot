package com.example.pokesearch.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pokesearch.model.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
	
	List<Pokemon> findByName(String name);
	
	List<Pokemon> findByType1(String type1);
	
	List<Pokemon> findByGeneration(int generation);
	
	List<Pokemon> findByLegendary(boolean legendary);
}
