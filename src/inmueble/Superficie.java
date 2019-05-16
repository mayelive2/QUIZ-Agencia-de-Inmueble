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
public class Superficie {

    protected double precioMetroCuad;
    protected String alquiler;
    protected String inmueble;

    public Superficie(String alquiler, String inmueble, double precioMetroCuad) {
        this.precioMetroCuad = precioMetroCuad;
        this.alquiler = alquiler;
        this.inmueble = inmueble;
    }

    public String muestraDatos() {

        return "Inmueble:" + inmueble + "\n Alquiler: " + alquiler + "\n Precio:" + precioMetroCuad;

    }

    public double getPrecioMetroCuad() {
        return precioMetroCuad;
    }

    public void setPrecioMetroCuad(double precioMetroCuad) {
        this.precioMetroCuad = precioMetroCuad;
    }

    public String getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(String alquiler) {
        this.alquiler = alquiler;
    }

    public String getInmueble() {
        return inmueble;
    }

    public void setInmueble(String inmueble) {
        this.inmueble = inmueble;
    }

}
