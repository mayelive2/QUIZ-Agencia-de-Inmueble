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
public class ConstrucVivienda extends Construcciones {

    protected int numeroHabi;
    protected int numeroPiso;

    public ConstrucVivienda(int numeroHabi, int numeroPiso, String constNuevas, String constSegMano, String inmueble, double precio) {
        super(constNuevas, constSegMano, inmueble, precio);
        this.numeroHabi = numeroHabi;
        this.numeroPiso = numeroPiso;
    }
    
    @Override
    public String muestraDatos (){
        
        return "Inmueble: "+ inmueble +"\n Constryccion Nueva: "+ constNuevas +"\n Construccion Segunda Mano:" + constSegMano +"\n Precio:"+ precio +
                "\n Numero de Habitacion: "+ numeroHabi +"\n Numero de Piso: "+ numeroPiso;
    }

    public int getNumeroHabi() {
        return numeroHabi;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    
    
    

}
