package org.iesvdm.academia.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "matricula", schema = "academia")
@ToString
public class Matricula {
    @EmbeddedId
    private MatriculaId id;

    @MapsId("alumnoId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "alumno_id", nullable = false)
    @ToString.Exclude
    private Alumno alumno;

    @MapsId("cursoId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "curso_id", nullable = false)
    @ToString.Exclude
    private Curso curso;


    private LocalDate fechaMatricula;


    private Double precioPagado;


    private Double descuentoPct;


    private Double notaFinal;

    @Lob
    private String observaciones;

}