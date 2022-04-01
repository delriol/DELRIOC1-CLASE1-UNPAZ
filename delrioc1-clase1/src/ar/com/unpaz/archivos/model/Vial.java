package ar.com.unpaz.archivos.model;

public class Vial {
	private int Id;
	private String Descripcion;
	private int Numero;
	private String Ruta;
	private int Km;
	
	public Vial(int Id,String Descripcion, int Numero, String Ruta, int Km) {
		this.Id = Id;
		this.Descripcion = Descripcion;
		this.Numero = Numero;
		this.Ruta = Ruta;
		this.Km = Km;
	}
	public Vial() {}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getRuta() {
		return Ruta;
	}
	public void setRuta(String ruta) {
		Ruta = ruta;
	}
	public int getKm() {
		return Km;
	}
	public void setKm(int km) {
		Km = km;
	}

}


	
