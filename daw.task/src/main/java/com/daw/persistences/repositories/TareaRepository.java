package com.daw.persistences.repositories;

import com.daw.persistences.crud.TareaCrudRepository;
import com.daw.persistences.entities.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TareaRepository {

    @Autowired
    private TareaCrudRepository tareaCrudRepository;


    public List<Tarea> findAll(String pendiente){
        return (List<Tarea>) this.tareaCrudRepository.findAll();
    }

    public Optional<Tarea> findById(int idTarea){
        return this.tareaCrudRepository.findById(idTarea);
    }

    public Tarea save(Tarea tarea){
        return this.tareaCrudRepository.save(tarea);
    }

    public void deleteById(int idTarea){
        this.tareaCrudRepository.deleteById(idTarea);
    }

}
