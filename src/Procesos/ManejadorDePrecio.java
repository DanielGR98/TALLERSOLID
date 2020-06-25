package Procesos;

import java.util.ArrayList;

import Adicionales.Aderezo;
import Postres.*;

public class ManejadorDePrecio {
    ArrayList<Aderezo> aderezos;
    double precioFinal;
    double precioPastel = 15.55;
    double precioHelado = 7.85;
    
    //Resibe como parametro un objeto de tipo postre para validar si hace el calculo de un Pastel o Helado
	public double calcularPrecioFinal(Object postre){
		 if(postre.getClass() == Pastel.class) {
			 precioFinal=(precioPastel + (precioPastel * 0.12))+(aderezos.size()*0.50);
		     return precioFinal; 
		 }else {
			 precioFinal=(precioHelado + (precioHelado * 0.12))+(aderezos.size()*0.50);
		     return precioFinal;
		 }
			
	}
	
	//recibe como parametro el tipo de postre para presentar por pantalla el precio
	public String showPrecioFinal( Object postre){
		
		 return "Precio Final: $ " + calcularPrecioFinal(postre.getClass());	 
	 
	}
	 
	public ArrayList<Aderezo> getAderezos() {
	        return aderezos;
	}
	
	// se aplico principio de Unica Responsabilidad, ya que esta clase solo tiene una razon y es que su metodo de calculo se modifique//
}
