package com.example.storageimplementationii.services;

import com.example.storageimplementationii.interfaces.IJoiaService;
import com.example.storageimplementationii.models.Joia;
import com.example.storageimplementationii.repositories.JoiaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class JoiaService implements IJoiaService {

    @Autowired
    private JoiaRepo repo;

    @Override
    public Iterable<Joia> getAll() {
        return repo.findAll();
    }

    @Override
    public Joia getById(long id) {
        Optional<Joia> joia = repo.findById(id);

        return joia.get();
    }

    @Override
    public Joia save(Joia joia) {
        return repo.save(joia);
    }

    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }

    @Override
    public Joia update(Joia joia) {
        return repo.save(joia);
    }
}
