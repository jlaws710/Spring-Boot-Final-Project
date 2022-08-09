package org.springboot.controller;

import org.springboot.models.cats;
import org.springboot.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class Routes {
    @Autowired
    private CatRepository catRepository;
    @CrossOrigin(origins = "http://localhost:8000")
    @GetMapping("/cats")
    public List<cats> list() {
        return catRepository.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/cats/{id}")
    public cats getCatsById(
            @PathVariable(value = "id") int id) {
        return catRepository.findById(id);
    }
    //@CrossOrigin(origins = "*")
    @PostMapping("/cats")
    @ResponseStatus(HttpStatus.CREATED)
    public cats createCats(
       @RequestBody cats catsBody) {
       return catRepository.save(catsBody);
    }

    //@CrossOrigin(origins = "*")
    @DeleteMapping("/cats/{id}")
    public void deleteCats(
            @PathVariable (value = "id") int id) {
        catRepository.deleteById(id);
    }

    //@CrossOrigin(origins = "*")
    @PutMapping("/cats/{id}")
    public ResponseEntity<Object> updateCats(
            @RequestBody cats catsBody,
            @PathVariable int id) {

        Optional<cats> catRepo = Optional.ofNullable((catRepository.findById(id)));

        if (!catRepo.isPresent())
            return ResponseEntity.notFound().build();

        catsBody.setId(id);
        catRepository.save(catsBody);

        return ResponseEntity.noContent().build();
    }

}
