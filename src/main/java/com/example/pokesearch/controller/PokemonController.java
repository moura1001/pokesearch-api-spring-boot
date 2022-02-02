package com.example.pokesearch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pokesearch.model.entity.PokeFilter;
import com.example.pokesearch.model.entity.Pokemon;
import com.example.pokesearch.model.repository.PokemonRepository;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {

	@Autowired
    private PokemonRepository pokemonRepository;
	
	@GetMapping("/find/{filtro}/{value}")
    public List<Pokemon> findByFiltro(@PathVariable("filtro") PokeFilter filtro,
    								@PathVariable("value") String value) {
	    
    	
    	List<Pokemon> pokemons = new ArrayList<Pokemon>();
    	
    	switch(filtro) {
    		case NAME:
    			pokemons = pokemonRepository.findAllByNameLikeIgnoreCase("%"+value+"%");
    			break;
    		
    		case TYPE1:
    			pokemons = pokemonRepository.findAllByType1LikeIgnoreCase("%"+value+"%");
    			break;
    		
    		case GENERATION:
    			try {
    				int gen = Integer.valueOf(value);
    				pokemons = pokemonRepository.findAllByGeneration(gen);
    			} catch(NumberFormatException e) {}
    			break;
    		
    		case LEGENDARY:
    			pokemons = pokemonRepository.findAllByLegendary(Boolean.valueOf(value));
    			break;
    	}
    	
    	return pokemons;
	}
}
