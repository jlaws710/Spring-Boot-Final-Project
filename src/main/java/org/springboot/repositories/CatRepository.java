package org.springboot.repositories;

import org.springboot.models.cats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends CrudRepository<cats, Integer> {
    cats findById(int id);
    List<cats> findAll();
    void deleteById(int id);
}
