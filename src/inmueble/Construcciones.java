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
public class Construcciones {

    protected String constNuevas;
    protected String constSegMano;
    protected String inmueble;
    protected double precio;

    public Construcciones(String constNuevas, String constSegMano, String inmueble, double precio) {
        this.constNuevas = constNuevas;
        this.constSegMano = constSegMano;
        this.inmueble = inmueble;
        this.precio = precio;
    }
    
    public String muestraDatos (){
        
        return "Inmueble: "+ inmueble +"\n Constryccion Nueva: "+ constNuevas +"\n Construccion Segunda Mano:" + constSegMano +"\n Precio:"+ precio;
    }

    public String getConstNuevas() {
        return constNuevas;
    }

    public void setConstNuevas(String constNuevas) {
        this.constNuevas = constNuevas;
    }

    public String getConstSegMano() {
        return constSegMano;
    }

    public void setConstSegMano(String constSegMano) {
        this.constSegMano = constSegMano;
    }

    public String getInmueble() {
        return inmueble;
    }

    public void setInmueble(String inmueble) {
        this.inmueble = inmueble;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    

}
