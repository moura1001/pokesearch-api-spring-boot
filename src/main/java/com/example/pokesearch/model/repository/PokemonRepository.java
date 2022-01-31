package com.example.pokesearch.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pokesearch.model.entity.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
	
	List<Pokemon> findAllByNameLikeIgnoreCase(String name);
	
	List<Pokemon> findAllByType1LikeIgnoreCase(String type1);
	
	List<Pokemon> findAllByGeneration(int generation);
	
	List<Pokemon> findAllByLegendary(boolean legendary);
}
