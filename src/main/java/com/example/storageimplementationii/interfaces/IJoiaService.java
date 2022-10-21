package com.example.storageimplementationii.interfaces;

import com.example.storageimplementationii.models.Joia;

public interface IJoiaService {
    Iterable<Joia> getAll();
    Joia getById(long id);
    Joia save(Joia joia);
    void delete(long id);
    Joia update(Joia joia);
}
