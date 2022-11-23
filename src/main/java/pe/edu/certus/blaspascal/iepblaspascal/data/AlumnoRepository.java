package pe.edu.certus.blaspascal.iepblaspascal.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}
