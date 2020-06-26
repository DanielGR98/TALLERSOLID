package Procesos;

import java.util.ArrayList;

import Adicionales.Aderezo;
import Postres.*;

public class ManejadorDePrecio {
     static ArrayList<Aderezo> aderezos;
     static double precioFinal;
     static double precioPastel = 15.55;
     static double precioHelado = 7.85;
    
     public ManejadorDePrecio(){
         aderezos= new ArrayList<>();
         this.precioPastel=precioPastel;
         this.precioHelado = precioHelado;
         this.precioFinal = precioFinal;
     }
    //Resibe como parametro un objeto de tipo postre para validar si hace el calculo de un Pastel o Helado
	public  static double calcularPrecioFinal(double valor){
		  
			 precioFinal=(valor + (valor * 0.12))+(aderezos.size()*0.50);
			 return precioFinal;
			
	}
	
	//recibe como parametro el tipo de postre para presentar por pantalla el precio
	public static String showPrecioFinal( Object postre){
		if(postre.getClass() == Pastel.class){
			 return "Precio Final: $ " + calcularPrecioFinal(precioPastel);
        }else{
        	return "Precio Final: $ " + calcularPrecioFinal(precioHelado);
        }	 
	 
	}
	 
	public ArrayList<Aderezo> getAderezos() {
	        return aderezos;
	}
	
	// se aplico principio de Unica Responsabilidad, ya que esta clase solo tiene una razon y es que su metodo de calculo se modifique//
}
