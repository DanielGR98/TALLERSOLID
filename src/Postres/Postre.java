package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	double precioFinal;
    double precioParcial;
	ArrayList<Aderezo> aderezos;
	 public double calcularPrecioFinal(){
		precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
	        return precioFinal;
	    }
	    public ArrayList<Aderezo> getAderezos() {
	        return aderezos;
	    }
	    public String showPrecioFinal(){
	        return "Precio Final: $ " + calcularPrecioFinal();
	    }
            public static void anadirAderezo(Postre postre,Aderezo aderezo){
            postre.getAderezos().add(aderezo);
            }
    
            public static void quitarAderezo(Postre postre,Aderezo aderezo){
            postre.getAderezos().remove(aderezo);
            }
	    
}
