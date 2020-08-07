package upeu.edu.pe.ExaHelmerM.Entity;

public class Libro {
	private int idlibro;
	private String nombre;
	private String nombre_autor;
	private String editorial;
	private String fecha_lanzamiento;
	public Libro() {
		super();
	}
	public Libro(int idlibro, String nombre, String nombre_autor, String editorial, String fecha_lanzamiento) {
		super();
		this.idlibro = idlibro;
		this.nombre = nombre;
		this.nombre_autor = nombre_autor;
		this.editorial = editorial;
		this.fecha_lanzamiento = fecha_lanzamiento;
	}
	public int getIdlibro() {
		return idlibro;
	}
	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre_autor() {
		return nombre_autor;
	}
	public void setNombre_autor(String nombre_autor) {
		this.nombre_autor = nombre_autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}
	public void setFecha_lanzamiento(String fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}
	

}
