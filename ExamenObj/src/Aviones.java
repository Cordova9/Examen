import java.util.ArrayList;
import java.util.List;

public class Aviones {
	private String modelo;
	private String tipo_vuelo;

	
	
	public Aviones(String modelo, String tipo_vuelo) {
		super();
		this.modelo = modelo;
		this.tipo_vuelo = tipo_vuelo;
		
	}
	public Aviones() {
		modelo = "Boeing 747";
		tipo_vuelo = "Internacional";
		
	}
	

	public void Imprimir() {
		System.out.println(">Modelo: " + modelo + "<");
		System.out.println("----TIPO DE VUELO " + tipo_vuelo + "------");

	}
}
