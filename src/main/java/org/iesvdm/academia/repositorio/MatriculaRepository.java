package org.iesvdm.academia.repositorio;

import org.iesvdm.academia.modelo.Matricula;
import org.iesvdm.academia.modelo.MatriculaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, MatriculaId> {
}
