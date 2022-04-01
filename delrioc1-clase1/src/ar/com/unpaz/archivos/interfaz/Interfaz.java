package ar.com.unpaz.archivos.interfaz;
import java.util.List;
import ar.com.unpaz.archivos.model.Vial;

public interface Interfaz {
	public List<Vial> MostrarViales();
	public Vial ObtenerVial(int Id);
}
