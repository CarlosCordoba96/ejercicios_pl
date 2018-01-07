import java.util.Date;

class Usuario {

	private String nombre;
	private String password;
	private Date fecha;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario(String nombre, String password, Date fecha) {

		this.nombre = nombre;
		this.password = password;
		this.fecha = fecha;
	}

	public String toString() {

		return nombre + " " + password + " " + fecha;
	}
}