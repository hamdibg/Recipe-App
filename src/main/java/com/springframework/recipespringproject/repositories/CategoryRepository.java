package com.springframework.recipespringproject.repositories;

import com.springframework.recipespringproject.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface CategoryRepository extends CrudRepository<Category, Long> {
}
