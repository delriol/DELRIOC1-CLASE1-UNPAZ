package ar.com.unpaz.archivos.daoimp;
import ar.com.unpaz.archivos.DAO.LecturayEscritura;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

public abstract class LecturaYEscrituraimp implements LecturayEscritura {
	public void Lectura (String[] args) {
		File sFile = new File("C:\\\\Users\\\\leand\\\\OneDrive\\\\Documentos\\\\GitHub\\\\delrioc1-clase1/vial.csv");
		Scanner s = null;

		try {
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(sFile);

			while (s.hasNextLine()) {
				String linea = s.nextLine(); 
				System.out.println(linea);  
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
	public void Escritura (String[] args)  {

		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };
		Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\\\\\\\Users\\\\\\\\leand\\\\\\\\OneDrive\\\\\\\\Documentos\\\\\\\\GitHub\\\\\\\\delrioc1-clase1/vial2.csv"), "UTF-8"));

			for (String linea : lineas) {
				try {
					out.write(linea+"\n");
				} catch (IOException ex) {
					System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
				}
			}

		} catch (UnsupportedEncodingException | FileNotFoundException ex2) {
			System.out.println("Mensaje error 2: " + ex2.getMessage());
		} finally {
			try {
				out.close();
			} catch (IOException ex3) {
				System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
			}
		}
	}
	}



