/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmueble;

/**
 *
 * @author Estudiante
 */
public class ConstLocalComer extends Superficie {

    public ConstLocalComer(String alquiler, String inmueble, double precioMetroCuad) {
        super(alquiler, inmueble, precioMetroCuad);
    }
    
    @Override
    public String muestraDatos () {   
        
        return "Inmueble:" + inmueble + "\n Alquiler: " + alquiler + "\n Precio:" + precioMetroCuad;
    } 
    
}
