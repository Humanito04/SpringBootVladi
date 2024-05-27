package com.daw.persistences.entities;

import com.daw.persistences.entities.enums.Estado;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table (name = "tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo")
    private String titulo;

    private String descripcion;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimiento;
    @Enumerated(EnumType.STRING)
    private Estado estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
