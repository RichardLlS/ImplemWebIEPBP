package pe.edu.certus.blaspascal.iepblaspascal.entity;

import lombok.Data;

@Data
public class AlumnoData {
	private long idalumno;
	private long idgrado;
	private String nombre;
	private String appaterno;
	private String apmaterno;
	private String dni;
	private String fechnac;
	private String sexo;
	private String usuario;
	private String clave;
	private String direccion;
	private String apoderado;
	private String telapoderado;
}
