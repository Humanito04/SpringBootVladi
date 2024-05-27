package com.daw.persistences.crud;

import com.daw.persistences.entities.Tarea;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TareaCrudRepository extends CrudRepository<Tarea, Integer> {
}
