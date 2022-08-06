package com.springframework.recipespringproject.repositories;

import com.springframework.recipespringproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
