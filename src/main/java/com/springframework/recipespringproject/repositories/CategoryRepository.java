package com.springframework.recipespringproject.repositories;

import com.springframework.recipespringproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
