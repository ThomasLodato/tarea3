package tarea;

import java.util.ArrayList;


public class CentroDeImpresion implements Subject{
    
    private ArrayList<Archivo> archivos;
    
    private ArrayList<Observer> observers;
    
    public CentroDeImpresion(){
        archivos = new ArrayList<>();
        observers = new ArrayList<>();
    }
    
    public void agregarArchivo(Archivo archivo){
        archivos.add(archivo);
        Notificar();
    }
    
    public void imprimirArchivo(String nombreArchivo){
        
    }
    
    public ArrayList<Archivo> getArchivos(){
        return archivos;
    } 
    
    @Override
   public void Asignar(Observer o){
       observers.add(o);
   }
   
    @Override
   public void Desasignar(Observer o){
       observers.remove(o);
   }
   
    @Override
   public void Notificar(){
       for (int i = 0; i<observers.size(); i++){
           observers.get(i).actualizar(this);
       }
   }
}
