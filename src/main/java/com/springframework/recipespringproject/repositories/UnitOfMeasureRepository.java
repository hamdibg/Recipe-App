package com.springframework.recipespringproject.repositories;

import com.springframework.recipespringproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
