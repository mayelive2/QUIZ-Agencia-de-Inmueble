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
public class SuperPlazaGaraje extends Superficie {

    protected String garajePublico;
    protected String garajePrivado;

    public SuperPlazaGaraje(String garajePublico, String garajePrivado, String alquiler, String inmueble, double precioMetroCuad) {
        super(alquiler, inmueble, precioMetroCuad);

        this.garajePublico = garajePublico;
        this.garajePrivado = garajePrivado;

    }

    @Override
    public String muestraDatos() {

        return "Inmueble:" + inmueble + "\n Alquiler: " + alquiler + "\n Precio:" + precioMetroCuad
                + "\n Garaje Publico: " + garajePublico + "\n Garaje Privado: " + garajePrivado;
    }

    public String getGarajePublico() {
        return garajePublico;
    }

    public String getGarajePrivado() {
        return garajePrivado;
    }

}
