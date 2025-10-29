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
@Table(name = "alumno", schema = "academia")
@ToString
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alumno_id", nullable = false)
    private Long id;


    private String nombre;


    private String email;


    private String telefono;


    private LocalDate fechaAlta;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "alumno_id")
    private Set<Matricula> matriculas = new LinkedHashSet<>();

}