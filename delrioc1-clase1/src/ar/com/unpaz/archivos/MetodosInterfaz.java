package ar.com.unpaz.archivos;
import java.util.List;

import ar.com.unpaz.archivos.interfaz.Interfaz;
import ar.com.unpaz.archivos.model.Vial;

public class MetodosInterfaz implements Interfaz {
	List<Vial> Vial;
	public List<Vial>  MostrarViales() {
		return Vial;
	}
	public Vial obtenerVial(int Id) {
		return Vial.get(Id);
	}
	@Override
	public ar.com.unpaz.archivos.model.Vial ObtenerVial(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
