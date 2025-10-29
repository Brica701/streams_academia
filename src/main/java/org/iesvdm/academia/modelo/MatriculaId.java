package org.iesvdm.academia.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
@ToString
public class MatriculaId implements Serializable {
    private static final long serialVersionUID = 8982497135665319125L;
    @Column(name = "alumno_id", nullable = false)
    private Long alumnoId;

    @Column(name = "curso_id", nullable = false)
    private Long cursoId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MatriculaId entity = (MatriculaId) o;
        return Objects.equals(this.alumnoId, entity.alumnoId) &&
                Objects.equals(this.cursoId, entity.cursoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alumnoId, cursoId);
    }

}