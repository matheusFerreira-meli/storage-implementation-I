package com.example.storageimplementationii.controllers;

import com.example.storageimplementationii.interfaces.IJoiaService;
import com.example.storageimplementationii.models.Joia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("joia")
public class JoiaController {

    @Autowired
    private IJoiaService service;

    @GetMapping
    ResponseEntity<Iterable<Joia>> getAll() {
        Iterable<Joia> joias = service.getAll();

        return ResponseEntity.ok(joias);
    }

    @GetMapping("/{id}")
    ResponseEntity<Joia> getById(@PathVariable long id) {
        Joia joia = service.getById(id);

        return ResponseEntity.ok(joia);
    }

    @PostMapping
    ResponseEntity<Joia> save(@RequestBody Joia joia) {
        Joia joiaCriada = service.save(joia);

        return new ResponseEntity<>(joiaCriada, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable long id) {
        service.delete(id);

        return ResponseEntity.noContent().build();
    }

    @PutMapping()
    ResponseEntity<Joia> update(@RequestBody Joia joia) {
        Joia joiaAtualizada = service.update(joia);

        return ResponseEntity.ok(joiaAtualizada);
    }
}
