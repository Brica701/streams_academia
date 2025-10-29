package org.iesvdm.academia.modelo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "curso", schema = "academia")
@ToString
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curso_id", nullable = false)
    private Long id;


    private String titulo;


    private Double precioBase;


    private Integer horas;


    private LocalDate inicio;


    private LocalDate fin;


    private Integer cupo;

    @OneToMany(fetch =  FetchType.EAGER)
    @JoinColumn(name = "curso_id")
    private Set<Matricula> matriculas = new LinkedHashSet<>();

}