package com.daw.services.dto;

import com.daw.persistences.entities.Tarea;
import com.daw.persistences.entities.enums.Estado;
import com.daw.persistences.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> getTareas(){
        return this.tareaRepository.findAll("PENDIENTE");
    }

    public Optional<Tarea> getTarea(int idTarea){
        return this.tareaRepository.findById(idTarea);
    }

    //titulo
    //Descripcion
    //fecha vencimiento

    //fecha creacion -> hoy
    //estado -> PENDIENTE
    public Tarea crearTarea(Tarea tarea){
    tarea.setEstado(Estado.PENDIENTE);
    tarea.setFechaCreacion(LocalDate.now());

    return this.tareaRepository.save(tarea);
    }

    public Tarea actualizarTarea(Tarea tarea) {
        return this.tareaRepository.save(tarea);
    }

    public boolean borrarTarea(int idTarea){
        boolean result = false;

        if(this.tareaRepository.findById(idTarea).isPresent()){
            this.tareaRepository.deleteById(idTarea);
            result = true;
        }
        return result;
    }
    public Tarea obtenerTarea(Estado estado){
        return (Tarea) this.tareaRepository.findAll(String.valueOf(Estado.PENDIENTE));
    }

}
