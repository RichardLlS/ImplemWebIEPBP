package pe.edu.certus.blaspascal.iepblaspascal.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="IdAlumno")
	private long idalumno;
	@Column(name="IdGrado")
	private long idgrado;
	@Column(name="Nombre")
	private String nombre;
	@Column(name="ApPaterno")
	private String appaterno;
	@Column(name="ApMaterno")
	private String apmaterno;
	@Column(name="Dni")
	private String dni;
	@Column(name="FechNac")
	private String fechnac;
	@Column(name="Sexo")
	private String sexo;
	@Column(name="Usuario")
	private String usuario;
	@Column(name="Clave")
	private String clave;
	@Column(name="Direccion")
	private String direccion;
	@Column(name="Apoderado")
	private String apoderado;
	@Column(name="TelApoderado")
	private String telapoderado;
	
	public long getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(long idalumno) {
		this.idalumno = idalumno;
	}
	public long getIdgrado() {
		return idgrado;
	}
	public void setIdgrado(long idgrado) {
		this.idgrado = idgrado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAppaterno() {
		return appaterno;
	}
	public void setAppaterno(String appaterno) {
		this.appaterno = appaterno;
	}
	public String getApmaterno() {
		return apmaterno;
	}
	public void setApmaterno(String apmaterno) {
		this.apmaterno = apmaterno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getFechnac() {
		return fechnac;
	}
	public void setFechnac(String fechnac) {
		this.fechnac = fechnac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getApoderado() {
		return apoderado;
	}
	public void setApoderado(String apoderado) {
		this.apoderado = apoderado;
	}
	public String getTelapoderado() {
		return telapoderado;
	}
	public void setTelapoderado(String telapoderado) {
		this.telapoderado = telapoderado;
	}
	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", idgrado=" + idgrado + ", nombre=" + nombre + ", appaterno="
				+ appaterno + ", apmaterno=" + apmaterno + ", dni=" + dni + ", fechnac=" + fechnac + ", sexo=" + sexo
				+ ", usuario=" + usuario + ", clave=" + clave + ", direccion=" + direccion + ", apoderado=" + apoderado
				+ ", telapoderado=" + telapoderado + "]";
	}
	
}
	