
public class Aereopuerto {
	private String nombre;
	private String ciudad;
	Vuelos vuelos;

	public Aereopuerto() {
		nombre = "Jorge Savez";
		ciudad = "Lima";
	}
	public Aereopuerto(String nombre,String ciudad) {
		this.nombre=nombre;
		this.ciudad=ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Vuelos getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelos vuelos) {
		this.vuelos = vuelos;
	}

	public void Imprimir() {
		System.out.println("AEREOPUERTO " + nombre);
		System.out.println("-ciudad: " + ciudad);
	}

}
