import java.util.*;

public class Red {
	private String nombre;
	private Vector<Usuario> miembros;
	private Vector<Relacion> amistades;

	public Red(String n, Vector<Usuario> m, Vector<Relacion> r) {

		nombre = n;
		miembros = m;
		amistades = r;

	}

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Vector<Usuario> getMiembros() {
		return miembros;
	}


	public void setMiembros(Vector<Usuario> miembros) {
		this.miembros = miembros;
	}


	public Vector<Relacion> getAmistades() {
		return amistades;
	}


	public void setAmistades(Vector<Relacion> amistades) {
		this.amistades = amistades;
	}


	public String toString() {
		
		return nombre + " " + miembros.toString() + " " + amistades.toString();
		
		
	}

}