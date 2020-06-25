/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leche;

/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada implements LecheEntera {
    
    @Override
    public void usarHelado() {
        System.out.println("Usando leche deslactosada");
    }
        
    @Override
    public void usarPastel() {
        System.out.println("No se puede usar esta leche");
    }
}
