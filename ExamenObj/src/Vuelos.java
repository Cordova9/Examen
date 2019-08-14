import java.util.ArrayList;
import java.util.List;

public class Vuelos {
	String hora;
	Aviones aviones;
	Pilotos pilotos;
	Aviones avion;

	List<Pasajeros> registro_pasajeros;
	
	public Vuelos() {
		hora = "15:00";
		registro_pasajeros = new ArrayList<Pasajeros>();
		aviones = new Aviones();
		pilotos = new Pilotos();
		RegistroPasajeos();
	}
	public void RegistroPasajeos() {
		System.out.println(">>>>Registro de pasajeros<<<<");
		Pasajeros v1 = new Pasajeros();
		registro_pasajeros.add(v1);
		Pasajeros v2 = new Pasajeros();
		registro_pasajeros.add(v2);
		Pasajeros v3 = new Pasajeros();
		registro_pasajeros.add(v3);
		
		
		
	}
	public Vuelos(String hora, Aviones aviones) {
		super();
		this.hora = hora;
		this.aviones = aviones;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Aviones getAviones() {
		return aviones;
	}

	public void setAviones(Aviones aviones) {
		this.aviones = aviones;
	}

	public Pilotos getPilotos() {
		return pilotos;
	}

	public void setPilotos(Pilotos pilotos) {
		this.pilotos = pilotos;
	}

	public void Imprimir() {
		System.out.println("--Hora de vuelo: "+hora+"--");
		pilotos.Imprimir();
		ImprimirPasajeros();
		
	}
	public void ImprimirPasajeros() {
		for(Pasajeros variable :registro_pasajeros) {
			variable.Imprimir();
		}
		
		
	}

}
