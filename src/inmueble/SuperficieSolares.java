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
public class SuperficieSolares extends Construcciones {
    
    protected String zonaRustica;
    protected String zonaUrbana;
    protected String venta;

    public SuperficieSolares(String zonaRustica, String zonaUrbana, String venta, String constNuevas, String constSegMano, String inmueble, double precio) {
        
        super(constNuevas, constSegMano, inmueble, precio);
        this.zonaRustica = zonaRustica;
        this.zonaUrbana = zonaUrbana;
        this.venta = venta;
    }
    
    @Override
    public String muestraDatos (){
        
        return "Inmueble: "+ inmueble +"\n Constryccion Nueva: "+ constNuevas +"\n Construccion Segunda Mano:" + constSegMano +"\n Precio:"+ precio +
                "\n Zona Rustica: "+ zonaRustica +"\n Zona Urbana: "+ zonaUrbana +"\n Venta: "+ venta;
    }

    public String getZonaRustica() {
        return zonaRustica;
    }

    public String getZonaUrbana() {
        return zonaUrbana;
    }

    public String getVenta() {
        return venta;
    }

   
    
    
    
    
}
