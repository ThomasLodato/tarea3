package tarea;

import java.util.ArrayList;


public class Impresora implements Observer{
    String nombre;
    
    public Impresora(){
        
    }
    
    public Impresora(String nombre){
        this.nombre = nombre;
    }
    
    public void verificarArchivo(ArrayList<Archivo> a){
        for ( int i = 0; i < a.size(); i++ ){
            if (nombre.compareTo(a.get(i).impresora) == 0)
                System.out.println(nombre + ": " + a.get(i).nombre);
        }
    }
    
    public void obtenerTrabajosEnCola(ArrayList<Archivo> a){
        int c = 0;
        for ( int i = 0; i < a.size(); i++ ){
            if (nombre.compareTo(a.get(i).impresora) == 0)
                c++;
        }
        System.out.println("la impresora "+ nombre + " posee :" + c + 
                " archivos en cola");
    }
    
    public void obtenerTrabajoParaImprimir(){
        
    }
    
    public void pausarImpresion(){
        
    }
    
    public void estaImprimiendo(){
        
    }
    
    public void actualizar(Object object){
        if (object instanceof CentroDeImpresion){
            CentroDeImpresion centro = (CentroDeImpresion) object;
            verificarArchivo(centro.getArchivos());
            obtenerTrabajosEnCola(centro.getArchivos());
        }
    }
}
