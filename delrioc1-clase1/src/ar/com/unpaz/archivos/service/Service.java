package ar.com.unpaz.archivos.service;
import java.util.List;
import ar.com.unpaz.archivos.model.Vial;

public interface Service {
	public List<Vial> MostrarViales();
	public Vial ObtenerVial(int Id);
	public void Imprimir();
}
