
package Principal;
import Postres.*;
import Procesos.*;

import java.util.ArrayList;

import Adicionales.Crema;
import Adicionales.Frutilla;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    /*public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        //OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.CREMA);
       // OperacionesAderezo.anadirAderezoHelado(helado_vainilla, Aderezo.FRUTILLA);
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        System.out.println(helado_vainilla.showPrecioFinal());
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
      //  OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, Aderezo.CREMA);
       // OperacionesAderezo.anadirAderezoPastel(pastel_chocolate, Aderezo.FRUTILLA);
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        System.out.println(helado_vainilla.showPrecioFinal());
    }*/
	public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        ArrayList<Postre> arrPostres = new ArrayList<>();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        ManejadorDePrecio mp = new ManejadorDePrecio();
        
        // Producir Helado
        Postre helado_vainilla = new Helado("Vainilla");
        arrPostres.add(helado_vainilla);
        // Producir Pastel
        Postre pastel_chocolate = new Pastel("Chocolate");
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            postre.addAderezos(postre,new Crema());
            postre.addAderezos(postre,new Frutilla());
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(new LecheDescremada(),postre);
            System.out.println(mp.showPrecioFinal(postre));
            System.out.println();
        });        
        
    }

}
