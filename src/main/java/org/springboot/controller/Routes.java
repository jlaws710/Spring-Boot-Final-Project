package org.springboot.controller;

import org.springboot.models.cats;
import org.springboot.repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class Routes {
    @Autowired
    private CatRepository catRepository;

               //Retrieves all data
    @GetMapping("/cats")
    public List<cats> list() {
        return catRepository.findAll();
    }

              //Retrieves selected Cat Id
    @GetMapping("/cats/{id}")
    public cats getCatsById(
            @PathVariable(value = "id") int id) {
        return catRepository.findById(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/cats")
    public void createCats(@RequestBody cats catsBody) {catRepository.save((catsBody));}

             //Delete Method
    @DeleteMapping("/cats/{id}")
    public void deleteCats(
            @PathVariable (value = "id") int id) {
        catRepository.deleteById(id);
    }

           //Update Method
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
