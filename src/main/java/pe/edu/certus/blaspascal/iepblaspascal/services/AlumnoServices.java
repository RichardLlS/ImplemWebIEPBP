package pe.edu.certus.blaspascal.iepblaspascal.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.certus.blaspascal.iepblaspascal.data.Alumno;
import pe.edu.certus.blaspascal.iepblaspascal.data.AlumnoRepository;

@Service
public class AlumnoServices {

	@Autowired
	AlumnoRepository alumnoRepository;
	
	public Optional<Alumno> obtenerAlumno(Long id){
		return this.alumnoRepository.findById(id);
	}
	
	public void guardarAlumno(Alumno a) {
		alumnoRepository.save(a);
	}
}
