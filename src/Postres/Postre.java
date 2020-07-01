package Postres;

import java.util.ArrayList;

import Adicionales.Aderezo;

public class Postre {
	String tipo;
  	ArrayList<Aderezo> aderezos;
	
  	

	public ArrayList<Aderezo> getAderezos() {
	        return aderezos;
	}
	
    
	public static void addAderezos(Postre postre,Aderezo aderezo){
        	postre.getAderezos().add(aderezo);
    }
    
	public static void quitarAderezo(Postre postre,Aderezo aderezo){
            postre.getAderezos().remove(aderezo);
    }


	@Override
	public String toString() {
		return "Postre tipo=" + tipo ;
	}
	    
	
}
