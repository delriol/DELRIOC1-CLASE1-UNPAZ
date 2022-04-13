package ar.com.unpaz.archivos.serviceimp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import ar.com.unpaz.archivos.model.Vial;
import ar.com.unpaz.archivos.service.Service;


public class MetodosService implements Service {
	
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
	public void Imprimir() {

		File sFile = new File("C:\\Users\\leand\\OneDrive\\Documentos\\GitHub\\delrioc1-clase1\\vial.csv");
		FileReader sFileReader = null;
		try {
			sFileReader = new FileReader(sFile);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		BufferedReader bufferedReader = new BufferedReader(sFileReader);
		String linea = "";
		List<Vial> sList = new ArrayList<Vial>();
		
		try {
			try {
				while((linea = bufferedReader.readLine()) != null) {
						String [] array = linea.split(",");
						Vial sVial = new Vial(Integer.parseInt(array[0]),array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4]));
						sList.add(sVial);
					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//System.out.println("NºHOJA"+" "+"TIPO OBJETO"+" "+"IDENTIFICADOR TRAMO"+" "+"TIPO CAMINO"+" "+"Km");
		
			for (Vial vial : sList) {
				System.out.println("NºHOJA/"+" "+"/TIPO-OBJETO"+" "+"/IDENTIFICADOR-TRAMO"+"  "+"/TIPO-CAMINO"+"     "+"/KM");	
				System.out.println(vial.getId()+"     "+vial.getDescripcion() +"            "+vial.getNumero()+"        "+vial.getRuta()+"   "+ vial.getKm());
			}
		

	}

}
