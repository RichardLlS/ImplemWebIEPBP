package pe.edu.certus.blaspascal.iepblaspascal.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pe.edu.certus.blaspascal.iepblaspascal.data.Alumno;
import pe.edu.certus.blaspascal.iepblaspascal.data.AlumnoRepository;
import pe.edu.certus.blaspascal.iepblaspascal.entity.AlumnoData;
import pe.edu.certus.blaspascal.iepblaspascal.services.AlumnoServices;

@Controller
public class BlasController {
	@Autowired
	private AlumnoServices alumnoServices;
	
	@GetMapping("/primergradoa")
	public String P1gradoap(@RequestParam(name="idalumno", required=false, defaultValue="1") Long idalumno, Model model) {
		AlumnoData bean = new AlumnoData();
		Optional<Alumno> a = this.alumnoServices.obtenerAlumno(idalumno);
		if (!a.isEmpty()) {
			bean.setIdalumno(a.get().getIdalumno());
			bean.setIdgrado(a.get().getIdgrado());
			bean.setNombre(a.get().getNombre());
			bean.setAppaterno(a.get().getAppaterno());
			bean.setApmaterno(a.get().getApmaterno());
			bean.setDni(a.get().getDni());
			bean.setFechnac(a.get().getFechnac());
			bean.setSexo(a.get().getSexo());
			bean.setUsuario(a.get().getUsuario());
			bean.setClave(a.get().getClave());
			bean.setDireccion(a.get().getDireccion());
			bean.setApoderado(a.get().getApoderado());
			bean.setTelapoderado(a.get().getTelapoderado());
			model.addAttribute("mensaje","OK");
			model.addAttribute("Alumno", bean);
		}else {
			model.addAttribute("mensaje","No existe Estudiante con el ID");
		}
		return "primergradoa";
	}
	@GetMapping("/newAlumno")
	public String NewAlumno(Model model) {
		model.addAttribute("mesaje","OK");
		model.addAttribute("Alumno", new AlumnoData());
		return "newalumno";
	}
	@PostMapping("/guardar")
	public String SaveAlumno(@ModelAttribute AlumnoData alumno) {
		System.out.println(alumno);
		Alumno a = new Alumno();
		a.setIdgrado(alumno.getIdgrado());
		a.setNombre(alumno.getNombre());
		a.setAppaterno(alumno.getAppaterno());
		a.setApmaterno(alumno.getApmaterno());
		a.setDni(alumno.getDni());
		a.setFechnac(alumno.getFechnac());
		a.setSexo(alumno.getSexo());
		a.setUsuario(alumno.getUsuario());
		a.setClave(alumno.getClave());
		a.setDireccion(alumno.getDireccion());
		a.setApoderado(alumno.getApoderado());
		a.setTelapoderado(alumno.getTelapoderado());
		alumnoServices.guardarAlumno(a);
		return "redirect:/1gradoap";
	}
	@PostMapping("/modificar")
	public String ModifyAlumno(@ModelAttribute AlumnoData alumno) {
		System.out.println(alumno);
		Alumno a = new Alumno();
		a.setIdgrado(alumno.getIdgrado());
		a.setNombre(alumno.getNombre());
		a.setAppaterno(alumno.getAppaterno());
		a.setApmaterno(alumno.getApmaterno());
		a.setDni(alumno.getDni());
		a.setFechnac(alumno.getFechnac());
		a.setSexo(alumno.getSexo());
		a.setUsuario(alumno.getUsuario());
		a.setClave(alumno.getClave());
		a.setDireccion(alumno.getDireccion());
		a.setApoderado(alumno.getApoderado());
		a.setTelapoderado(alumno.getTelapoderado());
		alumnoServices.guardarAlumno(a);
		return "redirect:/1gradoap?id="+a.getIdalumno();
	}
}
