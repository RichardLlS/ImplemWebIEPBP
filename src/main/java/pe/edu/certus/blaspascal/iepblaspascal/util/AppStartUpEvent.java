package pe.edu.certus.blaspascal.iepblaspascal.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import pe.edu.certus.blaspascal.iepblaspascal.data.*;

@Component
public class AppStartUpEvent implements ApplicationListener<ApplicationReadyEvent>{
	//private final AlumnoRepository alumnoRepository;
	
	public AppStartUpEvent(AlumnoRepository alumnoRepository) {
		//this.alumnoRepository = alumnoRepository;
	}
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub
		//Iterable<Alumno> alumnos = this.alumnoRepository.findAll();
		//alumnos.forEach(System.out::println);
	}

}
