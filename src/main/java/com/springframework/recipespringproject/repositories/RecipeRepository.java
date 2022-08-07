package com.springframework.recipespringproject.repositories;

import com.springframework.recipespringproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
