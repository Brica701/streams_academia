package org.iesvdm.academia;

import org.iesvdm.academia.modelo.Alumno;
import org.iesvdm.academia.modelo.Curso;
import org.iesvdm.academia.modelo.Matricula;
import org.iesvdm.academia.repositorio.AlumnoRepository;
import org.iesvdm.academia.repositorio.CursoRepository;
import org.iesvdm.academia.repositorio.MatriculaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.List;

@SpringBootTest
class AcademiaApplicationTests {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Test
    void testAlumnos() {

        alumnoRepository.findAll().forEach(System.out::println);

    }

    @Test
    void testCursos() {

        cursoRepository.findAll().forEach(System.out::println);

    }

    @Test
    void testMatriculas() {

        matriculaRepository.findAll().forEach(System.out::println);

    }

    /**
     *  1. Devuelve un listado de todos los cursos que se realizaron con fecha de inicio y fin durante el año 2025,
     *   cuya precio base sea superior a 500€.
     *
     */
    @Test
    void test1() {
        List<Curso> cursos = cursoRepository.findAll();


    }

    /**
     * 2. Devuelve un listado de todos los alumnos que NO se han matriculado en ningún curso.
     */
    @Test
    void test2() {
        List<Alumno> alumnos = alumnoRepository.findAll();


    }

    /**
     *  3. Devuelve una lista de los id's, nombres y emails de los alumnos que no tienen el teléfono registrado.
     *  El listado tiene que estar ordenado inverso alfabéticamente por nombre (z..a)
     */
    @Test
    void test3() {
        List<Alumno> alumnos = alumnoRepository.findAll();


    }

    /**
     * 4. Devuelva un listado con los id's y emails de los alumnos que se hayan registrado con una cuenta de yahoo.es
     * en el año 2024.
     *
     */
    @Test
    void test4() {
        List<Alumno> alumnos = alumnoRepository.findAll();


    }

    /**
     * 5. Devuelva un listado de los alumnos cuyo primer apellido es Martín. El listado tiene que estar ordenado
     * por fecha de alta en la academia de más reciente a menos reciente y nombre y apellidos en orden alfabético.
     */
    @Test
    void test5() {
        List<Alumno> alumnos = alumnoRepository.findAll();


    }

    /**
     * 6. Devuelva gasto total (pagado) que ha realizado la alumna Claudia López Rodríguez en cursos en la academia.
     *
     */
    @Test
    void test6() {
        List<Alumno> alumnos = alumnoRepository.findAll();


    }

    /**
     * 7. Devuelva el listado de los 3 cursos de menor importe base.
     *
     */
    @Test
    void test7() {
        List<Curso> cursos = cursoRepository.findAll();


    }

    /**
     * 8. Devuelva el curso al que se le ha aplicado el mayor descuento en cuantía para una matrícula
     * (no tiene por qué ser de descuento porcentual) sobre su precio base.
     *
     */
    @Test
    void test8() {
        List<Curso> cursos = cursoRepository.findAll();


    }

    /**
     *
     * 9. Devuelve los alumnos que hayan obtenido un 10 como nota final en algún curso del que se han matriculado.
     *
     *
     */
     @Test
     void test9() {
         List<Alumno> alumnos = alumnoRepository.findAll();



     }

    /**
     * 10. Devuelva el valor de la mínima nota obtenida en un curso.
     */
    @Test
    void test10() {
        List<Matricula> matriculas = matriculaRepository.findAll();


    }

    /**
     *  11. Devuelve un listado de los cursos que empiecen por A y terminen por t,
     *  y también los cursos que terminen por x.
     */
    @Test
    void test11() {
        List<Curso> cursos = cursoRepository.findAll();

    }

    /**
     * 12. Devuelve un listado que muestre todos los cursos en los que se ha matriculado cada alumno.
     * El resultado debe mostrar todos los datos del alumno primero junto con un sublistado de sus cursos.
     * El listado debe mostrar los datos de los clientes ordenados alfabéticamente por nombre.
     */
    @Test
    void test12() {
        List<Alumno> alumnos = alumnoRepository.findAll();

    }

    /**
     * 13. Devuelve el total de alumnos que podrían matricularse en la academia en base al cupo de los cursos.
     */
    @Test
    void test13() {
        List<Curso> curso = cursoRepository.findAll();


    }

    /**
     * 14. Calcula el número total de alumnos (diferentes) que tienen alguna matrícula.
     */
    @Test
    void test14() {
        List<Matricula> matriculas = matriculaRepository.findAll();

    }


    /**
     * 15. Devuelve el listado de cursos a los que se aplica un descuento porcentual (descuento_pct) superior al 10%
     */
    @Test
    void test15() {
        List<Matricula> matriculas = matriculaRepository.findAll();

    }


    /**
     * 16. Devuelve el nombre del alumno que pago la matrícula por curso de mayor cuantía.
     */
    @Test
    void test16() {
        List<Matricula> matriculas = matriculaRepository.findAll();

    }

    /**
     * 17. Devuelve los nombre de los alumnos que hayan sido compañeros en algún curso de la alumna Claudia López Rodríguez
     */
    @Test
    void test17() {
        List<Matricula> matriculas = matriculaRepository.findAll();

    }

    /**
     *
     * 18. Devuelve el total de lo ingresado por la academia en matriculas para el mes de enero de 2025.
     */
    @Test
    void test18() {
        List<Matricula> matriculas = matriculaRepository.findAll();


    }

    /**
     *  19. Devuelve el conteo de cuantos alumnos tienen la observación de 'Requiere apoyo' en los cursos matriculados.
     */
    @Test
    void test19() {
        List<Matricula> matriculas = matriculaRepository.findAll();

    }

    /**
     *  20. Devuelve cuánto se ingresaría por el curso de 'Desarrollo Backend con Java' si todo el cupo
     *  de alumnos estuviera matriculdo.
     */
    @Test
    void test20() {


    }


}
